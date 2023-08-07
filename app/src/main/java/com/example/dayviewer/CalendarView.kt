//CT_2018_009
//Full Project Zip File: https://github.com/DilukChamika/Kotlin_DayViewer.git
package com.example.dayviewer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

//CalendarView class (new activity with the calendar view)
@Suppress("DEPRECATION")
class CalendarView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar_view)

        // Hide the status bar.
        //window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        //actionBar?.hide()

        //Defining back button variable
        val backBtn = findViewById<Button>(R.id.backBtn)

        //Back to main page button
        backBtn.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}