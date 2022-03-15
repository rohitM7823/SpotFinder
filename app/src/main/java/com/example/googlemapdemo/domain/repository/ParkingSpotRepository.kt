package com.plcoding.googlemapdemo.domain.repository

import com.plcoding.googlemapdemo.domain.models.ParkingSpot
import kotlinx.coroutines.flow.Flow


interface ParkingSpotRepository {

    suspend fun insertParkingSpot(spot: ParkingSpot)

    suspend fun deleteParkingSpot(spot: ParkingSpot)

    fun getParkingSpots(): Flow<List<ParkingSpot>>
}