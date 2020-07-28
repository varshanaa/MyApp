package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TimeslotActivity extends AppCompatActivity {

    Button tsButton1, tsButton2, tsButton3, tsButton4, tsButton5, tsButton6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeslot);

        tsButton1 = findViewById(R.id.tsButton1);
        tsButton2 = findViewById(R.id.tsButton2);
        tsButton3 = findViewById(R.id.tsButton3);
        tsButton4 = findViewById(R.id.tsButton4);
        tsButton5 = findViewById(R.id.tsButton5);
        tsButton6 = findViewById(R.id.tsButton6);

        tsButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TimeslotActivity.this, Timeline.class);
                Bundle bundle = new Bundle();
                bundle.putString("1time", "0700 - 0750");
                bundle.putString("2time", "0750 - 0810");
                bundle.putString("3time", "0810 - 0900");
                bundle.putString("4time", "0900 - 0920");
                bundle.putString("5time", "0920 - 1010");
                bundle.putString("6time", "1010 - 1030");
                bundle.putString("7time", "1030 - 1120");
                bundle.putString("8time", "1120 - 1140");
                bundle.putString("9time", "1140 - 1230");
                bundle.putString("10time", "1230 - 1300");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        tsButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TimeslotActivity.this, Timeline.class);
                Bundle bundle = new Bundle();
                bundle.putString("1time", "0900 - 0950");
                bundle.putString("2time", "0950 - 1010");
                bundle.putString("3time", "1010 - 1100");
                bundle.putString("4time", "1100 - 1120");
                bundle.putString("5time", "1120 - 1210");
                bundle.putString("6time", "1210 - 1230");
                bundle.putString("7time", "1230 - 1320");
                bundle.putString("8time", "1320 - 1340");
                bundle.putString("9time", "1340 - 1430");
                bundle.putString("10time", "1430 - 1500");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        tsButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TimeslotActivity.this, Timeline.class);
                Bundle bundle = new Bundle();
                bundle.putString("1time", "1300 - 1350");
                bundle.putString("2time", "1350 - 1410");
                bundle.putString("3time", "1410 - 1500");
                bundle.putString("4time", "1500 - 1520");
                bundle.putString("5time", "1520 - 1610");
                bundle.putString("6time", "1610 - 1630");
                bundle.putString("7time", "1630 - 1720");
                bundle.putString("8time", "1720 - 1740");
                bundle.putString("9time", "1740 - 1830");
                bundle.putString("10time", "1830 - 1900");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        tsButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TimeslotActivity.this, Timeline.class);
                Bundle bundle = new Bundle();
                bundle.putString("1time", "1500 - 1550");
                bundle.putString("2time", "1550 - 1610");
                bundle.putString("3time", "1610 - 1700");
                bundle.putString("4time", "1700 - 1720");
                bundle.putString("5time", "1720 - 1810");
                bundle.putString("6time", "1810 - 1830");
                bundle.putString("7time", "1830 - 1920");
                bundle.putString("8time", "1920 - 1940");
                bundle.putString("9time", "1940 - 2030");
                bundle.putString("10time", "2030 - 2100");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        tsButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TimeslotActivity.this, Timeline.class);
                Bundle bundle = new Bundle();
                bundle.putString("1time", "1900 - 1950");
                bundle.putString("2time", "1950 - 2010");
                bundle.putString("3time", "2010 - 2100");
                bundle.putString("4time", "2100 - 2120");
                bundle.putString("5time", "2120 - 2210");
                bundle.putString("6time", "2210 - 2230");
                bundle.putString("7time", "2230 - 2320");
                bundle.putString("8time", "2320 - 2340");
                bundle.putString("9time", "2340 - 0030");
                bundle.putString("10time", "0030 - 0100");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        tsButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TimeslotActivity.this, Timeline.class);
                Bundle bundle = new Bundle();
                bundle.putString("1time", "2100 - 2150");
                bundle.putString("2time", "2150 - 2210");
                bundle.putString("3time", "2210 - 2300");
                bundle.putString("4time", "2300 - 2320");
                bundle.putString("5time", "2320 - 0010");
                bundle.putString("6time", "0010 - 0030");
                bundle.putString("7time", "0030 - 0120");
                bundle.putString("8time", "0120 - 0140");
                bundle.putString("9time", "0140 - 0230");
                bundle.putString("10time", "0230 - 0300");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}