package com.example.myapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ListView2 extends AppCompatActivity {

    private TextView textViewT;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview2);

        textViewT = findViewById(R.id.textView);

        Bundle bundle = getIntent().getExtras();

        //Extract the data…
        String getDate = bundle.getString("DATE");

        //Create the text view
        textViewT.setText(getDate);
    }

}