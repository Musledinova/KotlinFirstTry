package org.example.lesson_9

fun main() {
    val cheeseCake = listOf("сливки", "сахар", "яйца", "ваниль")

    println("В рецепте есть следующие ингредиенты: ")
    cheeseCake.forEach { println(it) }
}
