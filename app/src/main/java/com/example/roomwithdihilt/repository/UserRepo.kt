package com.example.roomwithdihilt.repository

import com.example.roomwithdihilt.data.entity.User

interface UserRepo {
    suspend fun allUsers(): List<User>
}