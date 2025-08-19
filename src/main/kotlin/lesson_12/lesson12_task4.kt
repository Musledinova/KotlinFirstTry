package org.example.lesson_12

const val KELVIN_TO_CELSIUS = 275

class DailyWeatherFourthPart(
    dayTemperature: Int,
    nightTemperature: Int,
    isPrecipitation: Boolean,
) {
    var dayTemperature = 250
    var nightTemperature = 200
    var isPrecipitation = false

    init {
        this.dayTemperature = dayTemperature - KELVIN_TO_CELSIUS
        this.nightTemperature = nightTemperature - KELVIN_TO_CELSIUS
        println("Погода днем: $dayTemperature, погода ночью: $nightTemperature, впадание осадков: $isPrecipitation")
    }
}

fun main() {
    val dayOne = DailyWeatherFourthPart(299, 276, false)
    val dayTwo = DailyWeatherFourthPart(290, 260, true)
}
