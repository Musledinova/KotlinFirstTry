package org.example.lesson_2

fun main() {

    val departureHours = 9
    val departureMinutes = 39
    val travelTimeMinutes = 457

    val departureTimeInMinutes = departureHours * 60 + departureMinutes
    val arrivalTimeInMinutes = departureTimeInMinutes + travelTimeMinutes

    val arrivalHours = arrivalTimeInMinutes / 60
    val arrivalMinutes = arrivalTimeInMinutes % 60

    println("$arrivalHours:$arrivalMinutes")

}
