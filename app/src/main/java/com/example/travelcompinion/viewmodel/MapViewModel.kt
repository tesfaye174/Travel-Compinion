package com.example.travelcompinion.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.travelcompinion.data.models.Journey

class MapViewModel : ViewModel() {
    private val _journeys = MutableLiveData<List<Journey>>()
    val journeys: LiveData<List<Journey>> get() = _journeys

    fun loadJourneysOnMap() {
        // Carica i percorsi da visualizzare sulla mappa
    }
}
