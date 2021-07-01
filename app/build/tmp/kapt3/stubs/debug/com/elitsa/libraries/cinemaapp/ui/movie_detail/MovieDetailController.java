package com.elitsa.libraries.cinemaapp.ui.movie_detail;

import com.airbnb.epoxy.TypedEpoxyController;
import com.elitsa.libraries.cinemaapp.*;
import com.elitsa.libraries.cinemaapp.app.models.Movie;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/ui/movie_detail/MovieDetailController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "Lcom/elitsa/libraries/cinemaapp/app/models/Movie;", "callbackListener", "Lcom/elitsa/libraries/cinemaapp/ui/movie_detail/MovieDetailCallback;", "(Lcom/elitsa/libraries/cinemaapp/ui/movie_detail/MovieDetailCallback;)V", "isFavorite", "", "buildModels", "", "data", "Companion", "app_debug"})
public final class MovieDetailController extends com.airbnb.epoxy.TypedEpoxyController<com.elitsa.libraries.cinemaapp.app.models.Movie> {
    private boolean isFavorite;
    private final com.elitsa.libraries.cinemaapp.ui.movie_detail.MovieDetailCallback callbackListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MOVIE_HEADER_ID = "MovieHeader";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MOVIE_DESCRIPTION_ID = "MovieDescription";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MOVIE_ACTORS_CAROUSEL = "MovieActorsCarousel";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MOVIE_MISCELLANEOUS = "MovieMisc";
    public static final com.elitsa.libraries.cinemaapp.ui.movie_detail.MovieDetailController.Companion Companion = null;
    
    @java.lang.Override()
    protected void buildModels(@org.jetbrains.annotations.Nullable()
    com.elitsa.libraries.cinemaapp.app.models.Movie data) {
    }
    
    public MovieDetailController(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.ui.movie_detail.MovieDetailCallback callbackListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/ui/movie_detail/MovieDetailController$Companion;", "", "()V", "MOVIE_ACTORS_CAROUSEL", "", "MOVIE_DESCRIPTION_ID", "MOVIE_HEADER_ID", "MOVIE_MISCELLANEOUS", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}