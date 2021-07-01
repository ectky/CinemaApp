package com.elitsa.libraries.cinemaapp.app.app_di;

import com.elitsa.libraries.cinemaapp.app.di.ApiModule;
import com.elitsa.libraries.cinemaapp.app.di.RepositoriesModule;
import com.elitsa.libraries.cinemaapp.app.network.api.MovieDetailApi;
import com.elitsa.libraries.cinemaapp.app.network.api.MovieListApi;
import com.elitsa.libraries.cinemaapp.ui.movie_detail.mvvm.MovieDetailRepository;
import com.elitsa.libraries.cinemaapp.ui.movie_list.mvvm.MovieListRepository;
import dagger.Component;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/app/app_di/CinemaAppComponent;", "", "movieDetailApi", "Lcom/elitsa/libraries/cinemaapp/app/network/api/MovieDetailApi;", "movieDetailRepository", "Lcom/elitsa/libraries/cinemaapp/ui/movie_detail/mvvm/MovieDetailRepository;", "movieListApi", "Lcom/elitsa/libraries/cinemaapp/app/network/api/MovieListApi;", "movieListRepository", "Lcom/elitsa/libraries/cinemaapp/ui/movie_list/mvvm/MovieListRepository;", "app_debug"})
@dagger.Component(modules = {com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppModule.class, com.elitsa.libraries.cinemaapp.app.di.ApiModule.class, com.elitsa.libraries.cinemaapp.app.di.RepositoriesModule.class})
@CinemaAppScope()
public abstract interface CinemaAppComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.elitsa.libraries.cinemaapp.app.network.api.MovieListApi movieListApi();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.elitsa.libraries.cinemaapp.ui.movie_list.mvvm.MovieListRepository movieListRepository();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.elitsa.libraries.cinemaapp.app.network.api.MovieDetailApi movieDetailApi();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.elitsa.libraries.cinemaapp.ui.movie_detail.mvvm.MovieDetailRepository movieDetailRepository();
}