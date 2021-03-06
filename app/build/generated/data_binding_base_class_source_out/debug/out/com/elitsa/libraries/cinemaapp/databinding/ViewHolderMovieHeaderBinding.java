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
import com.elitsa.libraries.cinemaapp.app.models.Movie;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ViewHolderMovieHeaderBinding extends ViewDataBinding {
  @Bindable
  protected View.OnClickListener mBackButtonClickListener;

  @Bindable
  protected View.OnClickListener mLikeButtonClickListener;

  @Bindable
  protected Boolean mIsSaved;

  @Bindable
  protected Movie mMovie;

  protected ViewHolderMovieHeaderBinding(Object _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setBackButtonClickListener(
      @Nullable View.OnClickListener backButtonClickListener);

  @Nullable
  public View.OnClickListener getBackButtonClickListener() {
    return mBackButtonClickListener;
  }

  public abstract void setLikeButtonClickListener(
      @Nullable View.OnClickListener likeButtonClickListener);

  @Nullable
  public View.OnClickListener getLikeButtonClickListener() {
    return mLikeButtonClickListener;
  }

  public abstract void setIsSaved(@Nullable Boolean isSaved);

  @Nullable
  public Boolean getIsSaved() {
    return mIsSaved;
  }

  public abstract void setMovie(@Nullable Movie movie);

  @Nullable
  public Movie getMovie() {
    return mMovie;
  }

  @NonNull
  public static ViewHolderMovieHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.view_holder_movie_header, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ViewHolderMovieHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ViewHolderMovieHeaderBinding>inflateInternal(inflater, R.layout.view_holder_movie_header, root, attachToRoot, component);
  }

  @NonNull
  public static ViewHolderMovieHeaderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.view_holder_movie_header, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ViewHolderMovieHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ViewHolderMovieHeaderBinding>inflateInternal(inflater, R.layout.view_holder_movie_header, null, false, component);
  }

  public static ViewHolderMovieHeaderBinding bind(@NonNull View view) {
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
  public static ViewHolderMovieHeaderBinding bind(@NonNull View view, @Nullable Object component) {
    return (ViewHolderMovieHeaderBinding)bind(component, view, R.layout.view_holder_movie_header);
  }
}
