package com.plcoding.googlemapdemo.presentation

import com.google.maps.android.compose.MapProperties
import com.plcoding.googlemapdemo.domain.models.ParkingSpot

data class MapState(
    val properties: MapProperties = MapProperties(),
    val parkingSpots: List<ParkingSpot> = emptyList(),
    val isFalloutMap: Boolean = false
)