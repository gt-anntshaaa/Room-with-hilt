package com.example.roomwithdihilt.repository

import com.example.roomwithdihilt.data.UserLocalDataSource
import com.example.roomwithdihilt.data.dao.UserDao
import com.example.roomwithdihilt.data.entity.User
import javax.inject.Inject

class UserRepoImpl @Inject constructor(private val local: UserLocalDataSource) : UserRepo {
    override suspend fun allUsers(): List<User> {
        return local.allLocalUsers()
    }
}