package com.elitsa.libraries.cinemaapp.app.di;

import android.content.Context;
import android.os.Build;
import com.elitsa.libraries.cinemaapp.BuildConfig;
import com.elitsa.libraries.cinemaapp.app.CinemaApp;
import com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppScope;
import com.elitsa.libraries.cinemaapp.app.interceptor.ConnectivityInterceptor;
import com.elitsa.libraries.cinemaapp.utils.ApiKeys;
import dagger.Module;
import dagger.Provides;
import dagger.Reusable;
import okhttp3.logging.HttpLoggingInterceptor;
import java.io.File;
import java.util.concurrent.TimeUnit;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0004H\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/app/di/NetworkModule;", "", "()V", "provideCache", "Lokhttp3/Cache;", "cacheFile", "Ljava/io/File;", "provideCacheFile", "context", "Landroid/content/Context;", "provideInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "loggingInterceptor", "cache", "app_debug"})
@dagger.Module()
public final class NetworkModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppScope()
    @dagger.Provides()
    public final okhttp3.logging.HttpLoggingInterceptor provideInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppScope()
    @dagger.Provides()
    public final okhttp3.Cache provideCache(@org.jetbrains.annotations.NotNull()
    java.io.File cacheFile) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppScope()
    @dagger.Provides()
    public final java.io.File provideCacheFile(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppScope()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttpClient(@org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor loggingInterceptor, @org.jetbrains.annotations.NotNull()
    okhttp3.Cache cache) {
        return null;
    }
    
    public NetworkModule() {
        super();
    }
}