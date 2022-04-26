package com.example.tms_leassons.DZ14

import android.util.Log
import java.util.*


class Randoms {


}

fun main() {
    val v1 = "Да"
    val v2 = "Нет"
    val v3 = "Скорее всего да"
    val v4 = "Скорее всего нет"
    val v5 = "Возможно"
    val v6 = "Имеются перспективы"
    val v7 = "Вопрос задан неверно"
    val random = arrayOf(v1, v2, v3, v4, v5, v6, v7)
    val arraySize = random.size
    val rand = Random().nextInt(arraySize)
    println("Input your question :")
    val line = readLine()
    if (line != null) {
        val resolt = random[rand]
        println(resolt)

    }
}







