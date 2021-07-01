package com.elitsa.libraries.cinemaapp.app.di

import android.content.res.Resources
import com.elitsa.libraries.cinemaapp.R
import com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppScope
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
@Module(includes = [NetworkModule::class])
class RetrofitModule {

    @Provides
    @CinemaAppScope
    fun provideBaseUrl(resources: Resources): String =
        resources.getString(R.string.api_url)


    @Provides
    @CinemaAppScope
    fun provideMoshi(): Moshi =
        Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()

    @Provides
    @CinemaAppScope
    fun provideRetrofit(okHttpClient: OkHttpClient, url: String, moshi: Moshi): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .client(okHttpClient)
            .baseUrl(url)
            .build()
    }


}