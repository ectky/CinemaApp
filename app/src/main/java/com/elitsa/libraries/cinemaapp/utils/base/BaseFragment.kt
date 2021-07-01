package com.elitsa.libraries.cinemaapp.utils.base

import android.view.View
import android.widget.TextView
import androidx.annotation.LayoutRes
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.navOptions
import com.elitsa.libraries.cinemaapp.R
import com.elitsa.libraries.cinemaapp.app.app_di.CinemaAppComponent
import com.elitsa.libraries.cinemaapp.utils.Utils
import com.elitsa.libraries.cinemaapp.utils.longSnackbar
import com.elitsa.libraries.cinemaapp.utils.snackbar

abstract class BaseFragment : Fragment {

    protected val unknownErrorMessage: String by lazy {
        Utils.getString(R.string.unknown_error)
    }
    protected val timeoutErrorMessage: String by lazy {
        Utils.getString(R.string.try_again)
    }
    protected val noInternetError: String by lazy {
        Utils.getString(R.string.no_internet)
    }

    protected var fragmentView: View? = null

    constructor() : super()
    constructor(@LayoutRes layout: Int) : super(layout)
    protected abstract fun initComponent(appComponent: CinemaAppComponent)


    override fun onDestroyView() {
        super.onDestroyView()
        fragmentView = null
    }

    fun showSnackError(msg: String, long: Boolean = false) {
        val snack = if (!long) fragmentView?.snackbar(msg)
        else fragmentView?.longSnackbar(msg)
        snack?.view?.setBackgroundColor(
            ContextCompat.getColor(
                requireContext(),
                R.color.colorRedError
            )
        )
        val textView =
            snack?.view?.findViewById(com.google.android.material.R.id.snackbar_text) as TextView //Get reference of snackbar textview
        textView.maxLines = 5
        snack.show()
    }

    fun showSnackError(msg: Int, long: Boolean = false) {
        val snack = if (!long) fragmentView?.snackbar(msg)
        else fragmentView?.longSnackbar(msg)
        snack?.view?.setBackgroundColor(
            ContextCompat.getColor(
                requireContext(),
                R.color.colorRedError
            )
        )
        val textView =
            snack?.view?.findViewById(com.google.android.material.R.id.snackbar_text) as TextView //Get reference of snackbar textview
        textView.maxLines = 5
        snack.show()
    }

    fun showSnackSuccess(msg: String, long: Boolean = false) {
        val snack = if (!long) fragmentView?.snackbar(msg)
        else fragmentView?.longSnackbar(msg)
        snack?.view?.setBackgroundColor(
            ContextCompat.getColor(
                requireContext(),
                R.color.colorSuccess
            )
        )
        snack?.show()
    }

    fun showSnackSuccess(msg: Int, long: Boolean = false) {
        val snack = if (!long) fragmentView?.snackbar(msg)
        else fragmentView?.longSnackbar(msg)
        snack?.view?.setBackgroundColor(
            ContextCompat.getColor(
                requireContext(),
                R.color.colorSuccess
            )
        )
        snack?.show()
    }

    fun showErrorMessage(errorType: ErrorType) {
        when (errorType) {
            ErrorType.NETWORK -> showSnackError(noInternetError)
            ErrorType.TIMEOUT -> showSnackError(timeoutErrorMessage)
            ErrorType.UNKNOWN -> showSnackError(unknownErrorMessage)
            ErrorType.SESSION_EXPIRED -> {}
        }
    }

    protected fun getDefaultNavOptions(fade: Boolean = false) = navOptions {
        if (!fade) {
            anim {
                enter = R.anim.slide_in_right
                exit = R.anim.slide_out_left
                popExit = R.anim.slide_out_right
                popEnter = R.anim.slide_in_left
            }
        } else {
            anim {
                enter = R.anim.fade_in
                exit = R.anim.fade_out
                popExit = R.anim.fade_out
                popEnter = R.anim.fade_in
            }
        }
    }

}