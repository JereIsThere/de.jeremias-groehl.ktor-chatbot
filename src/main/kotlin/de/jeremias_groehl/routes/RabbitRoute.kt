package de.jeremias_groehl.routes

import de.jeremias_groehl.data.model.Rabbit
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

private const val BASE_URL = "http://localhost:8100"
private val rabbits = listOf(
    Rabbit("Ulrich", "Ulrich", "$BASE_URL/people/ulrich.png"),
)

fun Route.randomRabbit() {
    get("/randomRabbit") {
        call.respond(
            HttpStatusCode.OK,
            rabbits.random()
        )
    }
}