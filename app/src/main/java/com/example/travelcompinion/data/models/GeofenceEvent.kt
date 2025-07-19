package com.example.travelcompinion.data.models

import java.util.Date

data class GeofenceEvent(
    val id: Long = 0,
    val zoneName: String,
    val entered: Boolean,
    val timestamp: Date
)
