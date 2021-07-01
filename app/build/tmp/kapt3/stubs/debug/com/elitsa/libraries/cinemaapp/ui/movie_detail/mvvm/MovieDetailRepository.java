package com.elitsa.libraries.cinemaapp.ui.movie_detail.mvvm;

import androidx.lifecycle.LiveData;
import com.elitsa.libraries.cinemaapp.app.models.Movie;
import com.elitsa.libraries.cinemaapp.app.models.MovieWrapper;
import com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.MovieDetailResponse;
import com.elitsa.libraries.cinemaapp.db.entities.MovieEntity;
import com.elitsa.libraries.cinemaapp.db.entities.MovieWithActors;
import com.elitsa.libraries.cinemaapp.utils.base.RemoteErrorEmitter;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002\u000e\u000fJ\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J#\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/ui/movie_detail/mvvm/MovieDetailRepository;", "", "deleteMovieFromFavorites", "", "movie", "Lcom/elitsa/libraries/cinemaapp/app/models/Movie;", "(Lcom/elitsa/libraries/cinemaapp/app/models/Movie;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovieAndCast", "remoteErrorEmitter", "Lcom/elitsa/libraries/cinemaapp/utils/base/RemoteErrorEmitter;", "movieId", "", "(Lcom/elitsa/libraries/cinemaapp/utils/base/RemoteErrorEmitter;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveMovieToFavorites", "LocalRepository", "RemoteRepository", "app_debug"})
public abstract interface MovieDetailRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getMovieAndCast(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.utils.base.RemoteErrorEmitter remoteErrorEmitter, int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.elitsa.libraries.cinemaapp.app.models.Movie> p2);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveMovieToFavorites(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.app.models.Movie movie, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteMovieFromFavorites(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.app.models.Movie movie, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/ui/movie_detail/mvvm/MovieDetailRepository$RemoteRepository;", "", "getMovieAndCast", "Lcom/elitsa/libraries/cinemaapp/app/network/models/movie_detail/MovieDetailResponse;", "remoteErrorEmitter", "Lcom/elitsa/libraries/cinemaapp/utils/base/RemoteErrorEmitter;", "movieId", "", "(Lcom/elitsa/libraries/cinemaapp/utils/base/RemoteErrorEmitter;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
    public static abstract interface RemoteRepository {
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.Object getMovieAndCast(@org.jetbrains.annotations.NotNull()
        com.elitsa.libraries.cinemaapp.utils.base.RemoteErrorEmitter remoteErrorEmitter, int movieId, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.MovieDetailResponse> p2);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/ui/movie_detail/mvvm/MovieDetailRepository$LocalRepository;", "", "deleteMovieFromFavorites", "", "movieEntity", "Lcom/elitsa/libraries/cinemaapp/db/entities/MovieEntity;", "(Lcom/elitsa/libraries/cinemaapp/db/entities/MovieEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovie", "movieId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveMovieToFavorites", "movieWrapper", "Lcom/elitsa/libraries/cinemaapp/app/models/MovieWrapper;", "(Lcom/elitsa/libraries/cinemaapp/app/models/MovieWrapper;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
    public static abstract interface LocalRepository {
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.Object saveMovieToFavorites(@org.jetbrains.annotations.NotNull()
        com.elitsa.libraries.cinemaapp.app.models.MovieWrapper movieWrapper, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.Object deleteMovieFromFavorites(@org.jetbrains.annotations.NotNull()
        com.elitsa.libraries.cinemaapp.db.entities.MovieEntity movieEntity, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.Object getMovie(int movieId, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super com.elitsa.libraries.cinemaapp.db.entities.MovieEntity> p1);
    }
}