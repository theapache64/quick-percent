package com.theapache64.quickpercentexample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.theapache64.quickpercent.isWhatPercentOf
import com.theapache64.quickpercent.percentOf

class MainActivity : AppCompatActivity() {

    companion object {
        val TAG = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        Log.d(TAG, "What is 20% of 1000? -> ${20.percentOf(1000)} ")
        Log.d(TAG, "200 is what percent of 1000? -> ${200.isWhatPercentOf(1000)}")
    }
}
