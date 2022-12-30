package com.example.roomwithdihilt.di

import android.content.Context
import androidx.room.Room
import com.example.roomwithdihilt.data.UserDatabase
import com.example.roomwithdihilt.data.UserLocalDataSource
import com.example.roomwithdihilt.data.dao.UserDao
import com.example.roomwithdihilt.repository.UserRepo
import com.example.roomwithdihilt.repository.UserRepoImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context) : UserDatabase{
        return Room.databaseBuilder(
            context,
            UserDatabase::class.java,
            "user.db"
        ).build()
    }

    @Provides
    fun provideUserLocal(db: UserDatabase) : UserDao{
        return db.userDao()
    }

    @Provides
    fun provideUserRepo(local: UserLocalDataSource) : UserRepo {
        return UserRepoImpl(local)
    }

}