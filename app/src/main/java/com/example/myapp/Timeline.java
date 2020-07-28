package com.example.myapp;

import android.database.Cursor;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

public class Timeline extends AppCompatActivity {

    AppCompatTextView time1, time2, time3, time4, time5, time6, time7, time8, time9, time10;
    AppCompatTextView task1, task2, task3, task4, task5;
    LibraryDatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline);

        db = new LibraryDatabaseHelper(this);

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

        Bundle bundle = getIntent().getExtras();
        if (bundle != null)
        {
            String t1 = bundle.getString("1time");
            String t2 = bundle.getString("2time");
            String t3 = bundle.getString("3time");
            String t4 = bundle.getString("4time");
            String t5 = bundle.getString("5time");
            String t6 = bundle.getString("6time");
            String t7 = bundle.getString("7time");
            String t8 = bundle.getString("8time");
            String t9 = bundle.getString("9time");
            String t10 = bundle.getString("10time");
            time1.setText(t1);
            time2.setText(t2);
            time3.setText(t3);
            time4.setText(t4);
            time5.setText(t5);
            time6.setText(t6);
            time7.setText(t7);
            time8.setText(t8);
            time9.setText(t9);
            time10.setText(t10);
        }


        Cursor cursor = db.retrieveTask();
        Cursor cursor1 = db.retrieveTask2();
        if( cursor != null && cursor.moveToFirst() && cursor.getInt(cursor.getColumnIndex("task_duration"))== 1 && cursor1.getInt(cursor1.getColumnIndex("task_duration"))== 1){
            String s1 = cursor.getString(cursor.getColumnIndex("task_name")) + " Part 1";
            String s2 = cursor.getString(cursor.getColumnIndex("task_name")) + " Part 2, " + cursor1.getString(cursor1.getColumnIndex("task_name")) + " Part 1";
            String s3 = cursor1.getString(cursor1.getColumnIndex("task_name")) + " Part 2";
            task1.setText(s1);
            task2.setText(s2);
            task3.setText(s3);
        }

        else if( cursor != null && cursor.moveToFirst() && cursor.getInt(cursor.getColumnIndex("task_duration"))== 2 && cursor1.getInt(cursor1.getColumnIndex("task_duration"))== 1){
            String s1 = cursor.getString(cursor.getColumnIndex("task_name")) + " Part 1";
            String s2 = cursor.getString(cursor.getColumnIndex("task_name")) + " Part 2";
            String s3 = cursor.getString(cursor.getColumnIndex("task_name")) + " Part 3, " + cursor1.getString(cursor1.getColumnIndex("task_name")) + " Part 1";
            String s4 = cursor1.getString(cursor1.getColumnIndex("task_name")) + " Part 2";
            task1.setText(s1);
            task2.setText(s2);
            task3.setText(s3);
            task4.setText(s4);
        }

        else if( cursor != null && cursor.moveToFirst() && cursor.getInt(cursor.getColumnIndex("task_duration"))== 1 && cursor1.getInt(cursor1.getColumnIndex("task_duration"))== 2){
            String s1 = cursor.getString(cursor.getColumnIndex("task_name")) + " Part 1";
            String s2 = cursor.getString(cursor.getColumnIndex("task_name")) + " Part 2, " + cursor1.getString(cursor1.getColumnIndex("task_name")) + " Part 1";
            String s3 = cursor1.getString(cursor1.getColumnIndex("task_name")) + " Part 2";
            String s4 = cursor1.getString(cursor1.getColumnIndex("task_name")) + " Part 3";
            task1.setText(s1);
            task2.setText(s2);
            task3.setText(s3);
            task4.setText(s4);
        }

        else if( cursor != null && cursor.moveToFirst() && cursor.getInt(cursor.getColumnIndex("task_duration"))== 2 && cursor1.getInt(cursor1.getColumnIndex("task_duration"))== 2){
            String s1 = cursor.getString(cursor.getColumnIndex("task_name")) + " Part 1";
            String s2 = cursor.getString(cursor.getColumnIndex("task_name")) + " Part 2";
            String s3 = cursor.getString(cursor.getColumnIndex("task_name")) + " Part 3, " + cursor1.getString(cursor1.getColumnIndex("task_name")) + " Part 1";
            String s4 = cursor1.getString(cursor1.getColumnIndex("task_name")) + " Part 2";
            String s5 = cursor1.getString(cursor1.getColumnIndex("task_name")) + " Part 3";
            task1.setText(s1);
            task2.setText(s2);
            task3.setText(s3);
            task4.setText(s4);
            task5.setText(s5);
        }

        else if( cursor != null && cursor.moveToFirst() && cursor.getInt(cursor.getColumnIndex("task_duration"))== 3){
            String s1 = cursor.getString(cursor.getColumnIndex("task_name")) + " Part 1";
            String s2 = cursor.getString(cursor.getColumnIndex("task_name")) + " Part 2";
            String s3 = cursor.getString(cursor.getColumnIndex("task_name")) + " Part 3";
            String s4 = cursor.getString(cursor.getColumnIndex("task_name")) + " Part 4, " + cursor1.getString(cursor1.getColumnIndex("task_name")) + " Part 1";
            String s5 = cursor1.getString(cursor1.getColumnIndex("task_name")) + " Part 2";
            task1.setText(s1);
            task2.setText(s2);
            task3.setText(s3);
            task4.setText(s4);
            task5.setText(s5);
        }

        else if( cursor != null && cursor.moveToFirst() && cursor.getInt(cursor.getColumnIndex("task_duration"))== 4){
            String s1 = cursor.getString(cursor.getColumnIndex("task_name")) + " Part 1";
            String s2 = cursor.getString(cursor.getColumnIndex("task_name")) + " Part 2";
            String s3 = cursor.getString(cursor.getColumnIndex("task_name")) + " Part 3";
            String s4 = cursor.getString(cursor.getColumnIndex("task_name")) + " Part 4";
            String s5 = cursor.getString(cursor.getColumnIndex("task_name")) + " Part 5";
            task1.setText(s1);
            task2.setText(s2);
            task3.setText(s3);
            task4.setText(s4);
            task5.setText(s5);
        }

        else if( cursor != null && cursor.moveToFirst() && cursor.getInt(cursor.getColumnIndex("task_duration"))== 1){
            String s1 = cursor.getString(cursor.getColumnIndex("task_name")) + " Part 1";
            String s2 = cursor.getString(cursor.getColumnIndex("task_name")) + " Part 2, " + cursor1.getString(cursor1.getColumnIndex("task_name")) + " Part 1";
            String s3 = cursor1.getString(cursor1.getColumnIndex("task_name")) + " Part 2";
            String s4 = cursor1.getString(cursor1.getColumnIndex("task_name")) + " Part 3";
            String s5 = cursor1.getString(cursor1.getColumnIndex("task_name")) + " Part 4";
            task1.setText(s1);
            task2.setText(s2);
            task3.setText(s3);
            task4.setText(s4);
            task5.setText(s5);
        }

        else if( cursor != null && cursor.moveToFirst() && cursor.getInt(cursor.getColumnIndex("task_duration"))== 2){
            String s1 = cursor.getString(cursor.getColumnIndex("task_name")) + " Part 1";
            String s2 = cursor.getString(cursor.getColumnIndex("task_name")) + " Part 2" ;
            String s3 = cursor.getString(cursor.getColumnIndex("task_name")) + " Part 3, " + cursor1.getString(cursor1.getColumnIndex("task_name")) + " Part 1";
            String s4 = cursor1.getString(cursor1.getColumnIndex("task_name")) + " Part 2";
            String s5 = cursor1.getString(cursor1.getColumnIndex("task_name")) + " Part 3";
            task1.setText(s1);
            task2.setText(s2);
            task3.setText(s3);
            task4.setText(s4);
            task5.setText(s5);
        }

        else{
            String s1 = cursor.getString(cursor.getColumnIndex("task_name")) + " Part 1";
            String s2 = cursor.getString(cursor.getColumnIndex("task_name")) + " Part 2, " + cursor1.getString(cursor1.getColumnIndex("task_name")) + " Part 1";
            String s3 = cursor1.getString(cursor1.getColumnIndex("task_name")) + " Part 2";
            String s4 = cursor1.getString(cursor1.getColumnIndex("task_name")) + " Part 3";
            String s5 = cursor1.getString(cursor1.getColumnIndex("task_name")) + " Part 4";

            task1.setText(s1);
            task2.setText(s2);
            task3.setText(s3);
            task4.setText(s4);
            task5.setText(s5);
        }

    }
}