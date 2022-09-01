package com.example.gardiner_backend.yr.model

import com.google.gson.annotations.SerializedName


data class Properties(

    @SerializedName("meta") var meta: Any? = Meta(),
    @SerializedName("timeseries") var timeseries: ArrayList<Timeseries> = arrayListOf()

)