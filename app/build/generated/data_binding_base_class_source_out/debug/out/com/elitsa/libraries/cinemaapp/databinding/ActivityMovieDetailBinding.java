// Generated by data binding compiler. Do not edit!
package com.elitsa.libraries.cinemaapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.elitsa.libraries.cinemaapp.R;
import com.elitsa.libraries.cinemaapp.ui.movie_detail.MovieDetailController;
import com.elitsa.libraries.cinemaapp.ui.movie_detail.mvvm.MovieDetailViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityMovieDetailBinding extends ViewDataBinding {
  @Bindable
  protected MovieDetailController mController;

  @Bindable
  protected MovieDetailViewModel mViewModel;

  protected ActivityMovieDetailBinding(Object _bindingComponent, View _root, int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setController(@Nullable MovieDetailController controller);

  @Nullable
  public MovieDetailController getController() {
    return mController;
  }

  public abstract void setViewModel(@Nullable MovieDetailViewModel viewModel);

  @Nullable
  public MovieDetailViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityMovieDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_movie_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMovieDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMovieDetailBinding>inflateInternal(inflater, R.layout.activity_movie_detail, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMovieDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_movie_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMovieDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMovieDetailBinding>inflateInternal(inflater, R.layout.activity_movie_detail, null, false, component);
  }

  public static ActivityMovieDetailBinding bind(@NonNull View view) {
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
  public static ActivityMovieDetailBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityMovieDetailBinding)bind(component, view, R.layout.activity_movie_detail);
  }
}