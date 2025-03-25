package org.example.lesson_5

fun main() {
    val firstNumber = (0..42).random()
    val secondNumber = (0..42).random()

    println("Введите число от 0 до 42 включительно: ")
    val firstNumberFromUser = readln().toInt()

    println("Введите число от 0 до 42 включительно: ")
    val secondNumberFromUser = readln().toInt()

    println("Победные числа: $firstNumber и $secondNumber")
    if (firstNumber == firstNumberFromUser &&
        secondNumber == secondNumberFromUser ||
        firstNumber == secondNumberFromUser &&
        secondNumber == firstNumberFromUser
    ) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (firstNumber == firstNumberFromUser ||
        secondNumber == secondNumberFromUser ||
        firstNumber == secondNumberFromUser ||
        secondNumber == firstNumberFromUser
    ) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }
}
