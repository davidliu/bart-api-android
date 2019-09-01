package com.davidliu.bartapi.stations

import android.os.Parcelable
import com.davidliu.bartapi.common.CDataString
import com.davidliu.bartapi.common.ResponseRoot
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class GetStationInfoResponse(
    val root: GetStationInfoRoot
) : Parcelable

@Parcelize
data class GetStationInfoRoot(
    val stations: StationInfoContainer
) : ResponseRoot(), Parcelable

@Parcelize
data class StationInfoContainer(
    val station: StationInfo
) : Parcelable

@Parcelize
data class StationInfo(
    val name: String,
    val abbr: String,
    @SerializedName("gtfs_latitude") val latitude: Double,
    @SerializedName("gtfs_longitude") val longitude: Double,
    val address: String,
    val city: String,
    val county: String,
    val state: String,
    val zipcode: Int,
    @SerializedName("north_routes") val northRoutes: RouteListContainer,
    @SerializedName("south_routes") val southRoutes: RouteListContainer,
    @SerializedName("north_platforms") val northPlatforms: PlatformListContainer,
    @SerializedName("south_platforms") val southPlatforms: PlatformListContainer,
    @SerializedName("platform_info") val platformInfo: String,
    @SerializedName("intro") val intro: CDataString,
    @SerializedName("cross_street") val crossStreet: CDataString,
    @SerializedName("food") val food: CDataString,
    @SerializedName("shopping") val shopping: CDataString,
    @SerializedName("attraction") val attraction: CDataString,
    @SerializedName("link") val link: CDataString
) : Parcelable

@Parcelize
data class RouteListContainer(
    @SerializedName("route")
    val list: List<String>
) : Parcelable

@Parcelize
data class PlatformListContainer(
    @SerializedName("platform")
    val list: List<String>
) : Parcelable
