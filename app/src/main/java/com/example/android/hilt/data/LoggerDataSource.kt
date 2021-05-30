package com.example.android.hilt.data

interface LoggerDataSource {
    fun addLog(msg: String)
    fun getAllLogs(callbatk: (List<Log>) -> Unit)
    fun removeLogs()
}