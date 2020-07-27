package com.example.myapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

public class Timeline extends AppCompatActivity {

    AppCompatTextView time1, time2, time3, time4, time5, time6, time7, time8, time9, time10;
    AppCompatTextView task1, task2, task3, task4, task5, break1, break2, break3, break4, break5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline);

        time1 = findViewById(R.id.text_timeline_time1);
        time2 = findViewById(R.id.text_timeline_time2);
        time3 = findViewById(R.id.text_timeline_time3);
        time4 = findViewById(R.id.text_timeline_time4);
        time5 = findViewById(R.id.text_timeline_time5);
        time6 = findViewById(R.id.text_timeline_time6);
        time7 = findViewById(R.id.text_timeline_time7);
        time8 = findViewById(R.id.text_timeline_time8);
        time9 = findViewById(R.id.text_timeline_time9);
        time10 = findViewById(R.id.text_timeline_time10);

        task1 = findViewById(R.id.text_timeline_task1);
        task2 = findViewById(R.id.text_timeline_task2);
        task3 = findViewById(R.id.text_timeline_task3);
        task4 = findViewById(R.id.text_timeline_task4);
        task5 = findViewById(R.id.text_timeline_task5);

        break1 = findViewById(R.id.text_timeline_break1);
        break2 = findViewById(R.id.text_timeline_break2);
        break3 = findViewById(R.id.text_timeline_break3);
        break4 = findViewById(R.id.text_timeline_break4);
        break5 = findViewById(R.id.text_timeline_break5);

    }


}