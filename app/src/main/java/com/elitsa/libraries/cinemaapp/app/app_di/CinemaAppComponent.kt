package com.elitsa.libraries.cinemaapp.app.app_di

import com.elitsa.libraries.cinemaapp.app.di.ApiModule
import com.elitsa.libraries.cinemaapp.app.di.RepositoriesModule
import com.elitsa.libraries.cinemaapp.app.network.api.MovieDetailApi
import com.elitsa.libraries.cinemaapp.app.network.api.MovieListApi
import com.elitsa.libraries.cinemaapp.ui.movie_detail.mvvm.MovieDetailRepository
import com.elitsa.libraries.cinemaapp.ui.movie_list.mvvm.MovieListRepository
import dagger.Component

@CinemaAppScope
@Component(modules = [CinemaAppModule::class, ApiModule::class, RepositoriesModule::class])
interface CinemaAppComponent {
    fun movieListApi(): MovieListApi
    fun movieListRepository(): MovieListRepository
    fun movieDetailApi(): MovieDetailApi
    fun movieDetailRepository(): MovieDetailRepository
}