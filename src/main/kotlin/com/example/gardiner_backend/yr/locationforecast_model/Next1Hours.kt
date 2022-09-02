package com.example.gardiner_backend.yr.locationforecast_model

import com.google.gson.annotations.SerializedName


data class Next1Hours(

    @SerializedName("summary") var summary: Summary? = Summary(),
    @SerializedName("details") var details: Details? = Details()

)