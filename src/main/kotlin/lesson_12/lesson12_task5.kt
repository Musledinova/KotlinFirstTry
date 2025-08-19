package org.example.lesson_12

import kotlin.random.Random

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
        this.isPrecipitation = isPrecipitation
        println("Погода днем: $dayTemperature, погода ночью: $nightTemperature, впадание осадков: $isPrecipitation")
    }
}

fun main() {
    val dataSet: MutableList<DailyWeatherFourthPart> = mutableListOf()

    for (i in 1..30) {
        dataSet.add(
            DailyWeatherFourthPart(
                generateRandomData(),
                generateRandomData(),
                generateRandomPrecipitation(),
            ),
        )
    }

    val dayTemperatureMap: Map<Int, Int> =
        List(dataSet.size) { index -> (index + 1) to dataSet[index].dayTemperature }.toMap()

    val nightTemperatureMap: Map<Int, Int> =
        List(dataSet.size) { index -> (index + 1) to dataSet[index].nightTemperature }.toMap()

    val isPrecipitationCount = dataSet.count { it.isPrecipitation }

    val dayTemperatureAverage = dayTemperatureMap.values.average().toInt()

    val nightTemperatureAverage = nightTemperatureMap.values.average().toInt()

    println("Количество дней с осадками: $isPrecipitationCount")

    println("Средняя температура днем: $dayTemperatureAverage")

    println("Средняя температура ночью: $nightTemperatureAverage")
}

fun generateRandomData(): Int = Random.nextInt(220, 318)

fun generateRandomPrecipitation(): Boolean = Random.nextBoolean()
