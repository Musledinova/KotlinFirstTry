package org.example.lesson_6

fun main() {
    println("Создайте логин: ")
    val registeredLogin = readln()

    println("Создайте пароль: ")
    val registeredPassword = readln()

    println("Поздравляем! Ваша регистрация прошла успешно!\nПожалуйста, войдите в систему.\nВведите логин: ")

    var login = readln()

    do {
        println("Неверный логин. Попробуйте снова: ")
        login = readln()
    } while (registeredLogin != login)

    println("Введите пароль: ")
    var password = readln()

    do {
        println("Неверный пароль. Попробуйте снова: ")
        password = readln()
    } while (registeredPassword != password)

    println("Авторизация прошла успешно!")
}
