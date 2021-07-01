package com.elitsa.libraries.cinemaapp.utils.base

import com.elitsa.libraries.cinemaapp.app.CinemaApp

abstract class BaseLocalRepository {
    protected val database = CinemaApp.appInstance.database
}