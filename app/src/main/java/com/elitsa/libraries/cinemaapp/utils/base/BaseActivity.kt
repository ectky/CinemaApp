package com.elitsa.libraries.cinemaapp.utils.base

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.navigation.navOptions
import com.elitsa.libraries.cinemaapp.R
import com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppComponent
import com.elitsa.libraries.cinemaapp.utils.Utils
import com.elitsa.libraries.cinemaapp.utils.indefiniteSnackbar
import com.elitsa.libraries.cinemaapp.utils.longSnackbar
import com.elitsa.libraries.cinemaapp.utils.snackbar

abstract class BaseActivity: AppCompatActivity {

    protected val unknownErrorMessage: String by lazy {
        Utils.getString(R.string.unknown_error)
    }
    protected val timeoutErrorMessage: String by lazy {
        Utils.getString(R.string.try_again)
    }
    protected val noInternetError: String by lazy {
        Utils.getString(R.string.no_internet)
    }

    private val mainView: View by lazy {
        findViewById<View>(android.R.id.content)
    }

    constructor():super()
    constructor(@LayoutRes layout: Int):super(layout)
    protected abstract fun initComponent(appComponent: CinemaAppComponent)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun showSnackError(msg : String, long: Boolean = false){
        val snack = if(!long) mainView.snackbar(msg)
        else mainView.longSnackbar(msg)
        snack.view.setBackgroundColor(ContextCompat.getColor(this, R.color.colorRedError))
        snack.show()
    }

    fun showSnackError(msg : Int, long: Boolean = false){
        val snack = if(!long)mainView.snackbar(msg)
        else mainView.longSnackbar(msg)
        snack.view.setBackgroundColor(ContextCompat.getColor(this, R.color.colorRedError))
        snack.show()
    }

    fun showSnackErrorWithAction(msg: String, action: () -> Unit){
        val snackbar = mainView.indefiniteSnackbar(msg)
        snackbar.setAction(R.string.retry_text){ action() }
        snackbar.view.setBackgroundColor(ContextCompat.getColor(this, R.color.colorRedError))

        snackbar.show()
    }

    fun showSnackErrorWithAction(msg: Int, action: () -> Unit){
        val snackbar = mainView.indefiniteSnackbar(msg)
        snackbar.setAction(R.string.retry_text){ action() }
        snackbar.view.setBackgroundColor(ContextCompat.getColor(this, R.color.colorRedError))

        snackbar.show()
    }

    fun showSnackSuccess(msg : String, long: Boolean = false){
        val snack = if(!long)mainView.snackbar(msg)
        else mainView.longSnackbar(msg)
        val textView =
            snack.view.findViewById(com.google.android.material.R.id.snackbar_text) as TextView //Get reference of snackbar textview
        textView.maxLines = 5
        snack.view.setBackgroundColor(ContextCompat.getColor(this, R.color.colorSuccess))
        snack.show()
    }

    fun showSnackSuccess(msg : Int, long: Boolean = false){
        val snack = if(!long)mainView.snackbar(msg)
        else mainView.longSnackbar(msg)
        snack.view.setBackgroundColor(ContextCompat.getColor(this, R.color.colorSuccess))
        snack.show()
    }

    fun getDefaultNavOptions() = navOptions {
        anim {
            enter = android.R.anim.fade_in
            exit = android.R.anim.fade_out
            popExit = android.R.anim.fade_out
            popEnter = android.R.anim.fade_in
        }
    }

    fun showErrorMessage(errorType: ErrorType){
        when(errorType){
            ErrorType.NETWORK -> showSnackError(noInternetError)
            ErrorType.TIMEOUT -> showSnackError(timeoutErrorMessage)
            ErrorType.UNKNOWN -> showSnackError(unknownErrorMessage)
            ErrorType.SESSION_EXPIRED -> {}
        }
    }
}