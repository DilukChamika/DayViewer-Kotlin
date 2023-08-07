//CT_2018_009
//Full Project Zip File: https://github.com/DilukChamika/Kotlin_DayViewer.git

package com.example.dayviewer

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate
import java.text.SimpleDateFormat
import java.util.*

//main activity class (contains the current date info)
class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Night Mode
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)

        // Hide the status bar.
        //window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        //actionBar?.hide()

        //Defining variables
        val calendar = Calendar.getInstance()
        val firstVwBtn = findViewById<Button>(R.id.toCalendarBtn)
        val dayTxt = findViewById<TextView>(R.id.dayOfWeekTxt)
        val monthTxt = findViewById<TextView>(R.id.monthTxt)
        val yearTxt = findViewById<TextView>(R.id.yearTxt)
        val weekNo = findViewById<TextView>(R.id.weekNoTxt)

        //Formatting the day and month as full string
        val dayFormatter = SimpleDateFormat("EEEE", Locale.UK)
        val monthFormatter = SimpleDateFormat("MMMM", Locale.UK)

        //Assigning calendar values to variables
        dayTxt.text = dayFormatter.format(calendar.time)
        monthTxt.text = monthFormatter.format(calendar.time)+" "+ calendar.get(Calendar.DATE).toString()
        yearTxt.text = calendar.get(Calendar.YEAR).toString()
        weekNo.text = calendar.get(Calendar.WEEK_OF_YEAR).toString()

        //Button to calendar view
        firstVwBtn.setOnClickListener {
            val intent = Intent(this,CalendarView::class.java)
            startActivity(intent)
        }
    }
}