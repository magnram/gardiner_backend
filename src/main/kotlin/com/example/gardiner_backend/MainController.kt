package com.example.gardiner_backend

import com.google.gson.Gson
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class MainController {

    val gardin1 = Gardin(100, 100, 0, 0)
    val gardin2 = Gardin(100, 100, 0, 0)
    val gardin3 = Gardin(100, 100, 0, 0)
    val gardin4 = Gardin(100, 100, 0, 0)

    @GetMapping("/hello")
    fun hello(): String {
        return "Hello, world!"
    }

    @GetMapping("/getAll")
    fun getAll(): String {
        return Gson().toJson(listOf(gardin1, gardin2, gardin3, gardin4))
    }
}