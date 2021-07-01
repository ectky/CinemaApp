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
import java.lang.Deprecated;
import java.lang.Object;

public abstract class CardFeaturedMovieBinding extends ViewDataBinding {
  @Bindable
  protected String mImgUrl;

  protected CardFeaturedMovieBinding(Object _bindingComponent, View _root, int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setImgUrl(@Nullable String imgUrl);

  @Nullable
  public String getImgUrl() {
    return mImgUrl;
  }

  @NonNull
  public static CardFeaturedMovieBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.card_featured_movie, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static CardFeaturedMovieBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<CardFeaturedMovieBinding>inflateInternal(inflater, R.layout.card_featured_movie, root, attachToRoot, component);
  }

  @NonNull
  public static CardFeaturedMovieBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.card_featured_movie, null, false, component)
   */
  @NonNull
  @Deprecated
  public static CardFeaturedMovieBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<CardFeaturedMovieBinding>inflateInternal(inflater, R.layout.card_featured_movie, null, false, component);
  }

  public static CardFeaturedMovieBinding bind(@NonNull View view) {
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
  public static CardFeaturedMovieBinding bind(@NonNull View view, @Nullable Object component) {
    return (CardFeaturedMovieBinding)bind(component, view, R.layout.card_featured_movie);
  }
}
