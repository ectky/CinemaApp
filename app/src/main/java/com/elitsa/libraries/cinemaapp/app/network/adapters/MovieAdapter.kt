package com.elitsa.libraries.cinemaapp.app.network.adapters

import com.elitsa.libraries.cinemaapp.app.models.Actor
import com.elitsa.libraries.cinemaapp.app.models.Movie
import com.elitsa.libraries.cinemaapp.app.models.MovieCard
import com.elitsa.libraries.cinemaapp.app.models.MovieWrapper
import com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.ActorResponse
import com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.MovieDetailResponse
import com.elitsa.libraries.cinemaapp.app.network.models.movie_list.MovieListResponse
import com.elitsa.libraries.cinemaapp.app.network.models.movie_list.MovieShortDetail
import com.elitsa.libraries.cinemaapp.db.entities.ActorEntity
import com.elitsa.libraries.cinemaapp.db.entities.MovieEntity
import com.elitsa.libraries.cinemaapp.db.entities.MovieWithActors
import com.elitsa.libraries.cinemaapp.utils.Utils

class MovieAdapter {

    private fun fromMovieShortDetailToMovieCard(movieDetail: MovieShortDetail): MovieCard {
        with(movieDetail){
            return MovieCard(
                id = id,
                imgUrl = Utils.buildImageString(posterPath ?: "")
            )
        }
    }

    fun fromMovieShortDetailListToMovieCardList(movieListResponse: MovieListResponse?): List<MovieCard>? =
        movieListResponse?.results?.map { fromMovieShortDetailToMovieCard(it) }

    private fun fromActorResponseToActor(actorResponse: ActorResponse, movieId: Int): Actor {
        return with(actorResponse){
            Actor(
                id = id,
                name = name,
                photoUrl = Utils.buildImageString(profilePath ?: ""),
                movieId = movieId
            )
        }
    }

    private fun fromActorResponseListToActorList(list: List<ActorResponse>?, movieId: Int): List<Actor>? =
        list?.map { fromActorResponseToActor(it, movieId) }

    private fun getGenresFromMovieDetailResponse(movieDetailResponse: MovieDetailResponse?): String? {
        val builder = StringBuilder()
        movieDetailResponse?.genres?.forEach {
            it?.name?.let { name -> builder.append("$name, ") }
        }
        return builder.removeRange(builder.length - 2, builder.length).toString()
    }

    private fun getStudioFromMovieDetailResponse(movieDetailResponse: MovieDetailResponse?) =
        if(movieDetailResponse?.productionCompanies?.isNotEmpty() == true)
            movieDetailResponse.productionCompanies[0]?.name
        else
            null

    fun fromMovieDetailResponseToMovie(movieDetailResponse: MovieDetailResponse?): Movie? {
        if(movieDetailResponse == null) return null
        val actors = fromActorResponseListToActorList(movieDetailResponse.credits?.cast, movieDetailResponse.id)
        val studio = getStudioFromMovieDetailResponse(movieDetailResponse)
        val genres = getGenresFromMovieDetailResponse(movieDetailResponse)

        return with(movieDetailResponse){
            Movie(
                id = id,
                photoUrl = Utils.buildImageString(posterPath ?: ""),
                name = originalTitle,
                description = overview,
                actors = actors,
                rating = voteAverage?.toFloat() ?: 0f,
                studio = studio,
                genres = genres,
                releaseDate = releaseDate
            )
        }
    }

    private fun actorToActorEntity(actor: Actor) =
        ActorEntity(id = actor.id, name = actor.name, photoUrl = actor.photoUrl, movieId = actor.movieId)

    private fun actorEntityToActor(actor: ActorEntity) =
        Actor(id = actor.id, name = actor.name, photoUrl = actor.photoUrl, movieId = actor.movieId)

    fun movieToMovieEntity(movie: Movie) =
        with(movie){
            MovieEntity(id = id, photoUrl = photoUrl, name = name, releaseDate = releaseDate,
                genres = genres, studio = studio, rating = rating, description = description, isFavorite = isFavorite)
        }

    private fun movieEntityToMovie(movie: MovieEntity) =
        with(movie){
            Movie(id = id, photoUrl = photoUrl, name = name, releaseDate = releaseDate,
                genres = genres, studio = studio, rating = rating, description = description, isFavorite = isFavorite,
                actors = null)
        }

    fun movieToMovieWrapper(movie: Movie): MovieWrapper{
        val actors = movie.actors?.map { actorToActorEntity(it) } ?: listOf()
        val movieEntity = movieToMovieEntity(movie)
        return MovieWrapper(movieEntity, actors)
    }

    private fun movieWithActorsToMovie(movieWithActors: MovieWithActors): Movie {
        val actors = movieWithActors.actors.map { actorEntityToActor(it) }
        val movie = movieEntityToMovie(movieWithActors.movie)
        return movie.copy(actors = actors)
    }

    fun movieWithActorsToMovieCard(movieAndActors: MovieWithActors): MovieCard =
        MovieCard(
            id = movieAndActors.movie.id,
            imgUrl = movieAndActors.movie.photoUrl,
            movie = movieWithActorsToMovie(movieAndActors)
        )

}