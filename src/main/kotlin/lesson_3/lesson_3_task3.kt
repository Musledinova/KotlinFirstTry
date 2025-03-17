package org.example.lesson_3

fun main() {

    val number = 8

    val table = (1..9).joinToString("\n") { "$number x $it = ${number * it}" }

    println(table)

}
