package com.elitsa.libraries.cinemaapp.ui.movie_list

import com.airbnb.epoxy.TypedEpoxyController
import com.elitsa.libraries.cinemaapp.app.models.MovieCard
import com.elitsa.libraries.cinemaapp.movieCard

class MovieListController(val onMovieClick:(id: MovieCard) -> Unit)
    : TypedEpoxyController<List<MovieCard>>() {

    override fun buildModels(data: List<MovieCard>?) {

        data?.forEach {
            movieCard {
                id(it.id)
                movieCard(it)
                clickListener { _, _, _, _ -> onMovieClick(it) }
            }
        }
    }

}