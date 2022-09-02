package com.example.gardiner_backend.yr.locationforecast_model

import com.google.gson.annotations.SerializedName


data class Instant(

    @SerializedName("details") var details: Details? = Details()

)