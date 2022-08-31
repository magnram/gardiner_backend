package com.example.gardiner_backend.yr

import org.springframework.stereotype.Service

@Service
class YrService(private val yrRepository: YrRepository) {

    fun getWeather(lat: Double, lon: Double): String? {
        return yrRepository.getWeather(lat, lon)
    }

}
