package org.example.lesson_12

class DailyWeatherSecondPart(
    val dayTemperature: String,
    val nightTemperature: String,
    val isPrecipitation: Boolean,
) {
    fun printDailyWeather() {
        println("Погода днем: $dayTemperature, погода ночью: $nightTemperature, впадание осадков: $isPrecipitation")
    }
}

fun main() {
    val dayOne = DailyWeatherSecondPart("+24", "+10", false)
    val dayTwo = DailyWeatherSecondPart("+22", "+3", true)

    dayOne.printDailyWeather()
    dayTwo.printDailyWeather()
}
