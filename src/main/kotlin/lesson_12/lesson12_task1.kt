package org.example.lesson_12

class DailyWeather() {
    var dayTemperature = "+40"
    var nightTemperature = "-10"
    var isPrecipitation = false

    constructor(
        dayTemperature: String,
        nightTemperature: String,
        isPrecipitation: Boolean,
    ) : this() {
        this.dayTemperature = dayTemperature
        this.nightTemperature = nightTemperature
        this.isPrecipitation = isPrecipitation
    }

    fun printDailyWeather() {
        println("Погода днем: $dayTemperature, погода ночью: $nightTemperature, впадание осадков: $isPrecipitation")
    }
}

fun main() {
    val dayOne = DailyWeather("+24", "+10", false)
    val dayTwo = DailyWeather("+22", "+3", true)

    dayOne.printDailyWeather()
    dayTwo.printDailyWeather()
}
