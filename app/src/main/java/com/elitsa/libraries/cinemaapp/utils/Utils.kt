package com.elitsa.libraries.cinemaapp.utils

import com.elitsa.libraries.cinemaapp.app.CinemaApp

object Utils {

    fun getString(resource: Int) = CinemaApp.appContext.getString(resource)

    fun buildImageString(path: String) = "${Constants.BASE_IMG_URL}${path}"
}