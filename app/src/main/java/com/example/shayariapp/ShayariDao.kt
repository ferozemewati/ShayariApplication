package com.example.shayariapp

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
 interface ShayariDao {
     @Insert(onConflict = OnConflictStrategy.IGNORE)
     suspend fun insertShayri(dataEntity: DataEntity)

     @Delete
     suspend fun deleteShayari(dataEntity: DataEntity)

     @Update
     suspend fun UpdateShayari(dataEntity: DataEntity)

     @Query("SELECT * FROM shayari_table ORDER BY date DESC")
     fun getAllShayari():List<DataEntity>
 }