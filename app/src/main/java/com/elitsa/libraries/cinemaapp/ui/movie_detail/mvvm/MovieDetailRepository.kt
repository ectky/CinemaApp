package com.elitsa.libraries.cinemaapp.ui.movie_detail.mvvm

import androidx.lifecycle.LiveData
import com.elitsa.libraries.cinemaapp.app.models.Movie
import com.elitsa.libraries.cinemaapp.app.models.MovieWrapper
import com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.MovieDetailResponse
import com.elitsa.libraries.cinemaapp.db.entities.MovieEntity
import com.elitsa.libraries.cinemaapp.db.entities.MovieWithActors
import com.elitsa.libraries.cinemaapp.utils.base.RemoteErrorEmitter

interface MovieDetailRepository {

    suspend fun getMovieAndCast(remoteErrorEmitter: RemoteErrorEmitter, movieId: Int): Movie?
    suspend fun saveMovieToFavorites(movie: Movie)
    suspend fun deleteMovieFromFavorites(movie: Movie)

    interface RemoteRepository {
        suspend fun getMovieAndCast(remoteErrorEmitter: RemoteErrorEmitter, movieId: Int): MovieDetailResponse?
    }

    interface LocalRepository {
        suspend fun saveMovieToFavorites(movieWrapper: MovieWrapper)
        suspend fun deleteMovieFromFavorites(movieEntity: MovieEntity)
        suspend fun getMovie(movieId: Int): MovieEntity?
    }

}