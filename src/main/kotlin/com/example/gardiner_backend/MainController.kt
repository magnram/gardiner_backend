package com.example.gardiner_backend

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import org.springframework.web.bind.annotation.*
import java.lang.reflect.Type
import java.util.*


@RestController
class MainController (private val gardinService: GardinService) {
    @CrossOrigin
    @GetMapping("/reset")
    fun reset(): String {
        gardinService.gardiner.entries.map { it.value.reset() }
        return "Resetted"
    }

    @CrossOrigin
    @GetMapping("/getAll")
    fun getAll(): String {
        return Gson().toJson(gardinService.gardiner.entries.map { it.value })
    }

    @CrossOrigin
    @PostMapping("/updateOne")
    fun updateOne(@RequestBody input: String): String {
        val updateOneInput = Gson().fromJson(input, UpdateOneInput::class.java)
        val gardin = gardinService.gardiner[UUID.fromString(updateOneInput.id)]
        gardin?.pos1Destination = updateOneInput.pos1Destination
        gardin?.pos2Destination = updateOneInput.pos2Destination
        return Gson().toJson(gardinService.gardiner.entries.map { it.value })
    }

    @CrossOrigin
    @PostMapping("/updateAll")
    fun updateAll(@RequestBody input: String): String {
        val listType = object : TypeToken<List<UpdateOneInput>>() {}.type
        val updateAllInput = Gson().fromJson<List<UpdateOneInput>>(input, listType)
        updateAllInput.forEach {
            val gardin = gardinService.gardiner[UUID.fromString(it.id)]
            gardin?.pos1Destination = it.pos1Destination
            gardin?.pos2Destination = it.pos2Destination
        }
        return Gson().toJson(gardinService.gardiner.entries.map { it.value })
    }

    @CrossOrigin
    @GetMapping("/getOne")
    fun getOne(@RequestParam id: String): String {
        return Gson().toJson(gardinService.gardiner[UUID.fromString(id)])
    }
}