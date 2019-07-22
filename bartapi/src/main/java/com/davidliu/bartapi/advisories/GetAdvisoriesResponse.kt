package com.davidliu.bartapi.advisories

import com.google.gson.annotations.SerializedName

data class GetAdvisoriesResponse(
    val root: GetAdvisoriesRoot
)

data class GetAdvisoriesRoot(
    @SerializedName("@id")
    val id: String,
    val date: String,
    val time: String,
    val bsa: List<Advisory>,
    val message: String
)

data class Advisory(
    val station: String,
    val description: Map<String, String>,
    @SerializedName("sms_text") val smsText: Map<String, String>
) {
    companion object {
        const val cdata = "#cdata-section"
    }
}