package com.example.myapplication

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "ToDoApp")
data class Entity (
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var title: String,
    var priority: String
)