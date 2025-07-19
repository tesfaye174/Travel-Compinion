package com.example.travelcompinion.repository

import com.example.travelcompinion.data.models.Journey
import com.example.travelcompinion.data.AppDatabase

class JourneyRepository(private val db: AppDatabase) {
    // Methods to manage journeys
    fun startJourney(journey: Journey) {}
    fun getJourneys(): List<Journey> = emptyList()
    // ...
}
