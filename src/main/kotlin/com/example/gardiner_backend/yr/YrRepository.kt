package com.example.gardiner_backend.yr

import com.example.gardiner_backend.Variables.Companion.YR_BASE_URL
import org.springframework.stereotype.Repository
import org.springframework.web.client.RestTemplate


@Repository
class YrRepository(private val restTemplate: RestTemplate) {
    fun getWeather(lng: Double, lat: Double): String? {
        val url = "$YR_BASE_URL/complete?lat=$lat&lon=$lng"
        return restTemplate.getForObject(url, String::class.java)
    }
}