package com.example.gardiner_backend.yr

import com.example.gardiner_backend.Variables.Companion.YR_BASE_URL
import com.example.gardiner_backend.yr.model.Yr
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod
import org.springframework.http.MediaType
import org.springframework.stereotype.Repository
import org.springframework.web.client.RestTemplate
import java.util.*


@Repository
class YrRepository(private val restTemplate: RestTemplate) {
    fun getWeather(lng: Double, lat: Double): String? {
        val url = "$YR_BASE_URL/complete?lat=$lat&lon=$lng"
        val headers = HttpHeaders()
        headers.accept = Collections.singletonList(MediaType.APPLICATION_JSON)
        headers.add(
            "user-agent",
            "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36"
        )
        val entity = HttpEntity("body", headers)

        return restTemplate.exchange(url, HttpMethod.GET, entity, String::class.java).body
    }
}