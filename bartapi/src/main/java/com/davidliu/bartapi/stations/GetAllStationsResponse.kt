package com.davidliu.bartapi.stations

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.davidliu.bartapi.common.ResponseRoot
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class GetAllStationsResponse(
    val root: GetAllStationsRoot
) : Parcelable

@Parcelize
data class GetAllStationsRoot(
    @SerializedName("stations")
    val stations: AllStationsContainer
) : ResponseRoot(), Parcelable

@Parcelize
data class AllStationsContainer(
    @SerializedName("station")
    val stationList: List<StationMeta>
) : Parcelable

@Parcelize
@Entity
data class StationMeta(
    @SerializedName("abbr")
    @PrimaryKey
    val id: String,
    val name: String,
    val latitude: Double,
    val longitude: Double,
    val address: String,
    val city: String,
    val county: String,
    val state: String,
    val zipcode: Int
) : Parcelable