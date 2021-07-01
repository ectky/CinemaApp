package com.elitsa.libraries.cinemaapp.app.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
@Parcelize
data class CategoryCard(val id: Int,
                        val title: String = "",
                        val colors: List<Int> = listOf(),
                        val imgUrl: String = "") : Parcelable