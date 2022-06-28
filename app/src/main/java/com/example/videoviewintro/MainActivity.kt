package com.example.videoviewintro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btnCount)
        val textView = findViewById<TextView>(R.id.tvCount)

        textView.text = count.toString()
        btn.setOnClickListener{
            ++count
            textView.text = count.toString()

        }
    }

}