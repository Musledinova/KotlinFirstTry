package org.example.lesson_4

fun main() {

    val todayWeather = true
    val tentState = true
    val humidity = 20
    val season = "зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? ${
            todayWeather == SUN_WEATHER &&
                    tentState == IS_TENT_OPEN &&
                    humidity == AIR_HUMIDITY &&
                    season in SEASON.split(", ")
        }"
    )

}

const val SUN_WEATHER = true
const val IS_TENT_OPEN = true
const val AIR_HUMIDITY = 20
const val SEASON = "весна, лето, осень"
