package com.example.travelcompinion.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StatsViewModel : ViewModel() {
    private val _monthlyTrips = MutableLiveData<List<Int>>()
    val monthlyTrips: LiveData<List<Int>> get() = _monthlyTrips

    private val _monthlyDistance = MutableLiveData<List<Float>>()
    val monthlyDistance: LiveData<List<Float>> get() = _monthlyDistance

    fun loadStats() {
        // Carica dati statistici dal repository/database
    }
}
