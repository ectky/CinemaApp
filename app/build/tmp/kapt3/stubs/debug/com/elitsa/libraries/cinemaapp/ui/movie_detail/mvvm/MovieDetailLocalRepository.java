package com.elitsa.libraries.cinemaapp.ui.movie_detail.mvvm;

import com.elitsa.libraries.cinemaapp.app.models.MovieWrapper;
import com.elitsa.libraries.cinemaapp.db.entities.MovieEntity;
import com.elitsa.libraries.cinemaapp.utils.base.BaseLocalRepository;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/ui/movie_detail/mvvm/MovieDetailLocalRepository;", "Lcom/elitsa/libraries/cinemaapp/ui/movie_detail/mvvm/MovieDetailRepository$LocalRepository;", "Lcom/elitsa/libraries/cinemaapp/utils/base/BaseLocalRepository;", "()V", "deleteMovieFromFavorites", "", "movieEntity", "Lcom/elitsa/libraries/cinemaapp/db/entities/MovieEntity;", "(Lcom/elitsa/libraries/cinemaapp/db/entities/MovieEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovie", "movieId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveMovieToFavorites", "movieWrapper", "Lcom/elitsa/libraries/cinemaapp/app/models/MovieWrapper;", "(Lcom/elitsa/libraries/cinemaapp/app/models/MovieWrapper;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class MovieDetailLocalRepository extends com.elitsa.libraries.cinemaapp.utils.base.BaseLocalRepository implements com.elitsa.libraries.cinemaapp.ui.movie_detail.mvvm.MovieDetailRepository.LocalRepository {
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object saveMovieToFavorites(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.app.models.MovieWrapper movieWrapper, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteMovieFromFavorites(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.db.entities.MovieEntity movieEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getMovie(int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.elitsa.libraries.cinemaapp.db.entities.MovieEntity> p1) {
        return null;
    }
    
    public MovieDetailLocalRepository() {
        super();
    }
}