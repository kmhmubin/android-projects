package com.example.ageinminutes

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // get reference to button
        val btnDatePicker = findViewById<Button>(R.id.btnDatePicker)
        btnDatePicker.setOnClickListener { view ->
            clickDatePicker(view)
            Toast.makeText(this, "button works", Toast.LENGTH_LONG).show()
        }

    }

    // calender Date picker function

    fun clickDatePicker(view: View) {
        val myCalendar = Calendar.getInstance()
        val year = myCalendar.get(Calendar.YEAR)
        val month = myCalendar.get(Calendar.MONTH)
        val day = myCalendar.get(Calendar.DAY_OF_MONTH)

        //open date picker popup
        DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener { view, selectedYear, selectedMonth, selectedDayOfMonth ->
                // assign the user input in the variable and format the view
                // date will show -> 10/2/2021
                val selectedDate = "$selectedDayOfMonth/ ${selectedMonth + 1}/ $selectedYear"

                // get the reference of the text view
                val showSelectedDate = findViewById<TextView>(R.id.tvSelectedDate)
                // get the values form selected date
                showSelectedDate.setText(selectedDate)
                // converting the date into a standard format
                val formatDate = SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)
                // storing the format date
                val theDate = formatDate.parse(selectedDate)
            },
            year,
            month,
            day
        ).show()
    }
}