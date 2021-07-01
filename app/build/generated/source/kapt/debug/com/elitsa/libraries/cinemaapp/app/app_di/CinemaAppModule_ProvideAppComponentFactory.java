// Generated by Dagger (https://dagger.dev).
package com.elitsa.libraries.cinemaapp.app.app_di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CinemaAppModule_ProvideAppComponentFactory implements Factory<CinemaAppComponent> {
  private final CinemaAppModule module;

  private final Provider<CinemaAppComponent> appComponentProvider;

  public CinemaAppModule_ProvideAppComponentFactory(CinemaAppModule module,
      Provider<CinemaAppComponent> appComponentProvider) {
    this.module = module;
    this.appComponentProvider = appComponentProvider;
  }

  @Override
  public CinemaAppComponent get() {
    return provideAppComponent(module, appComponentProvider.get());
  }

  public static CinemaAppModule_ProvideAppComponentFactory create(CinemaAppModule module,
      Provider<CinemaAppComponent> appComponentProvider) {
    return new CinemaAppModule_ProvideAppComponentFactory(module, appComponentProvider);
  }

  public static CinemaAppComponent provideAppComponent(CinemaAppModule instance,
      CinemaAppComponent appComponent) {
    return Preconditions.checkNotNull(instance.provideAppComponent(appComponent), "Cannot return null from a non-@Nullable @Provides method");
  }
}
