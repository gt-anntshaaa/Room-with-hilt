package com.example.roomwithdihilt.data

import com.example.roomwithdihilt.data.entity.User

interface UserDataSource {
    suspend fun allLocalUsers(): List<User>
}