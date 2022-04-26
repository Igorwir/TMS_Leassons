package com.example.tms_leassons


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
class MainActivity2 : AppCompatActivity() {


    var sum = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    @SuppressLint("SetTextI18n")
    fun onclick(view: View) {
        val tv = findViewById<TextView>(R.id.tx)
        for(i in 1..100){
            sum = sum + i
        }
            tv.text = "Sum: $sum"
        val td = findViewById<TextView>(R.id.textViewInfo)
        td.visibility = View.INVISIBLE
        }

    }








