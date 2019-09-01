package com.davidliu.bartapi

import com.davidliu.bartapi.gson.BooleanSerializer
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import org.junit.Test
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ApiTest {

    val gson = GsonBuilder()
        .registerTypeAdapter(Boolean::class.java, BooleanSerializer())
        .create()
    val okHttpClient = OkHttpClient.Builder().build()
    val retrofit = Retrofit.Builder()
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .baseUrl("https://api.bart.gov/api/")
        .build()

    val api = retrofit.create(BartApi::class.java)

    @Test
    fun testAdvisories() {
        val advisories = api.getAdvisories().execute().body()
        println(advisories)
    }

    @Test
    fun testEstimatedTimes() {
        val estimates = api.getEstimatedDepartureTimes("RICH").execute().body()
        println(estimates)
    }

    @Test
    fun testRouteInfo() {
        val routeInfo = api.getRouteInfo(1).execute().body()
        println(routeInfo)
    }

    @Test
    fun testRoutes() {
        val allRoutes = api.getRoutes().execute().body()
        println(allRoutes)
    }

    @Test
    fun testStationInfo() {
        val stationInfo = api.getStationInfo("POWL").execute().body()
        println(stationInfo)
    }
    @Test
    fun testAllStations() {
        val allStations = api.getAllStations().execute().body()
        println(allStations)
    }
}
