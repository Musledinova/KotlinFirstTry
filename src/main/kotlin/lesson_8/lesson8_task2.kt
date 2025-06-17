package org.example.lesson_8

fun main() {
    val plov = arrayOf("говядина", "рис", "лук", "морковь", "подсолнечное масло", "чеснок", "приправы")

    println("Введите необходимый ингредиент: ")
    val ingredient = readln()

    if (plov.contains(ingredient)) {
        println("Ингредиент [$ingredient] в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}
