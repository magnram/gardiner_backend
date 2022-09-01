package com.example.gardiner_backend.yr.model

import com.google.gson.annotations.SerializedName


data class Meta(

    @SerializedName("updated_at") var updatedAt: String? = null,
    @SerializedName("units") var units: Units? = Units()

)