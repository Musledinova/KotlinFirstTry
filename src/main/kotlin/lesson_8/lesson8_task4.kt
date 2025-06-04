package org.example.lesson_8

fun main() {
    val plov = arrayOf("говядина", "рис", "лук", "морковь", "подсолнечное масло", "чеснок", "приправы")

    println(plov.joinToString())

    println("Какой ингредиент Вы хотите заменить в блюде?")
    val ingredient = readln()

    if (plov.contains(ingredient)) {
        println("На какой ингредиент Вы хотите заменить $ingredient в блюде?")
        val newIngredient = readln()

        val changingElement = plov.indexOf(ingredient)
        plov[changingElement] = newIngredient

        println("Готово! Вы сохранили следующий список: ${plov.joinToString()}")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}
