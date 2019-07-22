package com.davidliu.bartapi.advisories

import com.davidliu.bartapi.common.ResponseRoot
import com.google.gson.annotations.SerializedName

data class GetAdvisoriesResponse(
    val root: GetAdvisoriesRoot
)

data class GetAdvisoriesRoot(
    val bsa: List<Advisory>
) : ResponseRoot() {
}

data class Advisory(
    val station: String,
    val description: Map<String, String>,
    @SerializedName("sms_text") val smsText: Map<String, String>
)