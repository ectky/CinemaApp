package com.elitsa.libraries.cinemaapp.app.di;

import com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppScope;
import com.elitsa.libraries.cinemaapp.app.network.api.MovieDetailApi;
import com.elitsa.libraries.cinemaapp.app.network.api.MovieListApi;
import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\t"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/app/di/ApiModule;", "", "()V", "provideMoveiDetailApi", "Lcom/elitsa/libraries/cinemaapp/app/network/api/MovieDetailApi;", "retrofit", "Lretrofit2/Retrofit;", "provideMovieListApi", "Lcom/elitsa/libraries/cinemaapp/app/network/api/MovieListApi;", "app_debug"})
@dagger.Module(includes = {com.elitsa.libraries.cinemaapp.app.di.RetrofitModule.class})
public final class ApiModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppScope()
    @dagger.Provides()
    public final com.elitsa.libraries.cinemaapp.app.network.api.MovieListApi provideMovieListApi(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppScope()
    @dagger.Provides()
    public final com.elitsa.libraries.cinemaapp.app.network.api.MovieDetailApi provideMoveiDetailApi(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    public ApiModule() {
        super();
    }
}