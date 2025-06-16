package org.example.lesson_8

fun main() {
    println("Введите количество ингредиентов в блюде: ")
    val amount = readln().toInt()
    val ingredients = Array(amount) { "" }

    for (i in 0 until amount) {
        println("Введите ингредиент: ")
        val ingredient = readln()
        ingredients[i] = ingredient
    }
    println("Список ингредиентов: ${ingredients.joinToString()}")
}
