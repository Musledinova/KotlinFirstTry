package org.example.lesson_5

fun main() {
    println("Введите расстояние поездки (в километрах): ")
    val distance = readln().toDouble()

    println("Введите расход топлива на 100 км (в литрах): ")
    val consumptionPer100km = readln().toDouble()

    println("Введите текущую цену за литр топлива: ")
    val pricePerLiter = readln().toDouble()

    val fuelForTrip = distance * consumptionPer100km / 100
    val fuelCostForTrip = fuelForTrip * pricePerLiter

    val fuelForTripRounded = String.format("%.2f", fuelForTrip)
    val fuelCostForRounded = String.format("%.2f", fuelCostForTrip)

    println(
        "Общее количество необходимого топлива: $fuelForTripRounded, " +
            "итоговая стоимость поездки: $fuelCostForRounded",
    )
}
