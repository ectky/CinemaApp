package com.elitsa.libraries.cinemaapp.app.di

import com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppScope
import com.elitsa.libraries.cinemaapp.app.network.api.MovieDetailApi
import com.elitsa.libraries.cinemaapp.app.network.api.MovieListApi
import com.elitsa.libraries.cinemaapp.ui.movie_detail.mvvm.MovieDetailLocalRepository
import com.elitsa.libraries.cinemaapp.ui.movie_detail.mvvm.MovieDetailRemoteRepository
import com.elitsa.libraries.cinemaapp.ui.movie_detail.mvvm.MovieDetailRepository
import com.elitsa.libraries.cinemaapp.ui.movie_detail.mvvm.MovieDetailRepositoryImpl
import com.elitsa.libraries.cinemaapp.ui.movie_list.mvvm.MovieListLocalRepository
import com.elitsa.libraries.cinemaapp.ui.movie_list.mvvm.MovieListRemoteRepository
import com.elitsa.libraries.cinemaapp.ui.movie_list.mvvm.MovieListRepository
import com.elitsa.libraries.cinemaapp.ui.movie_list.mvvm.MovieListRepositoryImpl
import dagger.Module
import dagger.Provides
@Module
class RepositoriesModule {

    @Provides
    @CinemaAppScope
    fun movieListLocalRepo(): MovieListRepository.LocalRepository = MovieListLocalRepository()

    @Provides
    @CinemaAppScope
    fun movieListRemoteRepo(movieListApi: MovieListApi): MovieListRepository.RemoteRepository =
        MovieListRemoteRepository(movieListApi)

    @Provides
    @CinemaAppScope
    fun movieListRepo(remoteRepository: MovieListRepository.RemoteRepository,
                      localRepository: MovieListRepository.LocalRepository): MovieListRepository =
        MovieListRepositoryImpl(remoteRepository, localRepository)

    @Provides
    @CinemaAppScope
    fun movieDetailLocalRepo(): MovieDetailRepository.LocalRepository = MovieDetailLocalRepository()

    @Provides
    @CinemaAppScope
    fun movieDetailRemoteRepo(movieDetailApi: MovieDetailApi): MovieDetailRepository.RemoteRepository = MovieDetailRemoteRepository(movieDetailApi)

    @Provides
    @CinemaAppScope
    fun movieDetailRepo(remoteRepository: MovieDetailRepository.RemoteRepository,
                        localRepository: MovieDetailRepository.LocalRepository): MovieDetailRepository =
        MovieDetailRepositoryImpl(remoteRepository, localRepository)
}