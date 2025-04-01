package org.example.lesson_6

fun main() {
    println("Установите время в секундах для таймера: ")
    val timeInSeconds = readln().toInt()

    var time = timeInSeconds
    do {
        time--
        Thread.sleep(1000)
    } while (time > 0)

    println("Прошло $timeInSeconds секунд")
}
