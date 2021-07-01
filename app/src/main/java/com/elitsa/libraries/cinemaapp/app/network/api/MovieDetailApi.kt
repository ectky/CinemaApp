package com.elitsa.libraries.cinemaapp.app.network.api

import com.elitsa.libraries.cinemaapp.app.network.models.movie_detail.MovieDetailResponse
import com.elitsa.libraries.cinemaapp.utils.Constants
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieDetailApi {
    @GET("movie/{movie_id}")
    suspend fun getMovieAndCredits(@Path("movie_id") id: Int,
                                   @Query(Constants.APPEND_TO_RESPONSE) appendToResponse: String = "credits"): MovieDetailResponse
}