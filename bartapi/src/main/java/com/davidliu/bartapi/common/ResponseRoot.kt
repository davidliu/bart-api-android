package com.davidliu.bartapi.common

import com.google.gson.annotations.SerializedName

open class ResponseRoot() {
    @SerializedName("@id")
    lateinit var id: String
    lateinit var uri: Map<String, String>
    lateinit var date: String
    lateinit var time: String
    lateinit var message: String
}