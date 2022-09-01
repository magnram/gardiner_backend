package com.example.gardiner_backend.yr.model

import com.google.gson.annotations.SerializedName


data class Next12Hours(

    @SerializedName("summary") var summary: Summary? = Summary()

)