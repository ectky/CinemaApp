// Generated by data binding compiler. Do not edit!
package com.elitsa.libraries.cinemaapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.elitsa.libraries.cinemaapp.R;
import com.elitsa.libraries.cinemaapp.app.models.CategoryCard;
import com.elitsa.libraries.cinemaapp.ui.movie_list.MovieListController;
import com.elitsa.libraries.cinemaapp.ui.movie_list.mvvm.MovieListViewModel;
import com.elitsa.libraries.cinemaapp.utils.enums.LayoutManagerTypes;
import com.elitsa.libraries.cinemaapp.utils.views.MovieProgressView;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityMovieListBinding extends ViewDataBinding {
  @NonNull
  public final CollapsingToolbarLayout collapsingToolbar;

  @NonNull
  public final ImageView movieListBackgroundIv;

  @NonNull
  public final TextView movieListTitleTv;

  @NonNull
  public final TextView noMoviesTv;

  @NonNull
  public final MovieProgressView progressView;

  @Bindable
  protected CategoryCard mModel;

  @Bindable
  protected View.OnClickListener mNavBtnClickListener;

  @Bindable
  protected MovieListController mController;

  @Bindable
  protected LayoutManagerTypes mManagerType;

  @Bindable
  protected MovieListViewModel mViewModel;

  protected ActivityMovieListBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CollapsingToolbarLayout collapsingToolbar, ImageView movieListBackgroundIv,
      TextView movieListTitleTv, TextView noMoviesTv, MovieProgressView progressView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.collapsingToolbar = collapsingToolbar;
    this.movieListBackgroundIv = movieListBackgroundIv;
    this.movieListTitleTv = movieListTitleTv;
    this.noMoviesTv = noMoviesTv;
    this.progressView = progressView;
  }

  public abstract void setModel(@Nullable CategoryCard model);

  @Nullable
  public CategoryCard getModel() {
    return mModel;
  }

  public abstract void setNavBtnClickListener(@Nullable View.OnClickListener navBtnClickListener);

  @Nullable
  public View.OnClickListener getNavBtnClickListener() {
    return mNavBtnClickListener;
  }

  public abstract void setController(@Nullable MovieListController controller);

  @Nullable
  public MovieListController getController() {
    return mController;
  }

  public abstract void setManagerType(@Nullable LayoutManagerTypes managerType);

  @Nullable
  public LayoutManagerTypes getManagerType() {
    return mManagerType;
  }

  public abstract void setViewModel(@Nullable MovieListViewModel viewModel);

  @Nullable
  public MovieListViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityMovieListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_movie_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMovieListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMovieListBinding>inflateInternal(inflater, R.layout.activity_movie_list, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMovieListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_movie_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMovieListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMovieListBinding>inflateInternal(inflater, R.layout.activity_movie_list, null, false, component);
  }

  public static ActivityMovieListBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityMovieListBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityMovieListBinding)bind(component, view, R.layout.activity_movie_list);
  }
}
