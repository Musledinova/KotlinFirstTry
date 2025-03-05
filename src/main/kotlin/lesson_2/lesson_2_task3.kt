package org.example.lesson_2

fun main() {

    val departureHours = 9
    val departureMinutes = 39
    val travelTimeMinutes = 457

    val minutesInHour = 60

    val departureTimeInMinutes = departureHours * minutesInHour + departureMinutes
    val arrivalTimeInMinutes = departureTimeInMinutes + travelTimeMinutes

    val arrivalHours = arrivalTimeInMinutes / minutesInHour
    val arrivalMinutes = arrivalTimeInMinutes % minutesInHour

    println("$arrivalHours:$arrivalMinutes")

}
