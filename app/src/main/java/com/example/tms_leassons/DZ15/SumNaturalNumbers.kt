package com.example.tms_leassons.DZ15

import java.util.*

val reader = Scanner(System.`in`)
var integer: Int = reader.nextInt()
var sum = 0
fun main() {
    while (integer > 0) {
        val dig = integer % 10
        sum += dig
        integer /= 10
    }
    println(sum)
}
