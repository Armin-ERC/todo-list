package com.aerc.todoapp.addtask.ui

import com.aerc.todoapp.addtask.ui.model.TaskModel

data class TasksUiState(
    val showDialog : Boolean = false,
    val tasks : List<TaskModel> = emptyList()
)
