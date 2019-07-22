package com.davidliu.bartapi

import com.davidliu.bartapi.advisories.GetAdvisoriesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface BartApi {
    companion object {
        const val DEFAULT_PUBLIC_API_KEY = "MW9S-E7SL-26DU-VV8V"
    }


    @GET("bsa.aspx?cmd=bsa&json=y")
    fun getAdvisories(@Query("key") key: String): Call<GetAdvisoriesResponse>
}