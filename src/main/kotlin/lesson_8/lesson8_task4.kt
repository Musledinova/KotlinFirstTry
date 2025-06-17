package org.example.lesson_8

fun main() {
    val plov = arrayOf("говядина", "рис", "лук", "морковь", "подсолнечное масло", "чеснок", "приправы")

    println(plov.joinToString())

    println("Какой ингредиент Вы хотите заменить в блюде?")
    val ingredient = readln()

    val index = plov.indexOf(ingredient)

    if (index != -1) {
        println("На какой ингредиент Вы хотите заменить $ingredient в блюде?")
        val newIngredient = readln()

        plov[index] = newIngredient

        println("Готово! Вы сохранили следующий список: ${plov.joinToString()}")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}
