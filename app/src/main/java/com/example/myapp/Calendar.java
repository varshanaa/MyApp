//package com.example.myapp;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.ContentValues;
//import android.database.Cursor;
//import android.database.sqlite.SQLiteDatabase;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.CalendarView;
//import android.widget.EditText;
//
//public class Calendar extends AppCompatActivity {
//
//    private mySQLiteHandler dbHandler;
//    private EditText editText;
//    private EditText editDuration;
//    private CalendarView calendarView;
//    private String selectedDate;
//    private SQLiteDatabase SQLiteDB;
//
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_calendar);
//
//        editText = findViewById(R.id.taskName);
//        editDuration = findViewById(R.id.taskDuration);
//        calendarView = findViewById(R.id.calendarView);
//
//        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
//            @Override
//            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
//
//                selectedDate = Integer.toString(year) + Integer.toString(month) + Integer.toString(dayOfMonth);
//                ReadDatabase(view);
//
//            }
//        });
//
//        try {
//
//            dbHandler = new mySQLiteHandler(this, "CalendarDatabase", null, 1);
//            SQLiteDB = dbHandler.getWritableDatabase();
//            SQLiteDB.execSQL("CREATE TABLE EventCalendar(Date TEXT, Event TEXT, Duration TEXT)");
//
//        }
//
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    public void InsertDatabase(View view) {
//        ContentValues contentValues = new ContentValues();
//        contentValues.put("Date", selectedDate);
//        contentValues.put("Event", editText.getText().toString());
//        contentValues.put("Duration", editDuration.getText().toString());
//        SQLiteDB.insert("EventCalendar", null, contentValues);
//
//    }
//
//    public void ReadDatabase(View view) {
//        String query = "Select Event from EventCalendar where Date =" + selectedDate;
//        try {
//            Cursor cursor = SQLiteDB.rawQuery(query, null);
//            cursor.moveToFirst();
//            editText.setText(cursor.getString(0));
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            editText.setText("");
//        }
//
//    }
//
//       /* String query2 = "Select Duration from EventCalendar where Date =" + selectedDate;
//        try{
//            Cursor cursor = SQLiteDB.rawQuery(query2, null);
//            cursor.moveToFirst();
//            editDuration.setText(cursor.getString(0));
//
//        }
//        catch (Exception e){
//            e.printStackTrace();
//            editDuration.setText("");
//        }
//
//
//    }*/
//
//    public void ReadDataB(View view) {
//        String query = "Select Duration from EventCalendar where Date =" + selectedDate;
//        try{
//            Cursor cursor = SQLiteDB.rawQuery(query, null);
//            cursor.moveToFirst();
//            editDuration.setText(cursor.getString(0));
//
//        }
//        catch (Exception e){
//            e.printStackTrace();
//            editDuration.setText("");
//        }
//    }
//
//
//
//}
//
//
