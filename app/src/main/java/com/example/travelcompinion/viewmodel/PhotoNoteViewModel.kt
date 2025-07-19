package com.example.travelcompinion.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.travelcompinion.data.models.PhotoNote
import com.example.travelcompinion.repository.PhotoNoteRepository

class PhotoNoteViewModel(private val repository: PhotoNoteRepository) : ViewModel() {
    private val _photoNotes = MutableLiveData<List<PhotoNote>>()
    val photoNotes: LiveData<List<PhotoNote>> get() = _photoNotes

    fun loadPhotoNotes(journeyId: Long) {
        _photoNotes.value = repository.getPhotoNotes(journeyId)
    }

    fun addPhotoNote(note: PhotoNote) {
        repository.addPhotoNote(note)
        loadPhotoNotes(note.journeyId)
    }
}
