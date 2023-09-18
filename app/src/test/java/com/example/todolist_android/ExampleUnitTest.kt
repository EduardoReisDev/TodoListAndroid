package com.example.todolist_android

import org.junit.Test
import org.junit.Assert.*

class ExampleUnitTest {

    @Test
    fun testAddTask() {
        val toDoList = TodoList()
        toDoList.addTask("Task 1")
        assertTrue(toDoList.tasks.contains("Task 1"))
    }

    @Test
    fun testDeleteTask() {
        val toDoList = TodoList()
        toDoList.addTask("Task 1")
        toDoList.deleteTask("Task 1")
        assertFalse(toDoList.tasks.contains("Task 1"))
    }

    @Test
    fun testListTasks() {
        val toDoList = TodoList()
        toDoList.addTask("Task 1")
        toDoList.addTask("Task 2")
        val tasks = toDoList.listTasks()
        assertEquals(2, tasks.size)
        assertTrue(tasks.contains("Task 1"))
        assertTrue(tasks.contains("Task 2"))
    }
}