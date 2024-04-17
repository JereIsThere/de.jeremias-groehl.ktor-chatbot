package de.jeremias_groehl.plugins

import de.jeremias_groehl.routes.randomRabbit
import de.jeremias_groehl.routes.supportRoute
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        supportRoute()
        randomRabbit()

        // Static plugin. Try to access `/static/index.html`
        static {
            resources("static")
        }
    }
}
