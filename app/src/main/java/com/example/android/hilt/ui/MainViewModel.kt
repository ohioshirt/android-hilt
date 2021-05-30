package com.example.android.hilt.ui

import androidx.fragment.app.FragmentActivity
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.android.hilt.data.LoggerDataSource
import com.example.android.hilt.di.InMemoryLogger
import com.example.android.hilt.navigator.AppNavigator

class MainViewModel @ViewModelInject constructor(
    @InMemoryLogger
    private val logger: LoggerDataSource,
    private val navigator: AppNavigator
) : ViewModel() {
    fun addLog(msg: String) {
        logger.addLog(msg)
    }

    fun removeLogs() {
        logger.removeLogs()
    }
}