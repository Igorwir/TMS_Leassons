package com.example.tms_leassons


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    val rnds = (5..155).random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rnds = (5..155).random()
    }
    @SuppressLint("SetTextI18n")
    fun onclick(view: View) {
        val tv = findViewById<TextView>(R.id.tx)
        if (rnds in (25..100)) {
            tv.text = "Range number $rnds"

        } else {
            tv.text = " No Range number $rnds"

        }
    }
}





