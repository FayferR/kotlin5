package com.example.kotlin5.domain.usecases

import com.example.kotlin5.domain.repository.NoteRepository

class GetNotesUseCase(
    private val noteRepository: NoteRepository,
) {

    fun getNotes() = noteRepository.getNotes()
}

