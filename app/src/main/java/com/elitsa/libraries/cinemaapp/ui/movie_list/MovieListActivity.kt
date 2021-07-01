package com.elitsa.libraries.cinemaapp.ui.movie_list

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.core.view.ViewCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.elitsa.libraries.cinemaapp.R
import com.elitsa.libraries.cinemaapp.app.CinemaApp
import com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppComponent
import com.elitsa.libraries.cinemaapp.app.di.ViewModelFactory
import com.elitsa.libraries.cinemaapp.app.models.CategoryCard
import com.elitsa.libraries.cinemaapp.app.models.MovieCard
import com.elitsa.libraries.cinemaapp.databinding.ActivityMovieListBinding
import com.elitsa.libraries.cinemaapp.ui.movie_detail.MovieDetailActivity
import com.elitsa.libraries.cinemaapp.ui.movie_list.di.DaggerMovieListComponent
import com.elitsa.libraries.cinemaapp.ui.movie_list.mvvm.MovieListViewModel
import com.elitsa.libraries.cinemaapp.utils.Constants
import com.elitsa.libraries.cinemaapp.utils.ModelsFactory
import com.elitsa.libraries.cinemaapp.utils.base.BaseActivity
import com.elitsa.libraries.cinemaapp.utils.enums.Grid
import com.kinesis.kinesisapp.utils.base.ScreenState
import kotlinx.android.synthetic.main.activity_movie_list.*
import java.util.*
import javax.inject.Inject

class MovieListActivity : BaseActivity() {

    private lateinit var binding: ActivityMovieListBinding
    @Inject lateinit var viewModelFactory: ViewModelFactory<MovieListViewModel>
    private val viewModel by viewModels<MovieListViewModel>{
        viewModelFactory
    }
    private var isUserList = false

    override fun initComponent(appComponent: CinemaAppComponent) {
        DaggerMovieListComponent.builder()
            .cinemaAppComponent(appComponent)
            .build()
            .inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initComponent(CinemaApp.appInstance.appComponent)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_movie_list)
        binding.run {
            model = intent.getParcelableExtra(Constants.CATEGORY_CARD_ID)
            lifecycleOwner = this@MovieListActivity
            controller = MovieListController {  }
            navBtnClickListener  = View.OnClickListener {
                onBackPressed()
            }
            managerType = Grid
            viewModel = this@MovieListActivity.viewModel
        }

        ViewCompat.setTransitionName(movieListBackgroundIv, Constants.TRANSITION_CATEGORY_IMAGE_IV)
        ViewCompat.setTransitionName(movieListTitleTv, Constants.TRANSITION_CATEGORY_NAME_TV)
    }

    override fun onStart() {
        super.onStart()
        setupObservers()
        getMovies()
    }

    private fun setupObservers() {
        viewModel.mutableScreenState.observe(this, Observer {
            if(it != null && it == ScreenState.ERROR){
                showSnackErrorWithAction(R.string.try_again){
                    getMovies()
                }
            }
        })

        viewModel.movieList.observe(this, Observer {
            if(it != null && it.isNotEmpty()){
                binding.noMoviesTv.visibility = View.GONE
                val controller = MovieListController(this::onMovieCardClick)
                binding.controller = controller
                controller.setData(it)
            }
            if(it != null && it.isEmpty() && isUserList){
                binding.noMoviesTv.visibility = View.VISIBLE
            }
        })
    }

    private fun getMovies(){
        val cardModel: CategoryCard? = intent.getParcelableExtra(Constants.CATEGORY_CARD_ID)
        if(cardModel?.id == 0){
            isUserList = true
            viewModel.savedMoviesList.observe(this, Observer {
                if(it != null){
                    viewModel.updateMovieList(it)
                }
            })
        }
        else{
            val fixedTitle =  cardModel?.title?.toLowerCase(Locale.US)?.replace(" ", "_") ?: "popular"
            viewModel.getMovieListForCategory(fixedTitle)
        }
    }

    private fun onMovieCardClick(movieCard: MovieCard){
        val intent = Intent(this, MovieDetailActivity::class.java).apply {
            putExtra(Constants.MOVIE_ID, movieCard.id)
            if(isUserList)
                putExtra(Constants.MOVIE_EXTRA, movieCard.movie)
        }
        startActivity(intent)
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
    }
}
