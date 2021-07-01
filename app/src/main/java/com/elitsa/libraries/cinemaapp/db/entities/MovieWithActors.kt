package com.elitsa.libraries.cinemaapp.db.entities

import androidx.room.Embedded
import androidx.room.Relation
data class MovieWithActors(
    @Embedded val movie: MovieEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "movie_id"
    )
    val actors: List<ActorEntity>
)