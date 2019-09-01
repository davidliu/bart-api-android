package com.davidliu.bartapi.common

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CDataString(
    @SerializedName("#cdata-section") val value: String
) : Parcelable