package org.example.lesson_5

import kotlin.math.pow

fun main() {
    println("Введите ваш вес в килограммах, например, 55.3: ")
    val weight = readlnOrNull()?.toDouble() ?: 0.00

    println("Введите ваш рост в сантиметрах, например, 185: ")
    val heightInCm = readlnOrNull()?.toFloat() ?: 0f

    val heightInM = heightInCm / CM_TO_M_RATIO

    val bodyMassIndex = weight / heightInM.pow(EXPONENT)
    val bodyMassIndexTruncated = (bodyMassIndex * 100).toInt() / 100.0

    val category =
        when {
            bodyMassIndexTruncated < 18.5 -> "Недостаточная масса тела"
            bodyMassIndexTruncated < 25.0 -> "Нормальная масса тела"
            bodyMassIndexTruncated < 30.0 -> "Избыточная масса тела"
            else -> "Ожирение"
        }

    println("Ваш Индекс массы тела: $bodyMassIndexTruncated, в категории: $category")
}

const val CM_TO_M_RATIO = 100.00
const val EXPONENT = 2
