package com.elitsa.libraries.cinemaapp.app.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Actor(val id: Int,
                 val name: String?,
                 val photoUrl: String?,
                 val movieId: Int
                 ) : Parcelable