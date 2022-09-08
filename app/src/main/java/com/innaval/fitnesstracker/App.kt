package com.innaval.fitnesstracker

import android.app.Application
import com.innaval.fitnesstracker.model.AppDatabase

class App : Application() {

    lateinit var db: AppDatabase

    override fun onCreate() {
        super.onCreate()
        db = AppDatabase.getDatabase(this)
    }
}