package org.example.lesson_4

fun main() {

    println("Пройдите небольшой опросник для определения возможности ко взлету сегодня")

    print("Введите значение true/false — поврежден ли корабль: ")
    val isDamaged = readlnOrNull()?.toBoolean() ?: false

    print("Введите количество членов экипажа на корабле: ")
    val currentCabinCrew = readlnOrNull()?.toIntOrNull() ?: 0

    print("Введите количество провизии в шт на корабле: ")
    val currentFoodAmount = readlnOrNull()?.toIntOrNull() ?: 0

    print("Введите \"благоприятна\" - если погода хорошая, или \"неблагоприятна\" - если не очень): ")
    val currentWeather = readlnOrNull()

    val isReadyForStart = isDamaged == IS_DAMAGED &&
            currentCabinCrew in CREW_LOW_VALUE..CREW_HIGH_VALUE &&
            currentFoodAmount > FOOD_AMOUNT &&
            currentWeather in GOOD_WEATHER.split(",") ||
            currentCabinCrew == CREW_RECOMMENDED_VALUE &&
            currentFoodAmount == RECOMMENDED_FOOD_AMOUNT &&
            currentWeather == RECOMMENDED_WEATHER

    println("Are we ready for start: $isReadyForStart")

}

const val IS_DAMAGED = false
const val CREW_LOW_VALUE = 55
const val CREW_HIGH_VALUE = 70
const val FOOD_AMOUNT = 50
const val GOOD_WEATHER = "благоприятна, неблагоприятна"

const val CREW_RECOMMENDED_VALUE = 70
const val RECOMMENDED_WEATHER = "благоприятна"
const val RECOMMENDED_FOOD_AMOUNT = 50
