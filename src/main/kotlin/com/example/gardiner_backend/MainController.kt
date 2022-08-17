package com.example.gardiner_backend

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import org.springframework.web.bind.annotation.*
import java.lang.reflect.Type


@RestController
class MainController {

    val gardin1 = Gardin(0, 100, 80, 0, 0)
    val gardin2 = Gardin(1, 100, 80, 0, 0)
    val gardin3 = Gardin(2, 100, 100, 0, 0)
    val gardin4 = Gardin(3, 100, 50, 0, 0)

    var gardiner = listOf(gardin1, gardin2, gardin3, gardin4)

    @CrossOrigin
    @GetMapping("/reset")
    fun reset(): String {
        val gardin1 = Gardin(0, 100, 80, 0, 0)
        val gardin2 = Gardin(1, 100, 80, 0, 0)
        val gardin3 = Gardin(2, 100, 100, 0, 0)
        val gardin4 = Gardin(3, 100, 50, 0, 0)

        gardiner = listOf(gardin1, gardin2, gardin3, gardin4)
        return "Resetted"
    }
    @CrossOrigin
    @GetMapping("/getAll")
    fun getAll(): String {
        return Gson().toJson(gardiner)
    }

    @CrossOrigin
    @PostMapping("/updateOne")
    fun updateOne(@RequestBody input: String): String {
        println("---")
        val updateOneInput = Gson().fromJson(input, UpdateOneInput::class.java)
        val gardin = gardiner[updateOneInput.id]
        println(gardin)
        gardin.pos1Destination = updateOneInput.pos1Destination
        gardin.pos2Destination = updateOneInput.pos2Destination
        println(gardin)
        return Gson().toJson(gardiner)
    }

    @CrossOrigin
    @PostMapping("/updateAll")
    fun updateAll(@RequestBody input: String): String {
        val listType = object : TypeToken<List<UpdateOneInput>>() {}.type
        val updateAllInput = Gson().fromJson<List<UpdateOneInput>>(input, listType)
        println(gardiner)
        updateAllInput.forEach {
            val gardin = gardiner[it.id];
            gardin.pos1Destination = it.pos1Destination
            gardin.pos2Destination = it.pos2Destination
        }




        return Gson().toJson(gardiner)
    }


    data class UpdateOneInput (val id: Int, val pos1Destination: Int, val pos2Destination: Int)
}