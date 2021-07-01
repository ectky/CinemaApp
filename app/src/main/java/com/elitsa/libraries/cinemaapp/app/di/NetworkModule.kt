package com.elitsa.libraries.cinemaapp.app.di

import android.content.Context
import android.os.Build
import com.elitsa.libraries.cinemaapp.BuildConfig
import com.elitsa.libraries.cinemaapp.app.CinemaApp
import com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppScope
import com.elitsa.libraries.cinemaapp.app.interceptor.ConnectivityInterceptor
import com.elitsa.libraries.cinemaapp.utils.ApiKeys
import dagger.Module
import dagger.Provides
import dagger.Reusable
import okhttp3.*
import okhttp3.logging.HttpLoggingInterceptor
import java.io.File
import java.util.concurrent.TimeUnit
@Module
class NetworkModule {

    @Provides
    @CinemaAppScope
    fun provideInterceptor(): HttpLoggingInterceptor {

        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        return interceptor
    }

    @Provides
    @CinemaAppScope
    fun provideCache(cacheFile: File): Cache {
        return Cache(cacheFile, 10 * 1000 * 1000) //10MB Cahe
    }

    @Provides
    @CinemaAppScope
    fun provideCacheFile(context: Context): File {
        return File(context.cacheDir, "okhttp_cache")
    }

    @Provides
    @CinemaAppScope
    fun provideOkHttpClient(loggingInterceptor: HttpLoggingInterceptor, cache: Cache): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .addInterceptor(ConnectivityInterceptor(CinemaApp.appContext))
            .addInterceptor { chain ->
                val requestBuilder = chain.request().newBuilder()
                    .addHeader(
                        "User-Agent",
                        "CinemaApp" + " BUILD VERSION: " + BuildConfig.VERSION_NAME + " SMARTPHONE: " + Build.MODEL + " ANDROID VERSION: " + Build.VERSION.RELEASE
                    )
                    .addHeader("Content-Type", "application/json")

                val httpUrl = chain.request()
                    .url
                    .newBuilder()
                    .addQueryParameter("api_key", ApiKeys.MOVIE_API_KEY).build()

                val request = requestBuilder
                    .url(httpUrl)
                    .build()

                chain.proceed(request)
            }
            .readTimeout(60, TimeUnit.SECONDS)
            .connectTimeout(60, TimeUnit.SECONDS)
            .cache(cache)
            .build()
    }


}