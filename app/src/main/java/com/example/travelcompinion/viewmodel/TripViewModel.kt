package com.example.travelcompinion.viewmodel

import androidx.lifecycle.ViewModel
import com.example.travelcompinion.repository.TripRepository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.travelcompinion.data.models.Trip

class TripViewModel(private val repository: TripRepository) : ViewModel() {
    private val _trips = MutableLiveData<List<Trip>>()
    val trips: LiveData<List<Trip>> get() = _trips

    fun loadTrips() {
        _trips.value = repository.getTrips()
    }

    fun addTrip(trip: Trip) {
        repository.createTrip(trip)
        loadTrips()
    }
}
