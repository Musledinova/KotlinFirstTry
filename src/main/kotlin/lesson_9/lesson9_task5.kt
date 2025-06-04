package org.example.lesson_9

fun main() {
    val ingredientList = mutableListOf<String>()

    repeat(5) {
        println("Введите название ингредиента: ")
        val ingredient = readln().lowercase()
        ingredientList.add(ingredient)
    }

    val sortedList = ingredientList.toSet().sorted().toMutableList()

    sortedList[0] = sortedList[0].replaceFirstChar { it.uppercaseChar() }

    println("Результат: $sortedList")
}
