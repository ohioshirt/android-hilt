package com.example.android.hilt.ui

import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel
import com.example.android.hilt.data.Log
import com.example.android.hilt.data.LoggerDataSource
import com.example.android.hilt.di.InMemoryLogger
import com.example.android.hilt.navigator.AppNavigator
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Singleton

@HiltViewModel
class MainViewModel @Inject constructor(
    @InMemoryLogger
    private val logger: LoggerDataSource,
//    private val navigator: AppNavigator
) : ViewModel() {
    fun addLog(msg: String) {
        logger.addLog(msg)
    }

    fun getAllLogs(callback: (List<Log>) -> Unit) {
        logger.getAllLogs(callback)
    }

    fun removeLogs() {
        logger.removeLogs()
    }
}