package com.example.bus_timetable_retrofit_kotlin_application

import android.app.Application
import android.content.Context
import androidx.test.runner.AndroidJUnitRunner

class MockTestRunner : AndroidJUnitRunner() {

    override fun newApplication(cl: ClassLoader?, className: String?,
                                context: Context?): Application {
        return super.newApplication(cl, BusTestApp::class.java.name, context)
    }
}