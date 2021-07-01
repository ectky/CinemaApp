package com.elitsa.libraries.cinemaapp.app

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.elitsa.libraries.cinemaapp.app.app_di.DaggerCinemaAppComponent
import com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppComponent
import com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppModule
import com.elitsa.libraries.cinemaapp.db.CinemaAppDatabase
import com.elitsa.libraries.cinemaapp.utils.Constants
class CinemaApp:  Application() {

    val appComponent: CinemaAppComponent by lazy {
        initComponent()
    }

    val database: CinemaAppDatabase by lazy {
        Room.databaseBuilder(appContext,
            CinemaAppDatabase::class.java,
            Constants.DB_NAME)
            .build()
    }

    companion object {

        lateinit var appInstance: CinemaApp
            private set

        val appContext: Context by lazy {
            appInstance.applicationContext
        }

    }

    override fun onCreate() {
        super.onCreate()
        appInstance = this
        initComponent()
    }

    private fun initComponent(): CinemaAppComponent {
        return DaggerCinemaAppComponent.builder()
            .cinemaAppModule(CinemaAppModule(appInstance)).build()
    }
}