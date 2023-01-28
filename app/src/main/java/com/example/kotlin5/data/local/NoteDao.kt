package com.example.kotlin5.data.local

import androidx.room.*
import com.example.kotlin5.data.model.NoteEntity


@Dao
interface NoteDao {

    @Insert
    fun createNote(noteEntity: NoteEntity)

    @Update
    fun editNote(noteEntity: NoteEntity)

    @Delete
    fun deleteNote(noteEntity: NoteEntity)

    @Query("SELECT * FROM notes")
    fun getNotes(): List<NoteEntity>
}