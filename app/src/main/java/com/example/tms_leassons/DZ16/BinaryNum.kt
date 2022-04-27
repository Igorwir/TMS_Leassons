package com.example.tms_leassons.DZ16
//Задание 7
//Написать функцию, которая возвратит строковое представление числа N(dec) в двоичном формате
fun main() {
    toBinary(10)
}

fun toBinary(binNum: Int) {
    val binary = Integer.toBinaryString(binNum)
    println("Your number in binary format - $binary")
}