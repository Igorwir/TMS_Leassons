package com.example.tms_leassons.DZ16

import java.util.*
//Написать программу определения оценки студента по его рейтингу, на основе следующих правил:
//рейтинг Оценка
var s = Scanner(System.`in`)
fun main() {
    println("Enter rating")
    when (s.nextInt()) {
        in 0..19 -> println("Ocenka F")
        in 20..39 -> println("Ocenka E")
        in 40..59 -> println("Ocenka D")
        in 60..74 -> println("Ocenka C")
        in 75..89 -> println("Ocenka B")
        in 90..100 -> println("Ocenka A")
        else -> {
            println("Something no correct ")
        }
    }
}