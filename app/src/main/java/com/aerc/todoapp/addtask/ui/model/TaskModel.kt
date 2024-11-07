package com.aerc.todoapp.addtask.ui.model


data class TaskModel(
    val id: Long = System.currentTimeMillis(),
    val title: String,
    var selected: Boolean = false
)
