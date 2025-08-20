package org.example.lesson_12

class DailyWeather {
    var dayTemperature = "+40"
    var nightTemperature = "-10"
    var isPrecipitation = false

    fun printDailyWeather() {
        println("Погода днем: $dayTemperature, погода ночью: $nightTemperature, впадание осадков: $isPrecipitation")
    }
}

fun main() {
    val dayOne = DailyWeather()
    dayOne.dayTemperature = "+24"
    dayOne.nightTemperature = "+10"
    dayOne.isPrecipitation = false

    val dayTwo = DailyWeather()
    dayTwo.dayTemperature = "+22"
    dayTwo.nightTemperature = "+3"
    dayTwo.isPrecipitation = true

    dayOne.printDailyWeather()
    dayTwo.printDailyWeather()
}
