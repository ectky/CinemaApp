package com.elitsa.libraries.cinemaapp.ui.movie_list.mvvm

import com.elitsa.libraries.cinemaapp.app.network.api.MovieListApi
import com.elitsa.libraries.cinemaapp.app.network.models.movie_list.MovieListResponse
import com.elitsa.libraries.cinemaapp.utils.base.BaseRemoteRepository
import com.elitsa.libraries.cinemaapp.utils.base.RemoteErrorEmitter

class MovieListRemoteRepository(private val api: MovieListApi) : BaseRemoteRepository(),
    MovieListRepository.RemoteRepository {

    override suspend fun getMovieListForCategory(remoteErrorEmitter: RemoteErrorEmitter, category: String, page: Int): MovieListResponse? {
        return safeApiCall(remoteErrorEmitter){ api.getMovieListForCategory(category, page) }
    }
}