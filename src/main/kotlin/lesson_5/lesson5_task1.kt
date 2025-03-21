package org.example.lesson_5

fun main() {
    val firstNumber = (Math.random() * 10 + 1).toInt()
    val secondNumber = (Math.random() * 10 + 1).toInt()
    println("Чтобы убедиться, что Вы не робот [О_О], ведите сумму двух чисел: $firstNumber + $secondNumber:")

    val answer = readln().toInt()

    if (answer == firstNumber + secondNumber) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}
