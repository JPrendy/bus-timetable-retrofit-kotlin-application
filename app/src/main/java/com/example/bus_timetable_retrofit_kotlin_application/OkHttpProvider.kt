package com.example.bus_timetable_retrofit_kotlin_application

import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

// The following is a singleton object, so instead of calling calling `val clientProvider = OkHttpProvider()` to instantiate OkHttpProvider class, all we need to do is call `OkHttpProvider.getOkHttpClient()`
// This is achieved by creating an `object` instead of a `class`.
object OkHttpProvider {

    // Timeout for the network requests
    private val REQUEST_TIMEOUT = 3L

    private var okHttpClient: OkHttpClient? = null

    fun getOkHttpClient(): OkHttpClient {
        return if (okHttpClient == null) {
            val okHttpClient = OkHttpClient.Builder()
                .readTimeout(REQUEST_TIMEOUT, TimeUnit.SECONDS)
                .connectTimeout(REQUEST_TIMEOUT, TimeUnit.SECONDS)
                .build()
            this.okHttpClient = okHttpClient
            okHttpClient
        } else {
            okHttpClient!!
        }
    }
}