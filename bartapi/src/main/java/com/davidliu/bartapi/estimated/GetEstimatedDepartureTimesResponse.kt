package com.davidliu.bartapi.estimated

import com.davidliu.bartapi.common.ResponseRoot


data class GetEstimatedDepartureTimesResponse(
    val root: GetEstimatedDepartureTimesRoot
)

data class GetEstimatedDepartureTimesRoot(
    val station: List<EstimatedTimesStation>
) : ResponseRoot()

data class EstimatedTimesStation(
    val name: String,
    val abbr: String,
    val etd: List<EstimatedRoute>
)

data class EstimatedRoute(
    val destination: String,
    val abbr: String,
    val limited: Int,
    val estimate: List<EstimateDepartureTime>
)

data class EstimateDepartureTime(
    val minutes: Int,
    val platform: Int,
    val direction: String,
    val length: Int,
    val color: String,
    val hexcolor: String,
    val bikeflag: Boolean,
    val delay: Int
)