package com.example.gardiner_backend.yr.model

import com.google.gson.annotations.SerializedName


data class Instant(

    @SerializedName("details") var details: Any? = Details()

)