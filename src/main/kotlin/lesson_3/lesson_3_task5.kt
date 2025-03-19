package org.example.lesson_3

fun main() {

    val serverResponse = "D2-D4;0"

    val (moveFrom, moveTo, moveNumber) = serverResponse
        .split(";", "-")

    println(moveFrom)
    println(moveTo)
    println(moveNumber)

}
