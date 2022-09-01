package com.example.gardiner_backend.yr.model

import com.google.gson.annotations.SerializedName


data class Details(

    @SerializedName("air_temperature_max") var airTemperatureMax: Any? = null,
    @SerializedName("air_temperature_min") var airTemperatureMin: Any? = null,
    @SerializedName("precipitation_amount") var precipitationAmount: Any? = null,
    @SerializedName("air_pressure_at_sea_leel") var airPressureAtSeaLevel: Any? = null

)