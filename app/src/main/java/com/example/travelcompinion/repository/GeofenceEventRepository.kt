package com.example.travelcompinion.repository

import com.example.travelcompinion.data.models.GeofenceEvent
import com.example.travelcompinion.data.AppDatabase

class GeofenceEventRepository(private val db: AppDatabase) {
    fun addEvent(event: GeofenceEvent) {}
    fun getEvents(): List<GeofenceEvent> = emptyList()
}
