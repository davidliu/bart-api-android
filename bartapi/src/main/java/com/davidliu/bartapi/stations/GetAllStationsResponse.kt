package com.davidliu.bartapi.stations

import com.davidliu.bartapi.common.ResponseRoot

data class GetAllStationsResponse(
    val root: GetAllStationsRoot
)

data class GetAllStationsRoot(
    val stations: AllStationsContainer
) : ResponseRoot()

data class AllStationsContainer(
    val station: List<StationMeta>
)

data class StationMeta(
    val name: String,
    val abbr: String,
    val latitude: Double,
    val longitude: Double,
    val address: String,
    val city: String,
    val county: String,
    val state: String,
    val zipcode: Int
)