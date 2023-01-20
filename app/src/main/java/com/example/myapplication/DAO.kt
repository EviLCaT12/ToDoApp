package com.example.myapplication

import androidx.room.*

@Dao
interface DAO {
    @Insert
    suspend fun insertTask(entity: Entity)

    @Update
    suspend fun updateTask(entity: Entity)

    @Delete
    suspend fun deleteTask(entity: Entity)

    @Query("Delete from todoapp")
    suspend fun deleteAll()

    @Query("Select * from todoapp")
    suspend fun getTasks():List<CardInfo>

}