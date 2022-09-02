package com.example.gardiner_backend.yr.locationforecast_model

import com.google.gson.annotations.SerializedName


data class Geometry(

    @SerializedName("type") var type: String? = null,
    @SerializedName("coordinates") var coordinates: Any? = null

)