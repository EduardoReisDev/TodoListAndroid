package com.example.todolist_android

class TodoList {
    val tasks = mutableListOf<String>()

    fun addTask(task: String) {
        tasks.add(task)
    }

    fun deleteTask(task: String) {
        tasks.remove(task)
    }

    fun editTask(oldTask: String, newTask: String) {
        val index = tasks.indexOf(oldTask)
        if (index != -1) {
            tasks[index] = newTask
        }
    }

    fun listTasks(): List<String> {
        return tasks.toList()
    }
}
