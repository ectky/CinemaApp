package com.elitsa.libraries.cinemaapp.app.di;

import android.content.res.Resources;
import com.elitsa.libraries.cinemaapp.R;
import com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppScope;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory;
import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\bH\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/app/di/RetrofitModule;", "", "()V", "provideBaseUrl", "", "resources", "Landroid/content/res/Resources;", "provideMoshi", "Lcom/squareup/moshi/Moshi;", "provideRetrofit", "Lretrofit2/Retrofit;", "okHttpClient", "Lokhttp3/OkHttpClient;", "url", "moshi", "app_debug"})
@dagger.Module(includes = {com.elitsa.libraries.cinemaapp.app.di.NetworkModule.class})
public final class RetrofitModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppScope()
    @dagger.Provides()
    public final java.lang.String provideBaseUrl(@org.jetbrains.annotations.NotNull()
    android.content.res.Resources resources) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppScope()
    @dagger.Provides()
    public final com.squareup.moshi.Moshi provideMoshi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppScope()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi) {
        return null;
    }
    
    public RetrofitModule() {
        super();
    }
}