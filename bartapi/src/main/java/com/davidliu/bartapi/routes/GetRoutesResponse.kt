package com.davidliu.bartapi.routes

import com.davidliu.bartapi.common.ResponseRoot
import com.google.gson.annotations.SerializedName

data class GetRoutesResponse(
    val root: GetRoutesRoot
)

data class GetRoutesRoot(
    @SerializedName("sched_num")
    val scheduleNumber: Int,

    val routes: RoutesContainer

) : ResponseRoot()

data class RoutesContainer(
    val route: List<RouteMeta>
)

data class RouteMeta(
    val name: String,
    val abbr: String,
    val routeID: String,
    val number: Int,
    val hexcolor: String,
    val color: String
)