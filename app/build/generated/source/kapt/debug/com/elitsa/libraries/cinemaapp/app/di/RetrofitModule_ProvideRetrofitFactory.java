// Generated by Dagger (https://dagger.dev).
package com.elitsa.libraries.cinemaapp.app.di;

import com.squareup.moshi.Moshi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RetrofitModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final RetrofitModule module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  private final Provider<String> urlProvider;

  private final Provider<Moshi> moshiProvider;

  public RetrofitModule_ProvideRetrofitFactory(RetrofitModule module,
      Provider<OkHttpClient> okHttpClientProvider, Provider<String> urlProvider,
      Provider<Moshi> moshiProvider) {
    this.module = module;
    this.okHttpClientProvider = okHttpClientProvider;
    this.urlProvider = urlProvider;
    this.moshiProvider = moshiProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(module, okHttpClientProvider.get(), urlProvider.get(), moshiProvider.get());
  }

  public static RetrofitModule_ProvideRetrofitFactory create(RetrofitModule module,
      Provider<OkHttpClient> okHttpClientProvider, Provider<String> urlProvider,
      Provider<Moshi> moshiProvider) {
    return new RetrofitModule_ProvideRetrofitFactory(module, okHttpClientProvider, urlProvider, moshiProvider);
  }

  public static Retrofit provideRetrofit(RetrofitModule instance, OkHttpClient okHttpClient,
      String url, Moshi moshi) {
    return Preconditions.checkNotNull(instance.provideRetrofit(okHttpClient, url, moshi), "Cannot return null from a non-@Nullable @Provides method");
  }
}
