package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.util.Log;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        // Call parent class function of same name
        super.onCreate(savedInstanceState);

        // Show display in app/res/activity_main
        setContentView(R.layout.activity_main);

        // Get current time
        Calendar calendar = Calendar.getInstance();
        // Format the date
        String currentDate = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
        // Display current date on the app
        TextView textViewDate = findViewById(R.id.textViewDate);
        textViewDate.setText(currentDate);
        // Set time zone
        TimeZone ny = TimeZone.getTimeZone("America/New_York");

        // Sanity check: Make sure current date and time is displayed
        Log.d("calendarDate", calendar.toString());

        // Sanity check: Make sure time zone is displayed
        Log.d("timeZone", ny.toString());

    }


    }
