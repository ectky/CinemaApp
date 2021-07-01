package com.elitsa.libraries.cinemaapp.ui.movie_detail.di;

import com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppComponent;
import com.elitsa.libraries.cinemaapp.ui.movie_detail.MovieDetailActivity;
import dagger.Component;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/ui/movie_detail/di/MovieDetailComponent;", "", "inject", "", "activity", "Lcom/elitsa/libraries/cinemaapp/ui/movie_detail/MovieDetailActivity;", "app_debug"})
@dagger.Component(dependencies = {com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppComponent.class})
@MovieDetailScope()
public abstract interface MovieDetailComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.ui.movie_detail.MovieDetailActivity activity);
}