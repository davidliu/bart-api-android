package com.davidliu.bartapi

import com.davidliu.bartapi.advisories.GetAdvisoriesResponse
import com.davidliu.bartapi.common.Direction
import com.davidliu.bartapi.estimated.GetEstimatedDepartureTimesResponse
import com.davidliu.bartapi.routes.GetRouteInfoResponse
import com.davidliu.bartapi.routes.GetRoutesResponse
import com.davidliu.bartapi.stations.GetAllStationsResponse
import com.davidliu.bartapi.stations.GetStationInfoResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface BartApi {
    companion object {
        /**
         * This is the default public API key that BART supplies for use.
         * You can supply your own key or use this one if not available.
         */
        const val DEFAULT_PUBLIC_API_KEY = "MW9S-E7SL-26DU-VV8V"
    }

    @GET("bsa.aspx?cmd=bsa&json=y")
    fun getAdvisories(@Query("key") key: String = DEFAULT_PUBLIC_API_KEY): Call<GetAdvisoriesResponse>

    @GET("etd.aspx?cmd=etd&json=y")
    fun getEstimatedDepartureTimes(
        @Query("orig") station: String,
        @Query("plat") platform: Int? = null,
        @Query("dir") direction: Direction? = null,
        @Query("key") key: String = DEFAULT_PUBLIC_API_KEY
    ): Call<GetEstimatedDepartureTimesResponse>

    @GET("etd.aspx?cmd=etd&json=y")
    suspend fun getEstimatedDepartureTimesSuspend(
        @Query("orig") station: String,
        @Query("plat") platform: Int? = null,
        @Query("dir") direction: Direction? = null,
        @Query("key") key: String = DEFAULT_PUBLIC_API_KEY
    ): GetEstimatedDepartureTimesResponse

    @GET("route.aspx?cmd=routeinfo&json=y")
    fun getRouteInfo(
        @Query("route") route: Int,
        @Query("sched") sched: Int? = null,
        @Query("date") date: String = "now",
        @Query("key") key: String = DEFAULT_PUBLIC_API_KEY
    ): Call<GetRouteInfoResponse>

    @GET("route.aspx?cmd=routes&json=y")
    fun getRoutes(@Query("key") key: String = DEFAULT_PUBLIC_API_KEY): Call<GetRoutesResponse>

    @GET("stn.aspx?cmd=stninfo&json=y")
    fun getStationInfo(
        @Query("orig") station: String,
        @Query("key") key: String = DEFAULT_PUBLIC_API_KEY
    ): Call<GetStationInfoResponse>

    @GET("stn.aspx?cmd=stns&json=y")
    fun getAllStations(@Query("key") key: String = DEFAULT_PUBLIC_API_KEY): Call<GetAllStationsResponse>

    @GET("stn.aspx?cmd=stns&json=y")
    suspend fun getAllStationsSuspend(@Query("key") key: String = DEFAULT_PUBLIC_API_KEY): GetAllStationsResponse
}