package com.elitsa.libraries.cinemaapp.ui.movie_list.di

import com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppComponent
import com.elitsa.libraries.cinemaapp.ui.movie_list.MovieListActivity
import dagger.Component
@MovieListScope
@Component(dependencies = [CinemaAppComponent::class])
interface MovieListComponent {
    fun inject(activity: MovieListActivity)
}