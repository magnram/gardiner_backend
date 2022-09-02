package com.example.gardiner_backend.yr.locationforecast_model

import com.google.gson.annotations.SerializedName


data class Details(

    @SerializedName("air_temperature") var airTemperature: Double? = null,
    @SerializedName("wind_speed") var windSpeed: Double? = null,
    @SerializedName("air_temperature_max") var airTemperatureMax: Double? = null,
    @SerializedName("air_temperature_min") var airTemperatureMin: Double? = null,
    @SerializedName("precipitation_amount") var precipitationAmount: Double? = null,
    @SerializedName("air_pressure_at_sea_leel") var airPressureAtSeaLevel: Double? = null

)