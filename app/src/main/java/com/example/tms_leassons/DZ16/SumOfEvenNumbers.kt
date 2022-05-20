package com.example.tms_leassons.DZ16
//Задание 5
//Найти сумму четных чисел и их количество в диапазоне от 1 до 99
var count = 0
var sumI = 0
fun main() {
    for (i in 1..99) {
        if (i % 2 == 0) {
            count++
            sumI = sumI + i
        }
    }
    println(" SumEvenNumbers -$sumI : countEvenNumbers -$count")
}