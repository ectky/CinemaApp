package com.elitsa.libraries.cinemaapp.ui.home

import android.view.View
import com.elitsa.libraries.cinemaapp.app.models.CategoryCard

interface HomeItemClickListener {
    fun onItemClicked(view: View, model: CategoryCard)
}