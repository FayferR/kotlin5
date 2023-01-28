package com.example.kotlin5.domain.usecases

import com.example.kotlin5.domain.model.Note
import com.example.kotlin5.domain.repository.NoteRepository

class DeleteNoteUseCase(
    private val noteRepository: NoteRepository,
) {
    fun deleteNote(note: Note) = noteRepository.deleteNote(note)
}
