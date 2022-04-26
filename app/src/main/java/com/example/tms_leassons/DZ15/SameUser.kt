package com.example.tms_leassons.DZ15


data class SameUser(val name: String, val secondName: String, val age: Int) : Comparable<SameUser> {
    override fun compareTo(other: SameUser): Int = name.compareTo(other.name)
}

val user = SameUser("Tom", "Hanks", 50)
val user1 = SameUser("Ilon", "Mask", 40)
val user2 = SameUser("Joni", "Cash", 17)

fun main() {
    add(user)
    add(user1)
    add(user2)
    sort(listU)
    removeUser(listU)
}

var listU = mutableListOf<SameUser>()

fun sort(l: List<SameUser>) {            // Method for sorting user
    val userSort = listU.sorted()
    println("Sorted list: $userSort")
}

fun add(u: SameUser) {                  // Method for adding user
    listU.add(u)
}

fun removeUser(l: List<SameUser>) {     // Method for remove user who das not have age less than 18
    for (resolt in l) {
        if (resolt.age > 18) {
            println("After remove: $resolt")
        }
    }
}

