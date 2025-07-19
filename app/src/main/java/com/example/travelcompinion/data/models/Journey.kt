package com.example.travelcompinion.data.models

import java.util.Date

data class Journey(
    val id: Long = 0,
    val tripId: Long,
    val startTime: Date,
    val endTime: Date?,
    val route: List<GPSPoint>,
    val photos: List<PhotoNote>
)

data class GPSPoint(val latitude: Double, val longitude: Double, val timestamp: Date)
