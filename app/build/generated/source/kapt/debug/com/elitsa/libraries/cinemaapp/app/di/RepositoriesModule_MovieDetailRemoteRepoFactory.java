// Generated by Dagger (https://dagger.dev).
package com.elitsa.libraries.cinemaapp.app.di;

import com.elitsa.libraries.cinemaapp.app.network.api.MovieDetailApi;
import com.elitsa.libraries.cinemaapp.ui.movie_detail.mvvm.MovieDetailRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RepositoriesModule_MovieDetailRemoteRepoFactory implements Factory<MovieDetailRepository.RemoteRepository> {
  private final RepositoriesModule module;

  private final Provider<MovieDetailApi> movieDetailApiProvider;

  public RepositoriesModule_MovieDetailRemoteRepoFactory(RepositoriesModule module,
      Provider<MovieDetailApi> movieDetailApiProvider) {
    this.module = module;
    this.movieDetailApiProvider = movieDetailApiProvider;
  }

  @Override
  public MovieDetailRepository.RemoteRepository get() {
    return movieDetailRemoteRepo(module, movieDetailApiProvider.get());
  }

  public static RepositoriesModule_MovieDetailRemoteRepoFactory create(RepositoriesModule module,
      Provider<MovieDetailApi> movieDetailApiProvider) {
    return new RepositoriesModule_MovieDetailRemoteRepoFactory(module, movieDetailApiProvider);
  }

  public static MovieDetailRepository.RemoteRepository movieDetailRemoteRepo(
      RepositoriesModule instance, MovieDetailApi movieDetailApi) {
    return Preconditions.checkNotNull(instance.movieDetailRemoteRepo(movieDetailApi), "Cannot return null from a non-@Nullable @Provides method");
  }
}