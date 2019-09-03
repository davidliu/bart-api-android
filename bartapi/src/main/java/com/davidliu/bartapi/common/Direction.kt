package com.davidliu.bartapi.common

enum class Direction(val value: String) {
    NORTHBOUND("n"),
    SOUTHBOUND("s");

    override fun toString(): String {
        return value
    }

    companion object {
        fun fromString(str: String?) =
            when (str?.toLowerCase()?.get(0)) {
                'n' -> NORTHBOUND
                's' -> SOUTHBOUND
                else -> null
            }
    }
}