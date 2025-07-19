package com.example.travelcompinion.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.travelcompinion.data.models.GeofenceEvent
import com.example.travelcompinion.repository.GeofenceEventRepository

class GeofenceEventViewModel(private val repository: GeofenceEventRepository) : ViewModel() {
    private val _events = MutableLiveData<List<GeofenceEvent>>()
    val events: LiveData<List<GeofenceEvent>> get() = _events

    fun loadEvents() {
        _events.value = repository.getEvents()
    }

    fun addEvent(event: GeofenceEvent) {
        repository.addEvent(event)
        loadEvents()
    }
}
