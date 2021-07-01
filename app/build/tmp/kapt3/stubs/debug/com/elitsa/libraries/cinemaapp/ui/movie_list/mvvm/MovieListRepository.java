package com.elitsa.libraries.cinemaapp.ui.movie_list.mvvm;

import androidx.lifecycle.LiveData;
import com.elitsa.libraries.cinemaapp.app.models.Movie;
import com.elitsa.libraries.cinemaapp.app.models.MovieCard;
import com.elitsa.libraries.cinemaapp.app.network.models.movie_list.MovieListResponse;
import com.elitsa.libraries.cinemaapp.db.entities.MovieWithActors;
import com.elitsa.libraries.cinemaapp.utils.base.RemoteErrorEmitter;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0012\u0013J%\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J1\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u0011H&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/ui/movie_list/mvvm/MovieListRepository;", "", "convertMoviesWithActorToMoviesCard", "", "Lcom/elitsa/libraries/cinemaapp/app/models/MovieCard;", "movieWithActors", "Lcom/elitsa/libraries/cinemaapp/db/entities/MovieWithActors;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovieListForCategory", "remoteErrorEmitter", "Lcom/elitsa/libraries/cinemaapp/utils/base/RemoteErrorEmitter;", "category", "", "page", "", "(Lcom/elitsa/libraries/cinemaapp/utils/base/RemoteErrorEmitter;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSavedMovies", "Landroidx/lifecycle/LiveData;", "LocalRepository", "RemoteRepository", "app_debug"})
public abstract interface MovieListRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getMovieListForCategory(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.utils.base.RemoteErrorEmitter remoteErrorEmitter, @org.jetbrains.annotations.NotNull()
    java.lang.String category, int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.elitsa.libraries.cinemaapp.app.models.MovieCard>> p3);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.elitsa.libraries.cinemaapp.db.entities.MovieWithActors>> getSavedMovies();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object convertMoviesWithActorToMoviesCard(@org.jetbrains.annotations.NotNull()
    java.util.List<com.elitsa.libraries.cinemaapp.db.entities.MovieWithActors> movieWithActors, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.elitsa.libraries.cinemaapp.app.models.MovieCard>> p1);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/ui/movie_list/mvvm/MovieListRepository$RemoteRepository;", "", "getMovieListForCategory", "Lcom/elitsa/libraries/cinemaapp/app/network/models/movie_list/MovieListResponse;", "remoteErrorEmitter", "Lcom/elitsa/libraries/cinemaapp/utils/base/RemoteErrorEmitter;", "category", "", "page", "", "(Lcom/elitsa/libraries/cinemaapp/utils/base/RemoteErrorEmitter;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
    public static abstract interface RemoteRepository {
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.Object getMovieListForCategory(@org.jetbrains.annotations.NotNull()
        com.elitsa.libraries.cinemaapp.utils.base.RemoteErrorEmitter remoteErrorEmitter, @org.jetbrains.annotations.NotNull()
        java.lang.String category, int page, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super com.elitsa.libraries.cinemaapp.app.network.models.movie_list.MovieListResponse> p3);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0006"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/ui/movie_list/mvvm/MovieListRepository$LocalRepository;", "", "getSavedMovies", "Landroidx/lifecycle/LiveData;", "", "Lcom/elitsa/libraries/cinemaapp/db/entities/MovieWithActors;", "app_debug"})
    public static abstract interface LocalRepository {
        
        @org.jetbrains.annotations.NotNull()
        public abstract androidx.lifecycle.LiveData<java.util.List<com.elitsa.libraries.cinemaapp.db.entities.MovieWithActors>> getSavedMovies();
    }
}