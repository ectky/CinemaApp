package com.elitsa.libraries.cinemaapp.app.di

import com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppScope
import com.elitsa.libraries.cinemaapp.app.network.api.MovieDetailApi
import com.elitsa.libraries.cinemaapp.app.network.api.MovieListApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
@Module(includes = [RetrofitModule::class])
class ApiModule {
    @Provides
    @CinemaAppScope
    fun provideMovieListApi(retrofit: Retrofit): MovieListApi = retrofit.create(MovieListApi::class.java)

    @Provides
    @CinemaAppScope
    fun provideMoveiDetailApi(retrofit: Retrofit): MovieDetailApi = retrofit.create(MovieDetailApi::class.java)
}