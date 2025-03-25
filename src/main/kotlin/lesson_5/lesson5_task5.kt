package org.example.lesson_5

fun main() {
    val winningNumbers = List(3) { (0..42).random() }
    val numbersFromUser: MutableList<Int> = mutableListOf()

    println("Введите первое число от 0 до 42 включительно: ")
    numbersFromUser.add(readln().toInt())

    println("Введите второе число от 0 до 42 включительно: ")
    numbersFromUser.add(readln().toInt())

    println("Введите третье число от 0 до 42 включительно: ")
    numbersFromUser.add(readln().toInt())

    when (val result = winningNumbers.intersect(numbersFromUser.toSet()).size) {
        3 -> println("Поздравляем! Вы угадали все $result числа и выиграли джек-пот!")
        2 -> println("Поздравляем! Вы угадали $result числа и выиграли крупный приз!")
        1 -> println("Поздравляем! Вы угадали $result число и выиграли приз!")
        0 -> println("К сожалению, Вы не угадали ни одного числа 8(")
    }

    println("Победные числа: ${winningNumbers.joinToString(", ")}")
}
