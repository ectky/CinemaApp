package com.elitsa.libraries.cinemaapp.ui.movie_list.mvvm

import androidx.lifecycle.LiveData
import com.elitsa.libraries.cinemaapp.app.models.Movie
import com.elitsa.libraries.cinemaapp.app.models.MovieCard
import com.elitsa.libraries.cinemaapp.app.network.models.movie_list.MovieListResponse
import com.elitsa.libraries.cinemaapp.db.entities.MovieWithActors
import com.elitsa.libraries.cinemaapp.utils.base.RemoteErrorEmitter

interface MovieListRepository {

    suspend fun getMovieListForCategory(remoteErrorEmitter: RemoteErrorEmitter, category: String, page: Int): List<MovieCard>?
    fun getSavedMovies(): LiveData<List<MovieWithActors>>
    suspend fun convertMoviesWithActorToMoviesCard(movieWithActors: List<MovieWithActors>): List<MovieCard>

    interface RemoteRepository {
        suspend fun getMovieListForCategory(remoteErrorEmitter: RemoteErrorEmitter, category: String, page: Int): MovieListResponse?
    }

    interface LocalRepository {
        fun getSavedMovies(): LiveData<List<MovieWithActors>>
    }

}