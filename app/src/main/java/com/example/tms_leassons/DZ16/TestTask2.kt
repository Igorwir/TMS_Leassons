package com.example.tms_leassons.DZ16

import android.os.Build
import androidx.annotation.RequiresApi
import java.lang.Integer.max

//Создать функциональную переменную для выражение макс(а*б*с, а+б+с)
@RequiresApi(Build.VERSION_CODES.N)
fun main() {

    val g = { a: Int, b: Int,c:Int -> max( a + b + c, a * b * c) }
    val h = g(2,2,3)
    println(h)
}