package com.example.travelcompinion.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.travelcompinion.data.models.*

@Database(entities = [Trip::class, Journey::class, PhotoNote::class, GeofenceEvent::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    // Define DAOs here
}
