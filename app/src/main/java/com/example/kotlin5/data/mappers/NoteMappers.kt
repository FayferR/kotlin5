package com.example.kotlin5.data.mappers

import com.example.kotlin5.data.model.NoteEntity
import com.example.kotlin5.domain.model.Note

fun NoteEntity.toNote() = Note(
    id,
    title,
    description,
    createdAt
)

fun Note.toNoteEntity() = NoteEntity(
    id,
    title,
    description,
    createdAt
)
