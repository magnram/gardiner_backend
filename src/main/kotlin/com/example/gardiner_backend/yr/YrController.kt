package com.example.gardiner_backend.yr

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController()
@RequestMapping("/yr")
class YrController(val yrService: YrService) {

    @GetMapping("/")
    fun getHello(): String {
        return "Hello World!"
    }

    @GetMapping("/getWeather")
    fun getYr(@RequestParam lng: Double, @RequestParam lat: Double): String? {
        return yrService.getWeatherUrl(lng, lat)
    }

}