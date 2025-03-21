package org.example.lesson_5

fun main() {
    println("Введите год рождения: ")
    val birthYear = readln().toInt()

    if (CURRENT_YEAR - birthYear >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    }
}

const val CURRENT_YEAR = 2025
const val AGE_OF_MAJORITY = 18
