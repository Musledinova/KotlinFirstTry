package org.example.lesson_6

fun main() {
    println("Введите любое число: ")
    val usersNumber = readln().toInt()
    val range = 0..usersNumber

    for (i in range step 2) {
        println(i)
    }
}
