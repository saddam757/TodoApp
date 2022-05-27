package com.sh.todoapp.di

import android.app.Application
import androidx.room.Room
import com.sh.todoapp.data.local.db.TodoDatabase
import com.sh.todoapp.repository.TodoRepository
import com.sh.todoapp.repository.TodoRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object TodoModule {

    @Provides
    @Singleton
    fun provideTodoDatabase(app: Application): TodoDatabase =
        Room.databaseBuilder(
            app,
            TodoDatabase::class.java,
            TodoDatabase.DATABASE_NAME
        ).build()

    @Provides
    @Singleton
    fun provideTodoRepository(db: TodoDatabase): TodoRepository =
        TodoRepositoryImpl(dao = db.dao)
}