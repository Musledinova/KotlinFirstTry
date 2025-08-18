package org.example.lesson_11

class User2(
    val userId: String,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "",
) {
    fun printUserInfo(user: User2) {
        println(user.userId)
        println(user.login)
        println(user.password)
        println(user.email)
        println(user.bio)
    }

    fun fillInBio(user: User2) {
        println("Заполните поле bio: ")
        user.bio = readln()
    }

    fun changePassword(user: User2) {
        println("Введите текущий пароль: ")
        val password = readln()

        if (user.password == password) {
            println("Введите новый пароль: ")
            user.password = readln()
            println("Пароль успешно изменен!")
        } else {
            println("Пароль введен неверно.")
        }
    }
}

fun main() {
    val user = User2("001", "kate_kotlin", "kotlin123!", "kotlin@gmail.com")

    user.fillInBio(user)

    user.changePassword(user)

    user.printUserInfo(user)
}
