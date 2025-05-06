package org.example.lesson_6

fun main() {
    var tries = 3

    while (tries > 0) {
        val firstNumber = (1..9).random()
        val secondNumber = (1..9).random()
        val correctSum = firstNumber + secondNumber

        println("Сложите два числа: $firstNumber + $secondNumber и введите ответ: ")
        val sum = readln().toInt()

        if (sum == correctSum) {
            println("Добро пожаловать!")
            return
        } else {
            tries--
            if (tries == 0) {
                println("Доступ запрещен")
            }
        }
    }
}
