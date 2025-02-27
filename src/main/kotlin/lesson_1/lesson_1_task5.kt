package org.example.lesson_1

fun main() {

    val secondsEquivalentInTheSpace: Int = 6480

    val fullHoursInTheSpace = secondsEquivalentInTheSpace / 3600
    val remainingSecondsAfterHours = secondsEquivalentInTheSpace % 3600

    val fullMinutesInTheSpace = remainingSecondsAfterHours / 60
    val seconds = remainingSecondsAfterHours % 60

    println(String.format("Total tine in the Cosmos is: %02d:%02d:%02d", fullHoursInTheSpace, fullMinutesInTheSpace, seconds))

}
