package com.example.gardiner_backend

data class Gardin(
    val id: Int,
    val pos1: Int,
    var pos1Destination: Int,
    val pos2: Int,
    var pos2Destination: Int) {

    fun isActive(): Boolean {
        return pos1 != pos1Destination || pos2 != pos2Destination;
    }
}
