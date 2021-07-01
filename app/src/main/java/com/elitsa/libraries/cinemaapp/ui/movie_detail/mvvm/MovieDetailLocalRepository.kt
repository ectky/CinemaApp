package com.elitsa.libraries.cinemaapp.ui.movie_detail.mvvm

import com.elitsa.libraries.cinemaapp.app.models.MovieWrapper
import com.elitsa.libraries.cinemaapp.db.entities.MovieEntity
import com.elitsa.libraries.cinemaapp.utils.base.BaseLocalRepository

class MovieDetailLocalRepository : MovieDetailRepository.LocalRepository, BaseLocalRepository() {

    override suspend fun saveMovieToFavorites(movieWrapper: MovieWrapper) {
        with(database){
            moviesDao().saveMovie(movieWrapper.movie)
            actorsDao().saveActors(movieWrapper.actors)
        }
    }

    override suspend fun deleteMovieFromFavorites(movieEntity: MovieEntity) {
        database.actorsDao().deleteActorsOfMovie(movieEntity.id)
        database.moviesDao().removeMovie(movieEntity)
    }

    override suspend fun getMovie(movieId: Int): MovieEntity? {
        return try {
            database.moviesDao().getSavedMovie(movieId)
        }catch (e: Exception){
            e.printStackTrace()
            null
        }
    }
}