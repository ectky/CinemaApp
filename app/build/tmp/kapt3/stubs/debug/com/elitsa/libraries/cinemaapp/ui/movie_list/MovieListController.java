package com.elitsa.libraries.cinemaapp.ui.movie_list;

import com.airbnb.epoxy.TypedEpoxyController;
import com.elitsa.libraries.cinemaapp.app.models.MovieCard;
import com.elitsa.libraries.cinemaapp.movieCard;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B(\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0005\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\r\u001a\u00020\t2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0014R,\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u000f"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/ui/movie_list/MovieListController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "", "Lcom/elitsa/libraries/cinemaapp/app/models/MovieCard;", "onMovieClick", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "id", "", "(Lkotlin/jvm/functions/Function1;)V", "getOnMovieClick", "()Lkotlin/jvm/functions/Function1;", "buildModels", "data", "app_debug"})
public final class MovieListController extends com.airbnb.epoxy.TypedEpoxyController<java.util.List<? extends com.elitsa.libraries.cinemaapp.app.models.MovieCard>> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.elitsa.libraries.cinemaapp.app.models.MovieCard, kotlin.Unit> onMovieClick = null;
    
    @java.lang.Override()
    protected void buildModels(@org.jetbrains.annotations.Nullable()
    java.util.List<com.elitsa.libraries.cinemaapp.app.models.MovieCard> data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.elitsa.libraries.cinemaapp.app.models.MovieCard, kotlin.Unit> getOnMovieClick() {
        return null;
    }
    
    public MovieListController(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.elitsa.libraries.cinemaapp.app.models.MovieCard, kotlin.Unit> onMovieClick) {
        super();
    }
}