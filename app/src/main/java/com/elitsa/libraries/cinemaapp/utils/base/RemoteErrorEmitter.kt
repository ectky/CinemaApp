package com.elitsa.libraries.cinemaapp.utils.base

interface RemoteErrorEmitter {
    fun onError(msg: String)
    fun onError(errorType: ErrorType)
}