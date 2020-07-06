package com.example.myapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.example.myapp.util.NotificationUtil
import com.example.myapp.util.PrefUtil

class TimerExpiredReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        NotificationUtil.showTimerExpired(context)

        PrefUtil.setTimerState(Timer.TimerState.Stopped, context)
        PrefUtil.setAlarmSetTime(0, context)
    }
}
