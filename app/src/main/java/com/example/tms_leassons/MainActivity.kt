package com.example.tms_leassons

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    val v1 = "Да"
    val v2 = "Нет"
    val v3 = "Скорее всего да"
    val v4 = "Скорее всего нет"
    val v5 = "Возможно"
    val v6 = "Имеются перспективы"
    val v7 = "Вопрос задан неверно"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val random = arrayOf(v1, v2, v3, v4, v5, v6, v7)
    val arraySize = random.size
    val rand = Random().nextInt(arraySize)


    val line = readLine()
    if (line != null) {
        val resolt = random[rand]
        println(resolt)
        Log.d("MyLog", "redid")
    }
    Log.d("MyLog", "cheking")



        }
    fun onklickTest(view:View){
        var tex = findViewById<TextView>(R.id.editTextTextPersonName)
        tex.text = readLine()
          }
    }
