package com.sh.todoapp.repository

import com.sh.todoapp.data.local.db.TodoDao
import com.sh.todoapp.model.Todo
import kotlinx.coroutines.flow.Flow

class TodoRepositoryImpl(
    private val dao: TodoDao
) : TodoRepository {
    override suspend fun insertTodo(todo: Todo) {

        return dao.insertTodo(todo = todo)
    }

    override suspend fun deleteTodo(todo: Todo) {
        return dao.deleteTodo(todo = todo)
    }

    override suspend fun getTodoById(id: Int): Todo? {
        return dao.getTodoById(id = id)
    }

    override fun getTodos(): Flow<List<Todo>> {
        return dao.getTodos()
    }
}