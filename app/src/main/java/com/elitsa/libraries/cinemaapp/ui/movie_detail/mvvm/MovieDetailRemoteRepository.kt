package com.elitsa.libraries.cinemaapp.ui.movie_detail.mvvm

import com.elitsa.libraries.cinemaapp.app.network.api.MovieDetailApi
import com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.MovieDetailResponse
import com.elitsa.libraries.cinemaapp.utils.base.BaseRemoteRepository
import com.elitsa.libraries.cinemaapp.utils.base.RemoteErrorEmitter

class MovieDetailRemoteRepository(private val api: MovieDetailApi) :
    BaseRemoteRepository(), MovieDetailRepository.RemoteRepository {

    override suspend fun getMovieAndCast(remoteErrorEmitter: RemoteErrorEmitter, movieId: Int):
            MovieDetailResponse? {
        return safeApiCall(remoteErrorEmitter){ api.getMovieAndCredits(id = movieId) }
    }

}