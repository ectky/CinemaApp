package com.elitsa.libraries.cinemaapp.ui.movie_list.mvvm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.elitsa.libraries.cinemaapp.app.models.MovieCard;
import com.elitsa.libraries.cinemaapp.db.entities.MovieWithActors;
import com.elitsa.libraries.cinemaapp.utils.base.BaseViewModel;
import com.kinesis.kinesisapp.utils.base.ScreenState;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015J\u0014\u0010\u0016\u001a\u00020\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/ui/movie_list/mvvm/MovieListViewModel;", "Lcom/elitsa/libraries/cinemaapp/utils/base/BaseViewModel;", "movieListRepo", "Lcom/elitsa/libraries/cinemaapp/ui/movie_list/mvvm/MovieListRepository;", "(Lcom/elitsa/libraries/cinemaapp/ui/movie_list/mvvm/MovieListRepository;)V", "_movieList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/elitsa/libraries/cinemaapp/app/models/MovieCard;", "movieList", "Landroidx/lifecycle/LiveData;", "getMovieList", "()Landroidx/lifecycle/LiveData;", "savedMoviesList", "Lcom/elitsa/libraries/cinemaapp/db/entities/MovieWithActors;", "getSavedMoviesList", "getMovieListForCategory", "", "category", "", "page", "", "updateMovieList", "movieWithActors", "app_debug"})
public final class MovieListViewModel extends com.elitsa.libraries.cinemaapp.utils.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.elitsa.libraries.cinemaapp.app.models.MovieCard>> _movieList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.elitsa.libraries.cinemaapp.app.models.MovieCard>> movieList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.elitsa.libraries.cinemaapp.db.entities.MovieWithActors>> savedMoviesList = null;
    private final com.elitsa.libraries.cinemaapp.ui.movie_list.mvvm.MovieListRepository movieListRepo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.elitsa.libraries.cinemaapp.app.models.MovieCard>> getMovieList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.elitsa.libraries.cinemaapp.db.entities.MovieWithActors>> getSavedMoviesList() {
        return null;
    }
    
    public final void getMovieListForCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String category, int page) {
    }
    
    public final void updateMovieList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.elitsa.libraries.cinemaapp.db.entities.MovieWithActors> movieWithActors) {
    }
    
    @javax.inject.Inject()
    public MovieListViewModel(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.ui.movie_list.mvvm.MovieListRepository movieListRepo) {
        super();
    }
}