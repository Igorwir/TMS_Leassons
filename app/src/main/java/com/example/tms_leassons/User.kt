package com.example.tms_leassons




class User(name:String,secondName:String,age:Int) {

}


var listUsers:MutableList<User> = mutableListOf()
fun main() {
 val user = User("Bob", "Smith", 24)
 val user2 = User("Jon", "Bond", 30)
 addUser(user)

 listUsers.forEach{ println(it.toString())}
}
 fun addUser(us: User) {
  listUsers.add(us)

 }
