package com.example.gardiner_backend.yr

import com.example.example.Nowcast
import com.example.gardiner_backend.yr.locationforecast_model.LocationForecast
import com.google.gson.Gson
import org.springframework.stereotype.Service


data class LocationDataReturnObject(
    val symbol_url: String?,
    val air_temperature: Double?,
    val wind_speed: Double?
    )

data class NowcastDataReturnObject(
    val symbol_url: String?,
    val air_temperature: Double?,
    val wind_speed: Double?,
    val wind_direction: Double?,
    val precipitation_amount: List<Double?>?
    )


@Service
class YrService(private val yrRepository: YrRepository) {
    val gson = Gson()

    /*
    fun getLocationData(lat: Double, lon: Double): LocationDataReturnObject {
        val yrString = yrRepository.getFromYr(YrRepository.YrRequestType.LOCATION, lat, lon)
        val locationForecast = gson.fromJson(yrString, LocationForecast::class.java)

        val locationForecastData = locationForecast?.properties?.timeseries?.get(0)?.data
        return LocationDataReturnObject(
            symbol_url = locationForecastData?.next1Hours?.summary?.symbolCode,
            air_temperature = locationForecastData?.instant?.details?.airTemperature,
            locationForecastData?.instant?.details?.windSpeed
        )
    }
    */

    fun get

    fun getNowcastData(lat: Double, lon: Double): NowcastDataReturnObject {
        val yrString = yrRepository.getFromYr(YrRepository.YrRequestType.NOWCAST, lat, lon)
        val nowcast = gson.fromJson(yrString, Nowcast::class.java)
        val nowcastData = nowcast?.properties?.timeseries?.get(0)?.data

        val symbolUrl = "https://api.met.no/images/weathericons/svg/" +
                "${nowcastData?.next1Hours?.summary?.symbolCode}.svg"

        val precipitationAmount = nowcast?.properties?.timeseries?.drop(0)?.map {
            it.data?.next1Hours?.details?.precipitationAmount
        }


        return NowcastDataReturnObject(
            symbol_url = symbolUrl,
            air_temperature = nowcastData?.instant?.details?.airTemperature,
            wind_speed = nowcastData?.instant?.details?.windSpeed,
            wind_direction = nowcastData?.instant?.details?.windFromDirection,
            precipitation_amount = precipitationAmount
        )
    }
}
