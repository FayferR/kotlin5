package com.example.kotlin5.domain.usecases

import com.example.kotlin5.domain.model.Note
import com.example.kotlin5.domain.repository.NoteRepository

class EditNoteUseCase(
    private val noteRepository: NoteRepository,
) {
    fun editNote(note: Note) = noteRepository.editNote(note)
}
