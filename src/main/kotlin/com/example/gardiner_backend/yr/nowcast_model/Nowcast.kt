package com.example.example

import com.google.gson.annotations.SerializedName


data class Nowcast (

  @SerializedName("type"       ) var type       : String?     = null,
  @SerializedName("geometry"   ) var geometry   : Geometry?   = Geometry(),
  @SerializedName("properties" ) var properties : Properties? = Properties()

)