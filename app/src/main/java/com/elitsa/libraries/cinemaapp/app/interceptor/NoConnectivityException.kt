package com.elitsa.libraries.cinemaapp.app.interceptor

import com.elitsa.libraries.cinemaapp.R
import com.elitsa.libraries.cinemaapp.utils.Utils
import java.io.IOException

class NoConnectivityException : IOException() {
    override val message: String?
        get() = Utils.getString(R.string.connectivity_exception)
}
