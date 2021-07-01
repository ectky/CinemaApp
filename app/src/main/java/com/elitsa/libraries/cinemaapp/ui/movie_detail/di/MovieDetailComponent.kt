package com.elitsa.libraries.cinemaapp.ui.movie_detail.di

import com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppComponent
import com.elitsa.libraries.cinemaapp.ui.movie_detail.MovieDetailActivity
import dagger.Component

@MovieDetailScope
@Component(dependencies = [CinemaAppComponent::class])
interface MovieDetailComponent {
    fun inject(activity: MovieDetailActivity)
}