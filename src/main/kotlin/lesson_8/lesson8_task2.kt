package org.example.lesson_8

fun main() {
    val plov = arrayOf("говядина", "рис", "лук", "морковь", "подсолнечное масло", "чеснок", "приправы")

    println("Введите необходимый ингредиент: ")
    val ingredient = readln()

    for (i in plov) {
        if (plov.contains(ingredient)) {
            println("Ингредиент [$ingredient] в рецепте есть")
            break
        }
    }
    if (!plov.contains(ingredient)) {
        println("Такого ингредиента в рецепте нет")
    }
}
