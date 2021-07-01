package com.elitsa.libraries.cinemaapp.ui.movie_list.mvvm;

import androidx.lifecycle.LiveData;
import com.elitsa.libraries.cinemaapp.db.entities.MovieWithActors;
import com.elitsa.libraries.cinemaapp.utils.base.BaseLocalRepository;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/ui/movie_list/mvvm/MovieListLocalRepository;", "Lcom/elitsa/libraries/cinemaapp/ui/movie_list/mvvm/MovieListRepository$LocalRepository;", "Lcom/elitsa/libraries/cinemaapp/utils/base/BaseLocalRepository;", "()V", "getSavedMovies", "Landroidx/lifecycle/LiveData;", "", "Lcom/elitsa/libraries/cinemaapp/db/entities/MovieWithActors;", "app_debug"})
public final class MovieListLocalRepository extends com.elitsa.libraries.cinemaapp.utils.base.BaseLocalRepository implements com.elitsa.libraries.cinemaapp.ui.movie_list.mvvm.MovieListRepository.LocalRepository {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.elitsa.libraries.cinemaapp.db.entities.MovieWithActors>> getSavedMovies() {
        return null;
    }
    
    public MovieListLocalRepository() {
        super();
    }
}