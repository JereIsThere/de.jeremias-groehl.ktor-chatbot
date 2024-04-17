package de.jeremias_groehl.routes

import de.jeremias_groehl.data.model.Response
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.supportRoute() {
    get("/support") {
        val message = call.parameters["message"]

        val response =
            when (message) {
                "" -> "Empy!"
                "unknown" -> "it's the unknown!!"
                null -> "Error in SupportRoute.kt - No message supplied!"
                else -> "Got $message"
            }

        if (message != null) {
            call.respond(HttpStatusCode.OK, response)
        }else{
            call.respond(HttpStatusCode.BadRequest)
        }
    }
}