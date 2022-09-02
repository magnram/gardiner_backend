package com.example.gardiner_backend.yr

import com.google.gson.Gson
import org.springframework.web.bind.annotation.*

@RestController()
@RequestMapping("/yr")
class YrController(val yrService: YrService) {

    @GetMapping("/")
    fun getHello(): String {
        return "Hello World!"
    }


    data class YrReturnObject(
        val symbol_url: String?,
        val air_temperature: Double?,
        val wind_speed: Double?,
        val wind_direction: Double?,
        val precipitation: Double?,
        
    )
    @CrossOrigin
    @GetMapping("/getWeather")
    fun getYr(@RequestParam lng: Double, @RequestParam lat: Double): String? {
        return Gson().toJson(yrService.getWeatherUrl(lng, lat))
    }

}