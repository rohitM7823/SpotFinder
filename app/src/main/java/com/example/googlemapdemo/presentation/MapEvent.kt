package com.plcoding.googlemapdemo.presentation

import com.google.android.gms.maps.model.LatLng
import com.plcoding.googlemapdemo.domain.models.ParkingSpot

sealed class MapEvent {
    object ToggleFalloutMap: MapEvent()
    data class OnMapLongClick(val latLng: LatLng): MapEvent()
    data class OnInfoWindowLongClick(val spot: ParkingSpot): MapEvent()
}