package com.example.kotlin5.domain.usecases

import com.example.kotlin5.domain.model.Note
import com.example.kotlin5.domain.repository.NoteRepository

class CreateNoteUseCase(
    private val noteRepository: NoteRepository,
) {
    fun createNote(note: Note) = noteRepository.createNote(note)
}
