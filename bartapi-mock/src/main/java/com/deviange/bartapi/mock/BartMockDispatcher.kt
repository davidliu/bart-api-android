package com.deviange.bartapi.mock

import com.deviange.bartapi.mock.responses.*
import okhttp3.mockwebserver.Dispatcher
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.RecordedRequest
import java.net.URI

class BartMockDispatcher : Dispatcher() {

    val pathMap = mapOf(
        "bsa" to AdvisoryResponses.commandMap,
        "etd" to EstimateResponses.commandMap,
        "route" to RouteResponses.commandMap,
        "scheds" to ScheduleResponses.commandMap,
        "stn" to StationResponses.commandMap
    )

    override fun dispatch(request: RecordedRequest): MockResponse {
        val path = request.path ?: throw NullPointerException("path is null")

        try {

            val uri = URI(path)
            val target = uri.path
                .split('/')
                .last()

            val targetEntry = pathMap.entries
                .first { entry ->
                    target.indexOf(entry.key) == 0
                }
            val targetMap = targetEntry.value

            val queryParams = uri.query.split('&')
            val commandParam = queryParams.first { query ->
                query.indexOf("cmd") == 0
            }

            val command = commandParam.split('=')[1]
            val responseBody = targetMap[command]
                ?: throw IllegalArgumentException("unexpected request! $target")

            return MockResponse().setBody(responseBody)
        } catch (e: Throwable) {
            throw RuntimeException("path failed: $path", e)
        }
    }
}
