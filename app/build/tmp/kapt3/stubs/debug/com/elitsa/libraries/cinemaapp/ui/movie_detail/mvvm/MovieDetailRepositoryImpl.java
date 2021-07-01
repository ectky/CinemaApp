package com.elitsa.libraries.cinemaapp.ui.movie_detail.mvvm;

import com.elitsa.libraries.cinemaapp.app.models.Movie;
import com.elitsa.libraries.cinemaapp.app.network.adapters.MovieAdapter;
import com.elitsa.libraries.cinemaapp.utils.base.RemoteErrorEmitter;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ#\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/ui/movie_detail/mvvm/MovieDetailRepositoryImpl;", "Lcom/elitsa/libraries/cinemaapp/ui/movie_detail/mvvm/MovieDetailRepository;", "remoteRepo", "Lcom/elitsa/libraries/cinemaapp/ui/movie_detail/mvvm/MovieDetailRepository$RemoteRepository;", "localRepo", "Lcom/elitsa/libraries/cinemaapp/ui/movie_detail/mvvm/MovieDetailRepository$LocalRepository;", "(Lcom/elitsa/libraries/cinemaapp/ui/movie_detail/mvvm/MovieDetailRepository$RemoteRepository;Lcom/elitsa/libraries/cinemaapp/ui/movie_detail/mvvm/MovieDetailRepository$LocalRepository;)V", "adapter", "Lcom/elitsa/libraries/cinemaapp/app/network/adapters/MovieAdapter;", "deleteMovieFromFavorites", "", "movie", "Lcom/elitsa/libraries/cinemaapp/app/models/Movie;", "(Lcom/elitsa/libraries/cinemaapp/app/models/Movie;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovieAndCast", "remoteErrorEmitter", "Lcom/elitsa/libraries/cinemaapp/utils/base/RemoteErrorEmitter;", "movieId", "", "(Lcom/elitsa/libraries/cinemaapp/utils/base/RemoteErrorEmitter;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveMovieToFavorites", "app_debug"})
public final class MovieDetailRepositoryImpl implements com.elitsa.libraries.cinemaapp.ui.movie_detail.mvvm.MovieDetailRepository {
    private final com.elitsa.libraries.cinemaapp.app.network.adapters.MovieAdapter adapter = null;
    private final com.elitsa.libraries.cinemaapp.ui.movie_detail.mvvm.MovieDetailRepository.RemoteRepository remoteRepo = null;
    private final com.elitsa.libraries.cinemaapp.ui.movie_detail.mvvm.MovieDetailRepository.LocalRepository localRepo = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getMovieAndCast(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.utils.base.RemoteErrorEmitter remoteErrorEmitter, int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.elitsa.libraries.cinemaapp.app.models.Movie> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object saveMovieToFavorites(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.app.models.Movie movie, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteMovieFromFavorites(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.app.models.Movie movie, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public MovieDetailRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.ui.movie_detail.mvvm.MovieDetailRepository.RemoteRepository remoteRepo, @org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.ui.movie_detail.mvvm.MovieDetailRepository.LocalRepository localRepo) {
        super();
    }
}