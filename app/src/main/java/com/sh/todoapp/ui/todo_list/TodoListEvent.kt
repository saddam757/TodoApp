package com.sh.todoapp.ui.todo_list

import com.sh.todoapp.model.Todo

sealed class TodoListEvent {
    data class OnTodoClick(val todo: Todo) : TodoListEvent()
    data class OnTodoDelete(val todo: Todo) : TodoListEvent()
    data class OnDoneChange(val todo: Todo, val isDone: Boolean) : TodoListEvent()
    object OnAddTodoClick : TodoListEvent()
    object OnUndoDeleteClick : TodoListEvent()
}
