package com.elitsa.libraries.cinemaapp.ui.movie_detail;

import com.airbnb.epoxy.TypedEpoxyController;
import com.elitsa.libraries.cinemaapp.*;
import com.elitsa.libraries.cinemaapp.app.models.Movie;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/ui/movie_detail/MovieDetailCallback;", "", "onBackButtonCallback", "", "onFavoriteCallback", "movie", "Lcom/elitsa/libraries/cinemaapp/app/models/Movie;", "isFavorite", "", "app_debug"})
public abstract interface MovieDetailCallback {
    
    public abstract void onBackButtonCallback();
    
    public abstract void onFavoriteCallback(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.app.models.Movie movie, boolean isFavorite);
}