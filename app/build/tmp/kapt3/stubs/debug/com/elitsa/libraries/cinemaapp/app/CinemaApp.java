package com.elitsa.libraries.cinemaapp.app;

import android.app.Application;
import android.content.Context;
import androidx.room.Room;
import com.elitsa.libraries.cinemaapp.app.app_di.DaggerCinemaAppComponent;
import com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppComponent;
import com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppModule;
import com.elitsa.libraries.cinemaapp.db.CinemaAppDatabase;
import com.elitsa.libraries.cinemaapp.utils.Constants;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0012"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/app/CinemaApp;", "Landroid/app/Application;", "()V", "appComponent", "Lcom/elitsa/libraries/cinemaapp/app/app_di/CinemaAppComponent;", "getAppComponent", "()Lcom/elitsa/libraries/cinemaapp/app/app_di/CinemaAppComponent;", "appComponent$delegate", "Lkotlin/Lazy;", "database", "Lcom/elitsa/libraries/cinemaapp/db/CinemaAppDatabase;", "getDatabase", "()Lcom/elitsa/libraries/cinemaapp/db/CinemaAppDatabase;", "database$delegate", "initComponent", "onCreate", "", "Companion", "app_debug"})
public final class CinemaApp extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy appComponent$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy database$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static com.elitsa.libraries.cinemaapp.app.CinemaApp appInstance;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy appContext$delegate = null;
    public static final com.elitsa.libraries.cinemaapp.app.CinemaApp.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppComponent getAppComponent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.elitsa.libraries.cinemaapp.db.CinemaAppDatabase getDatabase() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppComponent initComponent() {
        return null;
    }
    
    public CinemaApp() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/elitsa/libraries/cinemaapp/app/CinemaApp$Companion;", "", "()V", "appContext", "Landroid/content/Context;", "getAppContext", "()Landroid/content/Context;", "appContext$delegate", "Lkotlin/Lazy;", "<set-?>", "Lcom/elitsa/libraries/cinemaapp/app/CinemaApp;", "appInstance", "getAppInstance", "()Lcom/elitsa/libraries/cinemaapp/app/CinemaApp;", "setAppInstance", "(Lcom/elitsa/libraries/cinemaapp/app/CinemaApp;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.elitsa.libraries.cinemaapp.app.CinemaApp getAppInstance() {
            return null;
        }
        
        private final void setAppInstance(com.elitsa.libraries.cinemaapp.app.CinemaApp p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getAppContext() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}