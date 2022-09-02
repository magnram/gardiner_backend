package com.example.gardiner_backend.yr.locationforecast_model

import com.google.gson.annotations.SerializedName


data class LocationForecast(

    @SerializedName("type") var type: String? = null,
    @SerializedName("geometry") var geometry: Geometry? = Geometry(),
    @SerializedName("properties") var properties: Properties? = Properties()

)