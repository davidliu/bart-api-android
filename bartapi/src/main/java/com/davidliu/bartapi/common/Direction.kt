package com.davidliu.bartapi.common

import com.google.gson.annotations.SerializedName

enum class Direction {
    @SerializedName("n")
    NORTHBOUND,

    @SerializedName("s")
    SOUTHBOUND,
}