package com.example.roomwithdihilt.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.roomwithdihilt.data.dao.UserDao
import com.example.roomwithdihilt.data.entity.User

@Database(entities = [User::class], version = 1, exportSchema = false)
abstract class UserDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}