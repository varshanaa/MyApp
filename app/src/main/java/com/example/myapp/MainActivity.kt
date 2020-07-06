package com.example.myapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp.util.TaskLibraryActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goToAddTask.setOnClickListener {
            startActivity(Intent(this, AddTaskActivity::class.java))
        }

        val preferences = getSharedPreferences("database", Context.MODE_PRIVATE)
        val savedName = preferences.getString("savedTaskName", "no more tasks")
        // if there is no saved task name, then "this task does not exist."
        val savedDuration = preferences.getString("savedTaskDuration", "0")
        val savedName2 = preferences.getString("savedTaskName2", "no more tasks")
        val savedDuration2 = preferences.getString("savedTaskDuration2", "0")

        Log.d("daniel", "saved task is: $savedName")

        lastSavedTask.text = "You need to complete " + savedName + " which will take roughly $savedDuration hrs and $savedName2 which will take roughly $savedDuration2 hrs."

        //var totalDuration = 0
        //totalDuration = savedDuration

        //totalDurationTextView.text = "Total work duration is $totalDuration hrs."

        //val alltasks = listOf()

        calendar.setOnClickListener {
            startActivity(Intent(this, Calendar::class.java))
        }

        timer.setOnClickListener {
            startActivity(Intent(this, Timer::class.java))
        }

        libraryButton.setOnClickListener {
            startActivity(Intent(this, TaskLibraryActivity::class.java))
        }

    }

    fun logout(view: View) {
        FirebaseAuth.getInstance().signOut()
        startActivity(Intent(applicationContext, login::class.java))
        finish()
    }


}





