package com.example.programminginfo.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class InformationData(
    val name: String,
    val image: Int,
    val description: String
):Parcelable