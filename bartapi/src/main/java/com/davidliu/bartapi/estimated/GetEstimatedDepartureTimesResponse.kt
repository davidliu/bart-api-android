package com.davidliu.bartapi.estimated

import android.os.Parcelable
import com.davidliu.bartapi.common.ResponseRoot
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class GetEstimatedDepartureTimesResponse(
    val root: GetEstimatedDepartureTimesRoot
) : Parcelable

@Parcelize
data class GetEstimatedDepartureTimesRoot(
    val station: List<EstimatedTimesStation>
) : ResponseRoot(), Parcelable

@Parcelize
data class EstimatedTimesStation(
    val name: String,
    val abbr: String,
    @SerializedName("etd")
    val routes: List<EstimatedRoute>
) : Parcelable

@Parcelize
data class EstimatedRoute(
    val destination: String,
    val abbr: String,
    val limited: Int,
    @SerializedName("estimate")
    val estimates: List<EstimateDepartureTime>
) : Parcelable

@Parcelize
data class EstimateDepartureTime(
    val minutes: String,
    val platform: Int,
    val direction: String,
    val length: Int,
    val color: String,
    val hexcolor: String,
    val bikeflag: Boolean,
    val delay: Int
) : Parcelable