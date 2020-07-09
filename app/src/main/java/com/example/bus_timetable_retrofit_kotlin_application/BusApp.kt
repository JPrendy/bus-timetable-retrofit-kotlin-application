package com.example.bus_timetable_retrofit_kotlin_application

import android.app.Application

open class BusApp : Application() {

    open fun getBaseUrl() = "https://data.smartdublin.ie/"
}