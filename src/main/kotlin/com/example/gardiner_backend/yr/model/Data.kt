package com.example.gardiner_backend.yr.model

import com.fasterxml.jackson.annotation.JsonIgnore
import com.google.gson.annotations.SerializedName


data class Data(

    @SerializedName("instant") var instant: Instant? = Instant(),
    @SerializedName("next_12_hours") var next12Hours: Any? = Next12Hours(),
    @SerializedName("next_1_hours") var next1Hours: Next1Hours? = Next1Hours(),
    @SerializedName("next_6_hours") var next6Hours: Next6Hours? = Next6Hours()

)