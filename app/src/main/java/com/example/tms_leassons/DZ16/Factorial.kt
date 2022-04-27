package com.example.tms_leassons.DZ16
//Задание 6
//Написать функцию, которая возвращает факториал числа N
fun main() {
    println("Factorial - " + factorial(4))
}
fun factorial(n: Int): Double {
    var result = 1.0
    for (i in 1..n) {
        result = result * i
    }
    return result
}