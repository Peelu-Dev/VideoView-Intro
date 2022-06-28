package com.example.videoviewintro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    var count = 0
    private lateinit var viewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        val btn = findViewById<Button>(R.id.btnCount)
        val textView = findViewById<TextView>(R.id.tvCount)

//        textView.text = count.toString()
        textView.text = viewModel.count.toString()
        btn.setOnClickListener{
//            ++count
            viewModel.updateCount()
            textView.text = viewModel.count.toString()

        }
    }

}