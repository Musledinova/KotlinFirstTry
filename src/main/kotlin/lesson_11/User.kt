package org.example.lesson_11

class User(
    val userId: String,
    val login: String,
    val password: String,
    val email: String,
)

fun main() {
    val user1 = User("001", "kate_kotlin", "kotlin123!", "kotlin@gmail.com")

    val user2 = User("002", "alex_sprint", "kotlinSprint123!", "kotlinSprint@gmail.com")

    println(user1.userId)
    println(user1.login)
    println(user1.password)
    println(user1.email)

    println()

    println(user2.userId)
    println(user2.login)
    println(user2.password)
    println(user2.email)
}
