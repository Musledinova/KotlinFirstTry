package org.example.lesson_15

abstract class WeatherStationStats

class Temperature(
    val temperature: Double,
) : WeatherStationStats()

class PrecipitationAmount(
    val precipitation: Double,
) : WeatherStationStats()

class WeatherServer {
    fun sendData(weatherStationStats: WeatherStationStats) {
        when (weatherStationStats) {
            is Temperature -> println("Температура ${weatherStationStats.temperature} градусов Цельсия")
            is PrecipitationAmount -> println("Осадки ${weatherStationStats.precipitation} мм")
            else -> println("Неизвестный тип погодных данных")
        }
    }
}

fun main() {
    val temperature = Temperature(22.5)
    val precipitation = PrecipitationAmount(10.0)

    val server = WeatherServer()

    server.sendData(temperature)
    server.sendData(precipitation)
}
