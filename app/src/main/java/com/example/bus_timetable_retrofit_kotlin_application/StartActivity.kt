package com.example.bus_timetable_retrofit_kotlin_application

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
    }

    //Don't forget to update `AndroidManifest.xml
    //    <activity android:name=".SecondActivity"
    //    android:parentActivityName=".MainActivity"/>

    //We don't need to add an setOnClickListener because we added `android:onClick="sendMessage"` in `activity_main.xml`
    fun DameStreet(view: View) {
        val message = 1359
        val intent = Intent(this, MainActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

    //We don't need to add an setOnClickListener because we added `android:onClick="sendMessage"` in `activity_main.xml`
    fun Local(view: View) {
        val message = 1190
        val intent = Intent(this, MainActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }
}