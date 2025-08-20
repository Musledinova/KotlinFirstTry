package org.example.lesson_12

const val KELVIN_TO_CELSIUS = 275

class DailyWeatherThirdPart(
    dayTemperature: Int,
    nightTemperature: Int,
    isPrecipitation: Boolean,
) {
    val dayTemperature = dayTemperature - KELVIN_TO_CELSIUS
    val nightTemperature = nightTemperature - KELVIN_TO_CELSIUS
    val isPrecipitation = isPrecipitation

    fun printDailyWeatherThirdPart() {
        println("Погода днем: $dayTemperature, погода ночью: $nightTemperature, впадание осадков: $isPrecipitation")
    }
}

fun main() {
    val dayOne = DailyWeatherThirdPart(299, 276, false)
    val dayTwo = DailyWeatherThirdPart(290, 260, true)

    dayOne.printDailyWeatherThirdPart()
    dayTwo.printDailyWeatherThirdPart()
}
