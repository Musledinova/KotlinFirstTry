package org.example.lesson_6

const val MILLISECONDS = 1000L

fun main() {
    println("Установите время в секундах для таймера: ")
    val timeInSeconds = readln().toLong()

    Thread.sleep(timeInSeconds * MILLISECONDS)

    println("Прошло $timeInSeconds секунд")
}
