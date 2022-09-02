package com.example.gardiner_backend.yr.locationforecast_model

import com.google.gson.annotations.SerializedName


data class Summary(

    @SerializedName("symbol_code") var symbolCode: String? = null

)