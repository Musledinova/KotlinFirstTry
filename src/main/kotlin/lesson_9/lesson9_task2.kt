package org.example.lesson_9

fun main() {
    val borsh = mutableListOf("капуста", "мясо", "морковь")
    println("В рецепте есть базовые ингредиенты: ${borsh.joinToString()}")

    println("Желаете добавить еще?")
    val change = readln()

    if (change.lowercase() == "да") {
        println("Какой ингредиент вы хотите добавить?")
        val newIngredient = readln()
        borsh.add(newIngredient)
        println("Теперь в рецепте есть следующие ингредиенты: ${borsh.joinToString()}")
    } else {
        println("Рецепт остаётся без изменений.")
    }
}
