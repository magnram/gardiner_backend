package com.example.gardiner_backend

data class Gardin(
    val pos1: Int,
    val pos1Destination: Int,
    val pos2: Int,
    val pos2Destination: Int) {

    fun isActive(): Boolean {
        return pos1 != pos1Destination || pos2 != pos2Destination;
    }
}
