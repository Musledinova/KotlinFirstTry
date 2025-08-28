package org.example.lesson_14

import kotlin.math.pow
import kotlin.random.Random

private const val PI = 3.14

abstract class Figure(
    val color: String,
) {
    abstract fun calculateArea(): Double

    abstract fun calculatePerimeter(): Double
}

class Circle(
    val radius: Double,
    color: String,
) : Figure(color) {
    override fun calculateArea() = PI * radius.pow(2)

    override fun calculatePerimeter() = 2 * PI * radius
}

class Rectangle(
    val width: Double,
    val length: Double,
    color: String,
) : Figure(color) {
    override fun calculateArea() = width * length

    override fun calculatePerimeter() = 2 * (width + length)
}

enum class Color(
    val color: String,
) {
    BLACK("черный"),
    WHITE("белый"),
}

fun main() {
    val circle1 = Circle(Random.nextDouble(100.0), color = Color.BLACK.toString())
    val circle2 = Circle(Random.nextDouble(100.0), color = Color.WHITE.toString())
    val circle3 = Circle(Random.nextDouble(100.0), color = Color.WHITE.toString())

    val rectangle1 = Rectangle(Random.nextDouble(100.0), Random.nextDouble(100.0), color = Color.BLACK.toString())
    val rectangle2 = Rectangle(Random.nextDouble(100.0), Random.nextDouble(100.0), color = Color.WHITE.toString())
    val rectangle3 = Rectangle(Random.nextDouble(100.0), Random.nextDouble(100.0), color = Color.WHITE.toString())

    val figures: List<Figure> =
        listOf(
            circle1,
            circle2,
            circle3,
            rectangle1,
            rectangle2,
            rectangle3,
        )

    println(
        "Периметр всех черных фигур: ${
            figures
                .filter { it.color == Color.BLACK.toString() }
                .sumOf { it.calculatePerimeter() }
        }",
    )

    println(
        "Площадь всех белых фигур: ${
            figures
                .filter { it.color == Color.BLACK.toString() }
                .sumOf { it.calculateArea() }
        }",
    )
}
