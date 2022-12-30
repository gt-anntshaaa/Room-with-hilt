package com.example.roomwithdihilt.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class User(
    @ColumnInfo(name = "name")
    val name: String
){
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0
}
