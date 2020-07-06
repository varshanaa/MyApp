package com.example.myapp

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.add_task.*

class AddTaskActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_task)

        confirmTaskButton.setOnClickListener {

            val database = getSharedPreferences("database", Context.MODE_PRIVATE)
            database.edit().apply() {
                putString("savedTaskName", editTextTaskName.text.toString())
                putString("savedTaskDuration", editTextTaskDuration.text.toString())
                putString("savedTaskName2", editTextTaskName2.text.toString())
                putString("savedTaskDuration2", editTextTaskDuration2.text.toString())

            }.apply()
        }


    }
}