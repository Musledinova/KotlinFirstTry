package org.example.lesson_3

fun main() {

    val serverResponse = "D2-D4;0"

    val moveCoordinates = serverResponse.split(";")

    val (moveFrom, moveTo) = moveCoordinates[0].split("-")
    val moveNumber = serverResponse.split(";")[1]

    println(moveFrom)
    println(moveTo)
    println(moveNumber)

}
