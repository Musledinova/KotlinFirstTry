package org.example.lesson_9

fun main() {
    println("Введите 5 ингредиентов по порядку через запятую с пробелом. Например, \"яйца, соль, масло, перец, лук\": ")
    val ingredients = readln()
    val ingredientsList = ingredients.split(", ")
    val sortedList = ingredientsList.sorted()

    println(sortedList)
}
