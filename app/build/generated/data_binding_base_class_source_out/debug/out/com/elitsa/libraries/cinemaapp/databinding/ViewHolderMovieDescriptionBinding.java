// Generated by data binding compiler. Do not edit!
package com.elitsa.libraries.cinemaapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.elitsa.libraries.cinemaapp.R;
import com.elitsa.libraries.cinemaapp.app.models.Movie;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ViewHolderMovieDescriptionBinding extends ViewDataBinding {
  @NonNull
  public final RatingBar ratingBar;

  @NonNull
  public final TextView textView;

  @Bindable
  protected Movie mMovie;

  protected ViewHolderMovieDescriptionBinding(Object _bindingComponent, View _root,
      int _localFieldCount, RatingBar ratingBar, TextView textView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ratingBar = ratingBar;
    this.textView = textView;
  }

  public abstract void setMovie(@Nullable Movie movie);

  @Nullable
  public Movie getMovie() {
    return mMovie;
  }

  @NonNull
  public static ViewHolderMovieDescriptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.view_holder_movie_description, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ViewHolderMovieDescriptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ViewHolderMovieDescriptionBinding>inflateInternal(inflater, R.layout.view_holder_movie_description, root, attachToRoot, component);
  }

  @NonNull
  public static ViewHolderMovieDescriptionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.view_holder_movie_description, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ViewHolderMovieDescriptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ViewHolderMovieDescriptionBinding>inflateInternal(inflater, R.layout.view_holder_movie_description, null, false, component);
  }

  public static ViewHolderMovieDescriptionBinding bind(@NonNull View view) {
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
  public static ViewHolderMovieDescriptionBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ViewHolderMovieDescriptionBinding)bind(component, view, R.layout.view_holder_movie_description);
  }
}
