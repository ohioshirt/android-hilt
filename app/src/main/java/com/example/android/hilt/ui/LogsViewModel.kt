package com.example.android.hilt.ui

import androidx.lifecycle.ViewModel
import com.example.android.hilt.data.Log
import com.example.android.hilt.data.LoggerDataSource
import com.example.android.hilt.di.InMemoryLogger
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Singleton

@HiltViewModel
class LogsViewModel @Inject constructor(
    @InMemoryLogger
    private val logger: LoggerDataSource
) : ViewModel() {
    fun getAllLogs(callback: (List<Log>) -> Unit) {
        logger.getAllLogs(callback)
    }
}