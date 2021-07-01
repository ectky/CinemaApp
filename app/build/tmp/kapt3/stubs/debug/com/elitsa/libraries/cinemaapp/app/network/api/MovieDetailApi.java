package com.elitsa.libraries.cinemaapp.app.network.api;

import com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.MovieDetailResponse;
import com.elitsa.libraries.cinemaapp.utils.Constants;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/app/network/api/MovieDetailApi;", "", "getMovieAndCredits", "Lcom/elitsa/libraries/cinemaapp/app/network/models/movie_detail/MovieDetailResponse;", "id", "", "appendToResponse", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface MovieDetailApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "movie/{movie_id}")
    public abstract java.lang.Object getMovieAndCredits(@retrofit2.http.Path(value = "movie_id")
    int id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "append_to_response")
    java.lang.String appendToResponse, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.MovieDetailResponse> p2);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}