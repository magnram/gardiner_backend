package com.example.gardiner_backend

import java.util.*

data class Gardin(
    val id: UUID,
    var pos1: Int = 100,
    var pos1Destination: Int = 100,
    var pos2: Int = 0,
    var pos2Destination: Int = 0) {

    fun reset() {
        pos1 = 100
        pos1Destination = 100
        pos2 = 0
        pos2Destination = 0
    }
}

data class UpdateOneInput (val id: String, val pos1Destination: Int, val pos2Destination: Int)

