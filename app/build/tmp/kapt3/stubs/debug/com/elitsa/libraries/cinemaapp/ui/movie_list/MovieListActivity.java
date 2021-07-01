package com.elitsa.libraries.cinemaapp.ui.movie_list;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import com.elitsa.libraries.cinemaapp.R;
import com.elitsa.libraries.cinemaapp.app.CinemaApp;
import com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppComponent;
import com.elitsa.libraries.cinemaapp.app.di.ViewModelFactory;
import com.elitsa.libraries.cinemaapp.app.models.CategoryCard;
import com.elitsa.libraries.cinemaapp.app.models.MovieCard;
import com.elitsa.libraries.cinemaapp.databinding.ActivityMovieListBinding;
import com.elitsa.libraries.cinemaapp.ui.movie_detail.MovieDetailActivity;
import com.elitsa.libraries.cinemaapp.ui.movie_list.di.DaggerMovieListComponent;
import com.elitsa.libraries.cinemaapp.ui.movie_list.mvvm.MovieListViewModel;
import com.elitsa.libraries.cinemaapp.utils.Constants;
import com.elitsa.libraries.cinemaapp.utils.ModelsFactory;
import com.elitsa.libraries.cinemaapp.utils.base.BaseActivity;
import com.elitsa.libraries.cinemaapp.utils.enums.Grid;
import com.kinesis.kinesisapp.utils.base.ScreenState;
import kotlinx.android.synthetic.main.activity_movie_list.*;
import java.util.*;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0014J\u0012\u0010\u0018\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0014H\u0014J\b\u0010\u001f\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006 "}, d2 = {"Lcom/elitsa/libraries/cinemaapp/ui/movie_list/MovieListActivity;", "Lcom/elitsa/libraries/cinemaapp/utils/base/BaseActivity;", "()V", "binding", "Lcom/elitsa/libraries/cinemaapp/databinding/ActivityMovieListBinding;", "isUserList", "", "viewModel", "Lcom/elitsa/libraries/cinemaapp/ui/movie_list/mvvm/MovieListViewModel;", "getViewModel", "()Lcom/elitsa/libraries/cinemaapp/ui/movie_list/mvvm/MovieListViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewModelFactory", "Lcom/elitsa/libraries/cinemaapp/app/di/ViewModelFactory;", "getViewModelFactory", "()Lcom/elitsa/libraries/cinemaapp/app/di/ViewModelFactory;", "setViewModelFactory", "(Lcom/elitsa/libraries/cinemaapp/app/di/ViewModelFactory;)V", "getMovies", "", "initComponent", "appComponent", "Lcom/elitsa/libraries/cinemaapp/app/app_di/CinemaAppComponent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onMovieCardClick", "movieCard", "Lcom/elitsa/libraries/cinemaapp/app/models/MovieCard;", "onStart", "setupObservers", "app_debug"})
public final class MovieListActivity extends com.elitsa.libraries.cinemaapp.utils.base.BaseActivity {
    private com.elitsa.libraries.cinemaapp.databinding.ActivityMovieListBinding binding;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.elitsa.libraries.cinemaapp.app.di.ViewModelFactory<com.elitsa.libraries.cinemaapp.ui.movie_list.mvvm.MovieListViewModel> viewModelFactory;
    private final kotlin.Lazy viewModel$delegate = null;
    private boolean isUserList;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.elitsa.libraries.cinemaapp.app.di.ViewModelFactory<com.elitsa.libraries.cinemaapp.ui.movie_list.mvvm.MovieListViewModel> getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.app.di.ViewModelFactory<com.elitsa.libraries.cinemaapp.ui.movie_list.mvvm.MovieListViewModel> p0) {
    }
    
    private final com.elitsa.libraries.cinemaapp.ui.movie_list.mvvm.MovieListViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void initComponent(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppComponent appComponent) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    private final void setupObservers() {
    }
    
    private final void getMovies() {
    }
    
    private final void onMovieCardClick(com.elitsa.libraries.cinemaapp.app.models.MovieCard movieCard) {
    }
    
    public MovieListActivity() {
        super();
    }
}