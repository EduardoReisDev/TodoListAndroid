package com.example.todolist_android

import org.junit.Test
import org.junit.Assert.*

class ExampleUnitTest {

    @Test
    fun testAddTask() {
        val toDoList = TodoList()
        toDoList.addTask("Buy groceries")
        assertTrue(toDoList.tasks.contains("Buy groceries"))
    }

    @Test
    fun testDeleteTask() {
        val toDoList = TodoList()
        toDoList.addTask("Buy groceries")
        toDoList.deleteTask("Buy groceries")
        assertFalse(toDoList.tasks.contains("Buy groceries"))
    }

    @Test
    fun testEditTask() {
        val toDoList = TodoList()
        toDoList.addTask("Buy groceries")
        toDoList.editTask("Buy groceries", "Buy fresh groceries")
        assertTrue(toDoList.tasks.contains("Buy fresh groceries"))
        assertFalse(toDoList.tasks.contains("Buy groceries"))
    }

    @Test
    fun testListTasks() {
        val toDoList = TodoList()
        toDoList.addTask("Buy groceries")
        toDoList.addTask("Clean the house")
        val tasks = toDoList.listTasks()
        assertEquals(2, tasks.size)
        assertTrue(tasks.contains("Buy groceries"))
        assertTrue(tasks.contains("Clean the house"))
    }
}