package com.example.logging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import timber.log.Timber


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button : Button = findViewById(R.id.button_log)
        button.setOnClickListener {
            val textInEditText : EditText = findViewById(R.id.textlog)
            Log.v("From EditText", textInEditText.text.toString());
        }

        val button1 : Button = findViewById(R.id.button_timber)
        button1.setOnClickListener {
            val textInEditText : EditText = findViewById(R.id.textlog)
            Timber.plant(Timber.DebugTree());
            Timber.v(textInEditText.text.toString());
        }
    }
}