package org.example.lesson_6

fun main() {
    val winNumber = (0..9).random()
    var tries = 5

    while (tries > 0) {
        println("Введите число от 1 до 9:")
        val number = readln().toInt()

        if (number == winNumber) {
            println("Это была великолепная игра!")
            return
        } else {
            tries--
            if (tries > 0) {
                println("Неверно. Осталось попыток: $tries")
            }
        }
    }

    println("Было загадано число: $winNumber")
}
