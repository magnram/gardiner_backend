package com.example.gardiner_backend.yr.model

import com.google.gson.annotations.SerializedName


data class Yr(

    @SerializedName("type") var type: String? = null,
    @SerializedName("geometry") var geometry: Geometry? = Geometry(),
    @SerializedName("properties") var properties: Properties? = Properties()

)