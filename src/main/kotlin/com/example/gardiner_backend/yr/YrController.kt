package com.example.gardiner_backend.yr

import org.springframework.web.bind.annotation.*

@RestController()
@RequestMapping("/yr")
class YrController(val yrService: YrService) {

    @GetMapping("/")
    fun getHello(): String {
        return "Hello World!"
    }

    @CrossOrigin
    @GetMapping("/getWeather")
    fun getYr(@RequestParam lng: Double, @RequestParam lat: Double): String? {
        return yrService.getWeatherUrl(lng, lat)
    }

}