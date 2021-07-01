package com.elitsa.libraries.cinemaapp.app.network.adapters;

import com.elitsa.libraries.cinemaapp.app.models.Actor;
import com.elitsa.libraries.cinemaapp.app.models.Movie;
import com.elitsa.libraries.cinemaapp.app.models.MovieCard;
import com.elitsa.libraries.cinemaapp.app.models.MovieWrapper;
import com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.ActorResponse;
import com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.MovieDetailResponse;
import com.elitsa.libraries.cinemaapp.app.network.models.movie_list.MovieListResponse;
import com.elitsa.libraries.cinemaapp.app.network.models.movie_list.MovieShortDetail;
import com.elitsa.libraries.cinemaapp.db.entities.ActorEntity;
import com.elitsa.libraries.cinemaapp.db.entities.MovieEntity;
import com.elitsa.libraries.cinemaapp.db.entities.MovieWithActors;
import com.elitsa.libraries.cinemaapp.utils.Utils;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020 H\u0002J\u000e\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u0011J\u000e\u0010\"\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u0011J\u0010\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020&H\u0002J\u000e\u0010\'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020&\u00a8\u0006)"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/app/network/adapters/MovieAdapter;", "", "()V", "actorEntityToActor", "Lcom/elitsa/libraries/cinemaapp/app/models/Actor;", "actor", "Lcom/elitsa/libraries/cinemaapp/db/entities/ActorEntity;", "actorToActorEntity", "fromActorResponseListToActorList", "", "list", "Lcom/elitsa/libraries/cinemaapp/app/network/models/movie_detail/ActorResponse;", "movieId", "", "fromActorResponseToActor", "actorResponse", "fromMovieDetailResponseToMovie", "Lcom/elitsa/libraries/cinemaapp/app/models/Movie;", "movieDetailResponse", "Lcom/elitsa/libraries/cinemaapp/app/network/models/movie_detail/MovieDetailResponse;", "fromMovieShortDetailListToMovieCardList", "Lcom/elitsa/libraries/cinemaapp/app/models/MovieCard;", "movieListResponse", "Lcom/elitsa/libraries/cinemaapp/app/network/models/movie_list/MovieListResponse;", "fromMovieShortDetailToMovieCard", "movieDetail", "Lcom/elitsa/libraries/cinemaapp/app/network/models/movie_list/MovieShortDetail;", "getGenresFromMovieDetailResponse", "", "getStudioFromMovieDetailResponse", "movieEntityToMovie", "movie", "Lcom/elitsa/libraries/cinemaapp/db/entities/MovieEntity;", "movieToMovieEntity", "movieToMovieWrapper", "Lcom/elitsa/libraries/cinemaapp/app/models/MovieWrapper;", "movieWithActorsToMovie", "movieWithActors", "Lcom/elitsa/libraries/cinemaapp/db/entities/MovieWithActors;", "movieWithActorsToMovieCard", "movieAndActors", "app_debug"})
public final class MovieAdapter {
    
    private final com.elitsa.libraries.cinemaapp.app.models.MovieCard fromMovieShortDetailToMovieCard(com.elitsa.libraries.cinemaapp.app.network.models.movie_list.MovieShortDetail movieDetail) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.elitsa.libraries.cinemaapp.app.models.MovieCard> fromMovieShortDetailListToMovieCardList(@org.jetbrains.annotations.Nullable()
    com.elitsa.libraries.cinemaapp.app.network.models.movie_list.MovieListResponse movieListResponse) {
        return null;
    }
    
    private final com.elitsa.libraries.cinemaapp.app.models.Actor fromActorResponseToActor(com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.ActorResponse actorResponse, int movieId) {
        return null;
    }
    
    private final java.util.List<com.elitsa.libraries.cinemaapp.app.models.Actor> fromActorResponseListToActorList(java.util.List<com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.ActorResponse> list, int movieId) {
        return null;
    }
    
    private final java.lang.String getGenresFromMovieDetailResponse(com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.MovieDetailResponse movieDetailResponse) {
        return null;
    }
    
    private final java.lang.String getStudioFromMovieDetailResponse(com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.MovieDetailResponse movieDetailResponse) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.elitsa.libraries.cinemaapp.app.models.Movie fromMovieDetailResponseToMovie(@org.jetbrains.annotations.Nullable()
    com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.MovieDetailResponse movieDetailResponse) {
        return null;
    }
    
    private final com.elitsa.libraries.cinemaapp.db.entities.ActorEntity actorToActorEntity(com.elitsa.libraries.cinemaapp.app.models.Actor actor) {
        return null;
    }
    
    private final com.elitsa.libraries.cinemaapp.app.models.Actor actorEntityToActor(com.elitsa.libraries.cinemaapp.db.entities.ActorEntity actor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.elitsa.libraries.cinemaapp.db.entities.MovieEntity movieToMovieEntity(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.app.models.Movie movie) {
        return null;
    }
    
    private final com.elitsa.libraries.cinemaapp.app.models.Movie movieEntityToMovie(com.elitsa.libraries.cinemaapp.db.entities.MovieEntity movie) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.elitsa.libraries.cinemaapp.app.models.MovieWrapper movieToMovieWrapper(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.app.models.Movie movie) {
        return null;
    }
    
    private final com.elitsa.libraries.cinemaapp.app.models.Movie movieWithActorsToMovie(com.elitsa.libraries.cinemaapp.db.entities.MovieWithActors movieWithActors) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.elitsa.libraries.cinemaapp.app.models.MovieCard movieWithActorsToMovieCard(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.db.entities.MovieWithActors movieAndActors) {
        return null;
    }
    
    public MovieAdapter() {
        super();
    }
}