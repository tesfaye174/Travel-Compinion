package com.example.travelcompinion.data.models

import java.util.Date

data class PhotoNote(
    val id: Long = 0,
    val journeyId: Long,
    val photoUri: String,
    val note: String?,
    val location: GPSPoint,
    val timestamp: Date
)
