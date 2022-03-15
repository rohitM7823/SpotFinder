package com.plcoding.googlemapdemo.domain.models

data class ParkingSpot(
    val lat: Double,
    val lng: Double,
    val id: Int? = null
)