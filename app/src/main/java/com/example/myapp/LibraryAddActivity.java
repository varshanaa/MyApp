package com.example.myapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class LibraryAddActivity extends AppCompatActivity {

    EditText TaskNameText, TaskDurationNumber;
    Button AddTaskButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library_add);

        TaskNameText = findViewById(R.id.TaskNameText);
        TaskDurationNumber = findViewById(R.id.TaskDurationNumber);
        AddTaskButton = findViewById(R.id.AddTaskButton);
        AddTaskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LibraryDatabaseHelper myDB  = new LibraryDatabaseHelper(LibraryAddActivity.this);
                myDB.addTask(TaskNameText.getText().toString().trim(),
                        Integer.valueOf(TaskDurationNumber.getText().toString().trim()));
            }
        });
    }
}