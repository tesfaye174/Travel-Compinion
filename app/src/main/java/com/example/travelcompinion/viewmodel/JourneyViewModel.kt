package com.example.travelcompinion.viewmodel

import androidx.lifecycle.ViewModel
import com.example.travelcompinion.repository.JourneyRepository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.travelcompinion.data.models.Journey

class JourneyViewModel(private val repository: JourneyRepository) : ViewModel() {
    private val _journeys = MutableLiveData<List<Journey>>()
    val journeys: LiveData<List<Journey>> get() = _journeys

    fun loadJourneys() {
        _journeys.value = repository.getJourneys()
    }

    fun startJourney(journey: Journey) {
        repository.startJourney(journey)
        loadJourneys()
    }
    
    fun stopJourney(journeyId: Long) {
        repository.stopJourney(journeyId)
        loadJourneys()
    }

    fun addPhotoNote(journeyId: Long, photoUri: String, note: String?) {
        repository.addPhotoNote(journeyId, photoUri, note)
        loadJourneys()
    }

    fun logGPSPoint(journeyId: Long, latitude: Double, longitude: Double, timestamp: Long) {
        repository.logGPSPoint(journeyId, latitude, longitude, timestamp)
        loadJourneys()
    }

    fun calculateDistance(journeyId: Long): Double {
        return repository.calculateDistance(journeyId)
    }

    fun filterJourneys(byDate: String? = null, byDestination: String? = null, byType: String? = null): List<Journey> {
        return repository.filterJourneys(byDate, byDestination, byType)
    }

    fun markNoTravelPeriod(start: Long, end: Long) {
        repository.markNoTravelPeriod(start, end)
        loadJourneys()
    }
}
