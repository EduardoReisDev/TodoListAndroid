package com.example.todolist_android

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var taskInput: EditText
    private lateinit var addButton: Button
    private lateinit var deleteButton: Button
    private lateinit var taskList: ListView

    private val todoList = TodoList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        taskInput = findViewById(R.id.task_input)
        addButton = findViewById(R.id.add_button)
        deleteButton = findViewById(R.id.delete_button)
        taskList = findViewById(R.id.task_list)

        addButton.setOnClickListener {
            val task = taskInput.text.toString()
            if (task.isNotEmpty()) {
                todoList.addTask(task)
                taskInput.text.clear()
                listTasks() // Add this line to update the list after adding a task
            }
        }

        deleteButton.setOnClickListener {
            val task = taskInput.text.toString()
            if (task.isNotEmpty()) {
                todoList.deleteTask(task)
                taskInput.text.clear()
                listTasks() // Add this line to update the list after deleting a task
            }
        }
    }

    private fun listTasks() {
        val tasks = todoList.listTasks()
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, tasks)
        taskList.adapter = adapter
    }
}
