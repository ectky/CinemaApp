package com.elitsa.libraries.cinemaapp.utils.views

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import com.elitsa.libraries.cinemaapp.R
import com.elitsa.libraries.cinemaapp.utils.inflateCustomView

class MovieProgressView  @JvmOverloads
constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0): FrameLayout(context, attrs, defStyleAttr){

    init {
        context.inflateCustomView(R.layout.movie_progress_view, this)
    }
}