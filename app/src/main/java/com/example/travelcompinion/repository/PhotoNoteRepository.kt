package com.example.travelcompinion.repository

import com.example.travelcompinion.data.models.PhotoNote
import com.example.travelcompinion.data.AppDatabase

class PhotoNoteRepository(private val db: AppDatabase) {
    fun addPhotoNote(note: PhotoNote) {}
    fun getPhotoNotes(journeyId: Long): List<PhotoNote> = emptyList()
}
