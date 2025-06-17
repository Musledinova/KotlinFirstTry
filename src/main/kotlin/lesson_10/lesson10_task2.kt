package org.example.lesson_10

const val VALIDATION_MIN_LENGTH = 4

fun main() {
    println("Введите логин: ")
    val login = readln()

    println("Введите пароль: ")
    val password = readln()

    if (isValidLength(login) && isValidLength(password)) {
        println("Добро пожаловать")
    } else {
        println("Логин или пароль недостаточно длинные")
    }
}

fun isValidLength(inputValue: String): Boolean = inputValue.length >= VALIDATION_MIN_LENGTH
