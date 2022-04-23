package com.example.tms_leassons.DZ14


 class User(val name: String, val secondName: String, val age: Int) {
}


var listUsers = mutableListOf<User>()

val user = User("Bob", "Smith", 24)
val user2 = User("Jon", "Bond", 30)
fun main() {
    addUser(user)
    addUser(user2)
    showList()
}

fun addUser(us: User) {
    listUsers.add(us)

}
fun showList() {
    listUsers.forEach {
        println("Name: ${it.name}  ${it.secondName} age: ${it.age}")
    }
}