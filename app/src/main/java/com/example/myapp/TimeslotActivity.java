package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TimeslotActivity extends AppCompatActivity {

    Button tsButton1, tsButton2, tsButton3, tsButton4, tsButton5, tsButton6, tsButton7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeslot);

        tsButton1.findViewById(R.id.tsButton1);
        tsButton2.findViewById(R.id.tsButton2);
        tsButton3.findViewById(R.id.tsButton3);
        tsButton4.findViewById(R.id.tsButton4);
        tsButton5.findViewById(R.id.tsButton5);
        tsButton6.findViewById(R.id.tsButton6);
        tsButton7.findViewById(R.id.tsButton7);

//        tsButton1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(TimeslotActivity.this, LibraryAddActivity.class);
//                startActivity(intent);
//            }
//        });

    }
}