package de.jeremias_groehl

import de.jeremias_groehl.plugins.configureMonitoring
import de.jeremias_groehl.plugins.configureRouting
import de.jeremias_groehl.plugins.configureSerialization
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureSerialization()
    configureMonitoring()
    configureRouting()
}
