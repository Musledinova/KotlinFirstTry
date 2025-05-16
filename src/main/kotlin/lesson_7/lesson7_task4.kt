package org.example.lesson_7

fun main() {
    println("Установите время таймера в секундах: ")
    var timeToCount = readln().toInt()

    for (i in timeToCount downTo 1) {
        println("Осталось: $i")
        Thread.sleep(1000)
    }

    println("Время вышло")
}
