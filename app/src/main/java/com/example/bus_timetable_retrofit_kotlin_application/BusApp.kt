package com.example.bus_timetable_retrofit_kotlin_application

import android.app.Application

open class BusApp : Application() {

    open fun getBaseUrl() = "https://841c22f8-d56a-470c-ab09-60de31bebc40.mock.pstmn.io/"
}