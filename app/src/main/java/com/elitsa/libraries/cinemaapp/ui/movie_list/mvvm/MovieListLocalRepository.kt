package com.elitsa.libraries.cinemaapp.ui.movie_list.mvvm

import androidx.lifecycle.LiveData
import com.elitsa.libraries.cinemaapp.db.entities.MovieWithActors
import com.elitsa.libraries.cinemaapp.utils.base.BaseLocalRepository

class MovieListLocalRepository : MovieListRepository.LocalRepository, BaseLocalRepository() {

    override fun getSavedMovies(): LiveData<List<MovieWithActors>> = database.moviesDao().getMoviesWithActors()
}