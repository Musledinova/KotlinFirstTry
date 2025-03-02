package org.example.lesson_1

fun main() {

    val secondsEquivalentInTheSpace: Int = 6480

    val secondsInMinute: Int = 60
    val minutesInHour: Int = 60
    val secondsInHour: Int = secondsInMinute * minutesInHour

    val fullHoursInTheSpace = secondsEquivalentInTheSpace / secondsInHour
    val remainingSecondsAfterHours = secondsEquivalentInTheSpace % secondsInHour

    val fullMinutesInTheSpace = remainingSecondsAfterHours / secondsInMinute
    val seconds = remainingSecondsAfterHours % secondsInMinute

    println(String.format("Total tine in the Cosmos is: %02d:%02d:%02d", fullHoursInTheSpace, fullMinutesInTheSpace, seconds))

}
