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
class ExampleUnitTest {

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
    fun testAdvisoriesApi() {
        val advisories = api.getAdvisories().execute().body()
        println(advisories)
    }

    @Test
    fun testEstimatedTimesApi() {
        val estimates = api.getEstimatedDepartureTimes("RICH").execute().body()
        println(estimates)
    }
}
