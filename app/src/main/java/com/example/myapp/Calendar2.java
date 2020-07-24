package com.example.myapp;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.CalendarView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapp.util.TaskLibraryActivity;

public class Calendar2 extends AppCompatActivity {

    private CalendarView calendarView2;
    private SQLiteDatabase SQLiteDB;
    private mySQLiteHandler dbHandler;
    private String dateSelected;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar2);

        db = new DatabaseHelper(this);
        calendarView2 = findViewById(R.id.calendarView2);

        calendarView2.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {

                dateSelected = Integer.toString(dayOfMonth) + "/" + Integer.toString(month) + "/" + Integer.toString(year);

                Intent i = new Intent(getApplicationContext(), TaskLibraryActivity.class);

                Bundle bundle = new Bundle();
                bundle.putString("DATE", dateSelected);
                i.putExtras(bundle);
                startActivity(i);

            }
        });

    }



}