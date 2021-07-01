package com.elitsa.libraries.cinemaapp.app.di;

import com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppScope;
import com.elitsa.libraries.cinemaapp.app.network.api.MovieDetailApi;
import com.elitsa.libraries.cinemaapp.app.network.api.MovieListApi;
import com.elitsa.libraries.cinemaapp.ui.movie_detail.mvvm.MovieDetailLocalRepository;
import com.elitsa.libraries.cinemaapp.ui.movie_detail.mvvm.MovieDetailRemoteRepository;
import com.elitsa.libraries.cinemaapp.ui.movie_detail.mvvm.MovieDetailRepository;
import com.elitsa.libraries.cinemaapp.ui.movie_detail.mvvm.MovieDetailRepositoryImpl;
import com.elitsa.libraries.cinemaapp.ui.movie_list.mvvm.MovieListLocalRepository;
import com.elitsa.libraries.cinemaapp.ui.movie_list.mvvm.MovieListRemoteRepository;
import com.elitsa.libraries.cinemaapp.ui.movie_list.mvvm.MovieListRepository;
import com.elitsa.libraries.cinemaapp.ui.movie_list.mvvm.MovieListRepositoryImpl;
import dagger.Module;
import dagger.Provides;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004H\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000eH\u0007\u00a8\u0006\u0015"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/app/di/RepositoriesModule;", "", "()V", "movieDetailLocalRepo", "Lcom/elitsa/libraries/cinemaapp/ui/movie_detail/mvvm/MovieDetailRepository$LocalRepository;", "movieDetailRemoteRepo", "Lcom/elitsa/libraries/cinemaapp/ui/movie_detail/mvvm/MovieDetailRepository$RemoteRepository;", "movieDetailApi", "Lcom/elitsa/libraries/cinemaapp/app/network/api/MovieDetailApi;", "movieDetailRepo", "Lcom/elitsa/libraries/cinemaapp/ui/movie_detail/mvvm/MovieDetailRepository;", "remoteRepository", "localRepository", "movieListLocalRepo", "Lcom/elitsa/libraries/cinemaapp/ui/movie_list/mvvm/MovieListRepository$LocalRepository;", "movieListRemoteRepo", "Lcom/elitsa/libraries/cinemaapp/ui/movie_list/mvvm/MovieListRepository$RemoteRepository;", "movieListApi", "Lcom/elitsa/libraries/cinemaapp/app/network/api/MovieListApi;", "movieListRepo", "Lcom/elitsa/libraries/cinemaapp/ui/movie_list/mvvm/MovieListRepository;", "app_debug"})
@dagger.Module()
public final class RepositoriesModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppScope()
    @dagger.Provides()
    public final com.elitsa.libraries.cinemaapp.ui.movie_list.mvvm.MovieListRepository.LocalRepository movieListLocalRepo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppScope()
    @dagger.Provides()
    public final com.elitsa.libraries.cinemaapp.ui.movie_list.mvvm.MovieListRepository.RemoteRepository movieListRemoteRepo(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.app.network.api.MovieListApi movieListApi) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppScope()
    @dagger.Provides()
    public final com.elitsa.libraries.cinemaapp.ui.movie_list.mvvm.MovieListRepository movieListRepo(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.ui.movie_list.mvvm.MovieListRepository.RemoteRepository remoteRepository, @org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.ui.movie_list.mvvm.MovieListRepository.LocalRepository localRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppScope()
    @dagger.Provides()
    public final com.elitsa.libraries.cinemaapp.ui.movie_detail.mvvm.MovieDetailRepository.LocalRepository movieDetailLocalRepo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppScope()
    @dagger.Provides()
    public final com.elitsa.libraries.cinemaapp.ui.movie_detail.mvvm.MovieDetailRepository.RemoteRepository movieDetailRemoteRepo(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.app.network.api.MovieDetailApi movieDetailApi) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppScope()
    @dagger.Provides()
    public final com.elitsa.libraries.cinemaapp.ui.movie_detail.mvvm.MovieDetailRepository movieDetailRepo(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.ui.movie_detail.mvvm.MovieDetailRepository.RemoteRepository remoteRepository, @org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.ui.movie_detail.mvvm.MovieDetailRepository.LocalRepository localRepository) {
        return null;
    }
    
    public RepositoriesModule() {
        super();
    }
}