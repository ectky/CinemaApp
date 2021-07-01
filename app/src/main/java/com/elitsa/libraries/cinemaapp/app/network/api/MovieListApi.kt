package com.elitsa.libraries.cinemaapp.app.network.api

import com.elitsa.libraries.cinemaapp.app.network.models.movie_list.MovieListResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
interface MovieListApi {

    @GET("movie/{category}")
    suspend fun getMovieListForCategory(@Path("category") category: String,
                                @Query("page") page: Int) : MovieListResponse
}