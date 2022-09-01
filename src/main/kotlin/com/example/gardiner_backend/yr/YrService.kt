package com.example.gardiner_backend.yr

import com.example.gardiner_backend.yr.model.Yr
import com.google.gson.Gson
import org.springframework.stereotype.Service

@Service
class YrService(private val yrRepository: YrRepository) {

    fun getWeatherUrl(lat: Double, lon: Double): String? {
        val yrString = yrRepository.getWeather(lat, lon)

        val gson = Gson()
        val yr = gson.fromJson(yrString, Yr::class.java)

        val symbolcode = yr?.properties?.timeseries?.get(0)?.data?.next1Hours?.summary?.symbolCode

        return "https://api.met.no/images/weathericons/svg/${symbolcode}.svg"
    }

}
