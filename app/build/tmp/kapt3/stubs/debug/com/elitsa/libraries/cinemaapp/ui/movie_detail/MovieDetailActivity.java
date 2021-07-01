package com.elitsa.libraries.cinemaapp.ui.movie_detail;

import android.os.Bundle;
import android.util.Log;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import com.elitsa.libraries.cinemaapp.R;
import com.elitsa.libraries.cinemaapp.app.CinemaApp;
import com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppComponent;
import com.elitsa.libraries.cinemaapp.app.di.ViewModelFactory;
import com.elitsa.libraries.cinemaapp.app.models.Movie;
import com.elitsa.libraries.cinemaapp.databinding.ActivityMovieDetailBinding;
import com.elitsa.libraries.cinemaapp.ui.movie_detail.di.DaggerMovieDetailComponent;
import com.elitsa.libraries.cinemaapp.ui.movie_detail.mvvm.MovieDetailViewModel;
import com.elitsa.libraries.cinemaapp.utils.Constants;
import com.elitsa.libraries.cinemaapp.utils.base.BaseActivity;
import com.kinesis.kinesisapp.utils.base.ScreenState;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0014J\b\u0010 \u001a\u00020\u001cH\u0016J\b\u0010!\u001a\u00020\u001cH\u0016J\u0012\u0010\"\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\u0018\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u001cH\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006+"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/ui/movie_detail/MovieDetailActivity;", "Lcom/elitsa/libraries/cinemaapp/utils/base/BaseActivity;", "Lcom/elitsa/libraries/cinemaapp/ui/movie_detail/MovieDetailCallback;", "()V", "binding", "Lcom/elitsa/libraries/cinemaapp/databinding/ActivityMovieDetailBinding;", "getBinding", "()Lcom/elitsa/libraries/cinemaapp/databinding/ActivityMovieDetailBinding;", "setBinding", "(Lcom/elitsa/libraries/cinemaapp/databinding/ActivityMovieDetailBinding;)V", "controller", "Lcom/elitsa/libraries/cinemaapp/ui/movie_detail/MovieDetailController;", "getController", "()Lcom/elitsa/libraries/cinemaapp/ui/movie_detail/MovieDetailController;", "controller$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/elitsa/libraries/cinemaapp/ui/movie_detail/mvvm/MovieDetailViewModel;", "getViewModel", "()Lcom/elitsa/libraries/cinemaapp/ui/movie_detail/mvvm/MovieDetailViewModel;", "viewModel$delegate", "viewModelFactory", "Lcom/elitsa/libraries/cinemaapp/app/di/ViewModelFactory;", "getViewModelFactory", "()Lcom/elitsa/libraries/cinemaapp/app/di/ViewModelFactory;", "setViewModelFactory", "(Lcom/elitsa/libraries/cinemaapp/app/di/ViewModelFactory;)V", "getMovieDetail", "", "initComponent", "appComponent", "Lcom/elitsa/libraries/cinemaapp/app/app_di/CinemaAppComponent;", "onBackButtonCallback", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onFavoriteCallback", "movie", "Lcom/elitsa/libraries/cinemaapp/app/models/Movie;", "isFavorite", "", "onStart", "app_debug"})
public final class MovieDetailActivity extends com.elitsa.libraries.cinemaapp.utils.base.BaseActivity implements com.elitsa.libraries.cinemaapp.ui.movie_detail.MovieDetailCallback {
    @org.jetbrains.annotations.NotNull()
    public com.elitsa.libraries.cinemaapp.databinding.ActivityMovieDetailBinding binding;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.elitsa.libraries.cinemaapp.app.di.ViewModelFactory<com.elitsa.libraries.cinemaapp.ui.movie_detail.mvvm.MovieDetailViewModel> viewModelFactory;
    private final kotlin.Lazy controller$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.elitsa.libraries.cinemaapp.databinding.ActivityMovieDetailBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.databinding.ActivityMovieDetailBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.elitsa.libraries.cinemaapp.app.di.ViewModelFactory<com.elitsa.libraries.cinemaapp.ui.movie_detail.mvvm.MovieDetailViewModel> getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.app.di.ViewModelFactory<com.elitsa.libraries.cinemaapp.ui.movie_detail.mvvm.MovieDetailViewModel> p0) {
    }
    
    private final com.elitsa.libraries.cinemaapp.ui.movie_detail.MovieDetailController getController() {
        return null;
    }
    
    private final com.elitsa.libraries.cinemaapp.ui.movie_detail.mvvm.MovieDetailViewModel getViewModel() {
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
    
    private final void getMovieDetail() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public void onBackButtonCallback() {
    }
    
    @java.lang.Override()
    public void onFavoriteCallback(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.app.models.Movie movie, boolean isFavorite) {
    }
    
    public MovieDetailActivity() {
        super();
    }
}