package org.example.lesson_2

fun main() {

    val minedCrystalOre = 7
    val minedIronOre = 11
    val oneTimeBuffCoefficient = 20
    val percents = 100

    val crystalOreWithBuff = minedCrystalOre * oneTimeBuffCoefficient / percents
    val ironOreWithBuff = minedIronOre * oneTimeBuffCoefficient / percents

    println("Buff value for mined crystal ore: $crystalOreWithBuff")
    println("Buff value for mined iron ore: $ironOreWithBuff")

}
