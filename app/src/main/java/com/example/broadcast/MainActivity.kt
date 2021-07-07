package com.example.broadcast

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    lateinit var recevier: AirplaneModeChangedReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recevier = AirplaneModeChangedReceiver()

        // used for the system to determine which apps to receive which intents
        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also {
            registerReceiver(recevier,it)
        }

    }
    // we have to unregisterReceiver to does not make any memory leak
    override fun onStop() {
        super.onStop()
        unregisterReceiver(recevier)
    }
}