package com.example.travelcompinion.data.models

import java.util.Date

enum class TripType {
    LOCAL, DAY, MULTI_DAY
}

data class Trip(
    val id: Long = 0,
    val destination: String,
    val startDate: Date,
    val endDate: Date,
    val type: TripType
)
