package com.elitsa.libraries.cinemaapp.app.app_di;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.elitsa.libraries.cinemaapp.app.CinemaApp;
import dagger.Module;
import dagger.Provides;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0007J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/app/app_di/CinemaAppModule;", "", "app", "Lcom/elitsa/libraries/cinemaapp/app/CinemaApp;", "(Lcom/elitsa/libraries/cinemaapp/app/CinemaApp;)V", "provideApp", "provideAppComponent", "Lcom/elitsa/libraries/cinemaapp/app/app_di/CinemaAppComponent;", "appComponent", "provideApplicationContext", "Landroid/content/Context;", "provideAssets", "Landroid/content/res/AssetManager;", "provideResources", "Landroid/content/res/Resources;", "app_debug"})
@dagger.Module()
public final class CinemaAppModule {
    private final com.elitsa.libraries.cinemaapp.app.CinemaApp app = null;
    
    @org.jetbrains.annotations.NotNull()
    @CinemaAppScope()
    @dagger.Provides()
    public final com.elitsa.libraries.cinemaapp.app.CinemaApp provideApp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @CinemaAppScope()
    @dagger.Provides()
    public final android.content.res.Resources provideResources() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @CinemaAppScope()
    @dagger.Provides()
    public final android.content.Context provideApplicationContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @CinemaAppScope()
    @dagger.Provides()
    public final com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppComponent provideAppComponent(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppComponent appComponent) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @CinemaAppScope()
    @dagger.Provides()
    public final android.content.res.AssetManager provideAssets() {
        return null;
    }
    
    public CinemaAppModule(@org.jetbrains.annotations.NotNull()
    com.elitsa.libraries.cinemaapp.app.CinemaApp app) {
        super();
    }
}