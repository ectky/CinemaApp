package com.elitsa.libraries.cinemaapp.ui.movie_detail

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.elitsa.libraries.cinemaapp.R
import com.elitsa.libraries.cinemaapp.app.CinemaApp
import com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppComponent
import com.elitsa.libraries.cinemaapp.app.di.ViewModelFactory
import com.elitsa.libraries.cinemaapp.app.models.Movie
import com.elitsa.libraries.cinemaapp.databinding.ActivityMovieDetailBinding
import com.elitsa.libraries.cinemaapp.ui.movie_detail.di.DaggerMovieDetailComponent
import com.elitsa.libraries.cinemaapp.ui.movie_detail.mvvm.MovieDetailViewModel
import com.elitsa.libraries.cinemaapp.utils.Constants
import com.elitsa.libraries.cinemaapp.utils.base.BaseActivity
import com.kinesis.kinesisapp.utils.base.ScreenState
import javax.inject.Inject

class MovieDetailActivity : BaseActivity(), MovieDetailCallback {

    lateinit var binding: ActivityMovieDetailBinding
    @Inject lateinit var viewModelFactory: ViewModelFactory<MovieDetailViewModel>
    private val controller: MovieDetailController by lazy { MovieDetailController(this) }
    private val viewModel by viewModels<MovieDetailViewModel> { viewModelFactory }

    override fun initComponent(appComponent: CinemaAppComponent) {
        DaggerMovieDetailComponent.builder()
            .cinemaAppComponent(appComponent)
            .build()
            .inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initComponent(CinemaApp.appInstance.appComponent)
        binding = DataBindingUtil.setContentView(this,
            R.layout.activity_movie_detail)
        binding.lifecycleOwner = this
        binding.controller = controller
        binding.viewModel = viewModel
    }

    override fun onStart() {
        super.onStart()

        viewModel.mutableScreenState.observe(this, Observer {
            if(it != null && it == ScreenState.ERROR){
                showSnackErrorWithAction(R.string.try_again){
                    getMovieDetail()
                }
            }
        })

        viewModel.movieLiveData.observe(this, Observer {
            if(it != null){
                controller.setData(it)
            }
        })

        getMovieDetail()
    }

    private fun getMovieDetail(){
        val movie = intent.getParcelableExtra<Movie>(Constants.MOVIE_EXTRA)
        if(movie != null){
            viewModel.updateMovie(movie)
        }
        else{
            val id = intent.getIntExtra(Constants.MOVIE_ID, 0)
            viewModel.getMovieAndCast(id)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
    }

    override fun onBackButtonCallback() = onBackPressed()

    override fun onFavoriteCallback(movie: Movie, isFavorite: Boolean) {
        viewModel.updateMovie(movie, isFavorite)
    }
}
