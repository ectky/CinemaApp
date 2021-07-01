package com.elitsa.libraries.cinemaapp.ui.movie_list.mvvm;

import androidx.lifecycle.LiveData;
import com.elitsa.libraries.cinemaapp.app.models.Movie;
import com.elitsa.libraries.cinemaapp.app.models.MovieCard;
import com.elitsa.libraries.cinemaapp.app.network.adapters.MovieAdapter;
import com.elitsa.libraries.cinemaapp.db.entities.MovieWithActors;
import com.elitsa.libraries.cinemaapp.utils.base.RemoteErrorEmitter;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J%\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ1\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u0016H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/ui/movie_list/mvvm/MovieListRepositoryImpl;", "Lcom/elitsa/libraries/cinemaapp/ui/movie_list/mvvm/MovieListRepository;", "remoteRepo", "Lcom/elitsa/libraries/cinemaapp/ui/movie_list/mvvm/MovieListRepository$RemoteRepository;", "localRepo", "Lcom/elitsa/libraries/cinemaapp/ui/movie_list/mvvm/MovieListRepository$LocalRepository;", "(Lcom/elitsa/libraries/cinemaapp/ui/movie_list/mvvm/MovieListRepository$RemoteRepository;Lcom/elitsa/libraries/cinemaapp/ui/movie_list/mvvm/MovieListRepository$LocalRepository;)V", "convertMoviesWithActorToMoviesCard", "", "Lcom/elitsa/libraries/cinemaapp/app/models/MovieCard;", "movieWithActors", "Lcom/elitsa/libraries/cinemaapp/db/entities/MovieWithActors;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovieListForCategory", "remoteErrorEmitter", "Lcom/elitsa/libraries/cinemaapp/utils/base/RemoteErrorEmitter;", "category", "", "page", "", "(Lcom/elitsa/libraries/cinemaapp/utils/base/RemoteErrorEmitter;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSavedMovies", "Landroidx/lifecycle/LiveData;", "app_debug"})
public final class MovieListRepositoryImpl implements com.elitsa.libraries.cinemaapp.ui.movie_list.mvvm.MovieListRepository {
    private final com.elitsa.libraries.cinemaapp.ui.movie_list.mvvm.MovieListRepository.RemoteRepository remoteRepo = null;
    private final com.elitsa.libraries.cinemaapp.ui.movie_list.mvvm.MovieListRepository.LocalRepository localRepo = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getMovieListForCategory(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.utils.base.RemoteErrorEmitter remoteErrorEmitter, @org.jetbrains.annotations.NotNull()
    java.lang.String category, int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.elitsa.libraries.cinemaapp.app.models.MovieCard>> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object convertMoviesWithActorToMoviesCard(@org.jetbrains.annotations.NotNull()
    java.util.List<com.elitsa.libraries.cinemaapp.db.entities.MovieWithActors> movieWithActors, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.elitsa.libraries.cinemaapp.app.models.MovieCard>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.elitsa.libraries.cinemaapp.db.entities.MovieWithActors>> getSavedMovies() {
        return null;
    }
    
    public MovieListRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.ui.movie_list.mvvm.MovieListRepository.RemoteRepository remoteRepo, @org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.ui.movie_list.mvvm.MovieListRepository.LocalRepository localRepo) {
        super();
    }
}