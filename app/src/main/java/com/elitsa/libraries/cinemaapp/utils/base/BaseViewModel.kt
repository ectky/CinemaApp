package com.elitsa.libraries.cinemaapp.utils.base

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kinesis.kinesisapp.utils.base.ScreenState

abstract class BaseViewModel : ViewModel(), RemoteErrorEmitter {

    val mutableProgress = MutableLiveData<Int>(View.GONE)
    val mutableScreenState = MutableLiveData<ScreenState>().apply { value = ScreenState.RENDER }
    val mutableErrorMessage = MutableLiveData<String>()
    val mutableSuccessMessage = MutableLiveData<String>()
    val mutableErrorType = MutableLiveData<ErrorType>()


    override fun onError(errorType: ErrorType) {
        mutableErrorType.postValue(errorType)
    }

    override fun onError(msg: String) {
        mutableErrorMessage.postValue(msg)
    }

}