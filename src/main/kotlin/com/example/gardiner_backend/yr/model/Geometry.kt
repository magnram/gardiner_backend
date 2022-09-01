package com.example.gardiner_backend.yr.model

import com.google.gson.annotations.SerializedName


data class Geometry(

    @SerializedName("type") var type: String? = null,
    @SerializedName("coordinates") var coordinates: Any? = null

)