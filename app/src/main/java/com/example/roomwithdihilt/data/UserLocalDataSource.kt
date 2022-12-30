package com.example.roomwithdihilt.data

import com.example.roomwithdihilt.data.dao.UserDao
import com.example.roomwithdihilt.data.entity.User
import javax.inject.Inject

class UserLocalDataSource @Inject constructor(private val dao: UserDao) : UserDataSource {
    override suspend fun allLocalUsers(): List<User> {
        return dao.allUsers()
    }

}