package com.example.gardiner_backend

import org.springframework.stereotype.Service
import java.util.*



@Service
class GardinService {
    var gardiner = (1..Variables.GARDIN_COUNT).associate {
        val uuid = UUID.randomUUID()
        Pair(uuid, Gardin(uuid, 100, 100, 0, 0))
    }
}