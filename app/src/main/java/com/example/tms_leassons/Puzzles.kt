package com.example.tms_leassons

import java.util.*

class Puzzles {

}
val v1 = "Да"
val v2 = "Нет"
val a1 = "answer1"
val b2 = "answer2"
//val obj = Puzzles()
val puzzles = arrayOf( v2)
val answers = arrayOf(a1,b2)
fun main() {
 addPazzles(v1)
 println(Arrays.toString( puzzles))
    println("Pick a riddle: $v1,$v2")
    val pick = readLine()
    if (pick == v1) {
        println("sam pazzl1")
        println("You have 3 variants for answer: 1) $a1, 2) $b2, 3) C ")
        val pickAnswer = readLine()
        if (pickAnswer == a1){
            println("Correct answer")
        }
        else {
            "no correct answer"
        }
        if (pick == v2) {
            println("sam pazzl2")

        }
    }
}
fun addPazzles(s:String){

}
