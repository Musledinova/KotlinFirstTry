package org.example.lesson_2

fun main() {

    val minedCrystalOre = 7
    val minedIronOre = 11
    val oneTimeBuffCoefficient = 20

    val crystalOreWithBuff = minedCrystalOre * oneTimeBuffCoefficient / 100
    val ironOreWithBuff = minedIronOre * oneTimeBuffCoefficient / 100

    println("Buff value for mined crystal ore: $crystalOreWithBuff")
    println("Buff value for mined iron ore: $ironOreWithBuff")

}
