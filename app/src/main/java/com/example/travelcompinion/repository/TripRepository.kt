package com.example.travelcompinion.repository

import com.example.travelcompinion.data.models.Trip
import com.example.travelcompinion.data.AppDatabase

class TripRepository(private val db: AppDatabase) {
    // Methods to manage trip plans
    fun createTrip(trip: Trip) {}
    fun getTrips(): List<Trip> = emptyList()
    // ...
}
