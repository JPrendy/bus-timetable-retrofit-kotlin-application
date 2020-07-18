package com.example.bus_timetable_retrofit_kotlin_application

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.util.Log
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide


class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)


        Log.i("test", "Flipper")

        val imageView = findViewById<ImageView>(R.id.image)
                //Placeholder image, replace it when publishing it.
        Glide.with(this).load("https://octodex.github.com/images/daftpunktocat-thomas.gif").into(imageView)
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

    //We don't need to add an setOnClickListener because we added `android:onClick="sendMessage"` in `activity_main.xml`
    fun Donnycarney(view: View) {
        val message = 664
        val intent = Intent(this, MainActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

    //We don't need to add an setOnClickListener because we added `android:onClick="sendMessage"` in `activity_main.xml`
    fun Knocklyon(view: View) {
        val message = 1153
        val intent = Intent(this, MainActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

    //We don't need to add an setOnClickListener because we added `android:onClick="sendMessage"` in `activity_main.xml`
    fun Rathmines(view: View) {
        val message = 1072
        val intent = Intent(this, MainActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }
}