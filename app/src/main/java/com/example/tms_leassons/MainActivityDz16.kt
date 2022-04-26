package com.example.tms_leassons


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random
import kotlin.random.nextInt


class MainActivityDz16 : AppCompatActivity() {
                                          //Если а – четное посчитать а*б, иначе а+б используя when
    val b: Int = Random.nextInt(1..9)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    @SuppressLint("SetTextI18n")
    fun onclick(view: View) {
        val tv = findViewById<TextView>(R.id.tx)
        val pokaz = findViewById<TextView>(R.id.pokaz)
        val a = Random.nextInt(1..9)
        pokaz.text = "Number a:$a Number b:$b"
        when {
            a % 2 == 0 -> tv.text = "Doing '*' answer =" + (a * b).toString()
            else -> tv.text = "Doing '+' answer =" + (a + b).toString()
        }

        val td = findViewById<TextView>(R.id.textViewInfo)
        td.visibility = View.INVISIBLE
    }

}

















