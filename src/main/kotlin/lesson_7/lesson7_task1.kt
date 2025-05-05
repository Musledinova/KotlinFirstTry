package org.example.lesson_7

fun main() {
    val numRange: IntRange = 0..9
    val letRange: CharRange = 'a'..'z'

    var password = ""

    for (i in 1..3) {
        val letter = letRange.random()
        val digit = numRange.random()
        password += "$letter$digit"
    }

    println(password)
}
