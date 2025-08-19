package org.example.lesson_11

class User2(
    val userId: String,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "",
) {
    fun printUserInfo() {
        println(userId)
        println(login)
        println(password)
        println(email)
        println(bio)
    }

    fun fillInBio() {
        println("Заполните поле bio: ")
        bio = readln()
    }

    fun changePassword() {
        println("Введите текущий пароль: ")
        val currentPassword = readln()

        if (password == currentPassword) {
            println("Введите новый пароль: ")
            password = readln()
            println("Пароль успешно изменен!")
        } else {
            println("Пароль введен неверно.")
        }
    }
}

fun main() {
    val user = User2("001", "kate_kotlin", "kotlin123!", "kotlin@gmail.com")

    user.fillInBio()

    user.changePassword()

    user.printUserInfo()
}
