package com.elitsa.libraries.cinemaapp.ui.movie_list.mvvm

import androidx.lifecycle.LiveData
import com.elitsa.libraries.cinemaapp.app.models.Movie
import com.elitsa.libraries.cinemaapp.app.models.MovieCard
import com.elitsa.libraries.cinemaapp.app.network.adapters.MovieAdapter
import com.elitsa.libraries.cinemaapp.db.entities.MovieWithActors
import com.elitsa.libraries.cinemaapp.utils.base.RemoteErrorEmitter

class MovieListRepositoryImpl(private val remoteRepo: MovieListRepository.RemoteRepository,
    private val localRepo: MovieListRepository.LocalRepository) : MovieListRepository {

    override suspend fun getMovieListForCategory(remoteErrorEmitter: RemoteErrorEmitter,
                                                 category: String, page: Int): List<MovieCard>? {
        val response = remoteRepo.getMovieListForCategory(remoteErrorEmitter, category, page)
        val adapter = MovieAdapter()

        return adapter.fromMovieShortDetailListToMovieCardList(response)
    }

    override suspend fun convertMoviesWithActorToMoviesCard(movieWithActors: List<MovieWithActors>): List<MovieCard> {
        val adapter = MovieAdapter()
        return movieWithActors.map { adapter.movieWithActorsToMovieCard(it) }
    }

    override fun getSavedMovies(): LiveData<List<MovieWithActors>> = localRepo.getSavedMovies()

}