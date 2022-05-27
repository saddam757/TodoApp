package com.sh.todoapp.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.sh.todoapp.model.Todo

@Database(
    entities = [Todo::class],
    version = 1,
    exportSchema = false
)
abstract class TodoDatabase: RoomDatabase() {

    abstract val dao: TodoDao

    companion object {

        const val DATABASE_NAME = "todo_db"
    }
}