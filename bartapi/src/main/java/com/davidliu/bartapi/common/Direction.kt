package com.davidliu.bartapi.common

enum class Direction(val value: String) {
    NORTHBOUND("n"),
    SOUTHBOUND("s");

    override fun toString(): String {
        return value
    }
}