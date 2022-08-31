package com.example.gardiner_backend

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import org.springframework.web.bind.annotation.*
import java.lang.reflect.Type
import java.util.*


@RestController
class MainController {
    var gardiner = (1..4).associate {
        val uuid = UUID.randomUUID()
        Pair(uuid, Gardin(uuid, 100, 100, 0, 0))
    }

    @CrossOrigin
    @GetMapping("/reset")
    fun reset(): String {
        gardiner.entries.map { it.value.reset() }
        return "Resetted"
    }

    @CrossOrigin
    @GetMapping("/getAll")
    fun getAll(): String {
        return Gson().toJson(gardiner.entries.map { it.value })
    }

    @CrossOrigin
    @PostMapping("/updateOne")
    fun updateOne(@RequestBody input: String): String {
        println("---")
        val updateOneInput = Gson().fromJson(input, UpdateOneInput::class.java)
        val gardin = gardiner[UUID.fromString(updateOneInput.id)]
        println(gardin)
        gardin?.pos1Destination = updateOneInput.pos1Destination
        gardin?.pos2Destination = updateOneInput.pos2Destination
        println(gardin)
        return Gson().toJson(gardiner.entries.map { it.value })
    }

    @CrossOrigin
    @PostMapping("/updateAll")
    fun updateAll(@RequestBody input: String): String {
        val listType = object : TypeToken<List<UpdateOneInput>>() {}.type
        val updateAllInput = Gson().fromJson<List<UpdateOneInput>>(input, listType)
        updateAllInput.forEach {
            val gardin = gardiner[UUID.fromString(it.id)]
            println(gardin)
            println(it)
            gardin?.pos1Destination = it.pos1Destination
            gardin?.pos2Destination = it.pos2Destination
            println(gardin)
            println("....")
        }
        return Gson().toJson(gardiner.entries.map { it.value })
    }

    @CrossOrigin
    @GetMapping("/getOne")
    fun getOne(@RequestParam id: String): String {
        return Gson().toJson(gardiner[UUID.fromString(id)])
    }
}