package org.example.lesson_6

fun main() {
    println("Установите время в секундах для таймера: ")
    val timeInSeconds = readln().toInt()

    var time = timeInSeconds

    while (time > 0) {
        println("Осталось секунд: ${time--}")
        Thread.sleep(1000)
    }

    println("Время вышло")
}
