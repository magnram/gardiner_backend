package com.example.gardiner_backend.yr.model

import com.google.gson.annotations.SerializedName


data class Summary(

    @SerializedName("symbol_code") var symbolCode: String? = null

)