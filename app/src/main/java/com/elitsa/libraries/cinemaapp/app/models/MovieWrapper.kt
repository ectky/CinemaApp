package com.elitsa.libraries.cinemaapp.app.models

import com.elitsa.libraries.cinemaapp.db.entities.ActorEntity
import com.elitsa.libraries.cinemaapp.db.entities.MovieEntity
data class MovieWrapper(
    val movie: MovieEntity,
    val actors: List<ActorEntity>
)