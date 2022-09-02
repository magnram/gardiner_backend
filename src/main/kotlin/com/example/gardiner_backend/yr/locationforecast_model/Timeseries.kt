package com.example.gardiner_backend.yr.locationforecast_model

import com.google.gson.annotations.SerializedName


data class Timeseries(

    @SerializedName("time") var time: String? = null,
    @SerializedName("data") var data: Data? = Data()

)