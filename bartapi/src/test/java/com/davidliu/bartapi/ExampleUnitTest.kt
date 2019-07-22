package com.davidliu.bartapi

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
    @Test
    fun testApi() {
        val gson = GsonBuilder().create()
        val okHttpClient = OkHttpClient.Builder().build()
        val retrofit = Retrofit.Builder()
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .baseUrl("https://api.bart.gov/api/")
            .build()

        val api = retrofit.create(BartApi::class.java)
        val advisories = api.getAdvisories(BartApi.DEFAULT_PUBLIC_API_KEY).execute().body()
        println(advisories)

    }
}
