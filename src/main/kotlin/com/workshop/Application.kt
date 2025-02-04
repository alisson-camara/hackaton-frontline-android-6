package com.workshop

import com.workshop.model.FakeTaskRepository
import com.workshop.model.PostgresTaskRepository
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    //val repository = PostgresTaskRepository()
    val taskRepository = FakeTaskRepository()
    configureSerialization(taskRepository)
    //configureDatabases()
    configureRouting()
}
