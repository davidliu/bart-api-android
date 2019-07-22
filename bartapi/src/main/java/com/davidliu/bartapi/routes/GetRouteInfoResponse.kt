package com.davidliu.bartapi.routes

import com.davidliu.bartapi.common.ResponseRoot
import com.google.gson.annotations.SerializedName

data class GetRouteInfoResponse(
    val root: GetRouteInfoRoot
)

data class GetRouteInfoRoot(
    @SerializedName("sched_num")
    val scheduleNumber: Int,

    val routes: FullRouteContainer

):ResponseRoot()

data class FullRouteContainer(
    val route: FullRouteInfo
)

data class FullRouteInfo(
    val name: String,
    val abbr: String,
    val routeID: String,
    val number: Int,
    val origin: String,
    val destination: String,
    val direction: String,
    val hexcolor: String,
    val color: String,
    val holidays: Int,
    @SerializedName("num_stns") val stationCount: Int,
    val config: StationConfig
)

data class StationConfig(
    @SerializedName("station") val stationList: List<String>
)