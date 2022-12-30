package com.example.roomwithdihilt.data.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.roomwithdihilt.data.entity.User

@Dao
interface UserDao {
    @Query("SELECT * FROM user")
    suspend fun allUsers(): List<User>
}