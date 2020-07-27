package com.example.myapp

import android.content.Intent
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp.TaskLibraryActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var db: DatabaseHelper? = null
    var welcomeText: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        welcomeText = findViewById<TextView>(R.id.helloUser)

        db = DatabaseHelper(this)
        val cursor = db!!.retrieveName()
        if( cursor != null && cursor.moveToFirst() ){
            val string = "Hello, " + cursor.getString(cursor.getColumnIndex("username")) + "!"
            helloUser.text = string
            cursor.close()
        }

//        val preferences = getSharedPreferences("database", Context.MODE_PRIVATE)
//        val savedName = preferences.getString("savedTaskName", "no more tasks")
//        // if there is no saved task name, then "this task does not exist."
//        val savedDuration = preferences.getString("savedTaskDuration", "0")
//        val savedName2 = preferences.getString("savedTaskName2", "no more tasks")
//        val savedDuration2 = preferences.getString("savedTaskDuration2", "0")
//
//        Log.d("daniel", "saved task is: $savedName")

        //lastSavedTask.text = "You need to complete " + savedName + " which will take roughly $savedDuration hrs and $savedName2 which will take roughly $savedDuration2 hrs."

        //var totalDuration = 0
        //totalDuration = savedDuration

        //totalDurationTextView.text = "Total work duration is $totalDuration hrs."

        //val alltasks = listOf()

//        val preferences = getSharedPreferences ("Database", Context.MODE_PRIVATE)
//        val name = preferences.getString("username", "null")
//        helloUser?.text = "Hi, $name!"

        calendar.setOnClickListener {
            startActivity(Intent(this, Calendar2::class.java))
        }

        timer.setOnClickListener {
            startActivity(Intent(this, Timer::class.java))
        }

    }

    fun logout(view: View) {
        startActivity(Intent(applicationContext, login::class.java))
        finish()
    }


}





