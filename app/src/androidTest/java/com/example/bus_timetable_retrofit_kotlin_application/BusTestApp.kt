package com.example.bus_timetable_retrofit_kotlin_application

class BusTestApp : BusApp() {

    var url = "http://127.0.0.1:8080"

    override fun getBaseUrl(): String {
        return url
    }
}