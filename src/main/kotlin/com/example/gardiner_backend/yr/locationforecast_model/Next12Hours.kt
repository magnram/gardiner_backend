package com.example.gardiner_backend.yr.locationforecast_model

import com.google.gson.annotations.SerializedName


data class Next12Hours(

    @SerializedName("summary") var summary: Summary? = Summary()

)