package com.elitsa.libraries.cinemaapp.app.app_di

import android.content.Context
import android.content.res.AssetManager
import android.content.res.Resources
import com.elitsa.libraries.cinemaapp.app.CinemaApp
import dagger.Module
import dagger.Provides
@Module
class CinemaAppModule(private val app: CinemaApp){
    @Provides
    @CinemaAppScope
    fun provideApp(): CinemaApp = app

    @Provides
    @CinemaAppScope
    fun provideResources(): Resources {
        return app.resources
    }

    @Provides
    @CinemaAppScope
    fun provideApplicationContext(): Context {
        return app
    }

    @Provides
    @CinemaAppScope
    fun provideAppComponent(appComponent: CinemaAppComponent): CinemaAppComponent {
        return appComponent
    }

    @Provides
    @CinemaAppScope
    fun provideAssets() : AssetManager {
        return app.assets
    }
}