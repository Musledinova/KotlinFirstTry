package org.example.lesson_7

fun main() {
    println("Установите время таймера в секундах: ")
    var timeToCount = readln().toInt()

    for (i in 1..timeToCount) {
        println("Осталось: ${timeToCount--}")
        Thread.sleep(1000)
    }

    println("Время вышло")
}
