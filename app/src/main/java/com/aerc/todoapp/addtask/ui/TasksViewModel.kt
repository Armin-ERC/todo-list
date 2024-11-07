package com.aerc.todoapp.addtask.ui


import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.lifecycle.ViewModel
import com.aerc.todoapp.addtask.ui.model.TaskModel
import javax.inject.Inject

class TasksViewModel @Inject constructor() : ViewModel() {

    var tasksUiState by mutableStateOf(TasksUiState())
        private set

    fun hideDialog(){
        tasksUiState = tasksUiState.copy(
            showDialog = false
        )
    }

    fun onTaskAdded(task: String) {

        val newList = tasksUiState.tasks.toMutableList()
        newList.add(TaskModel(title = task))

        tasksUiState = tasksUiState.copy(
            tasks = newList
        )
    }

    fun showDialog() {
        tasksUiState = tasksUiState.copy(
            showDialog = true
        )
    }

    fun onTaskCheckedChange(task: TaskModel){
        val newList = tasksUiState.tasks.toMutableList()

        val index = newList.indexOf(task)
        newList[index].selected = !newList[index].selected

        tasksUiState = tasksUiState.copy(
            tasks = newList
        )
    }

}
