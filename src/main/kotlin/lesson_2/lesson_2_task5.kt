package org.example.lesson_2

import kotlin.math.pow


fun main() {

    val investedAmount = 70000.0
    val percentagePerYear = 16.7
    val investmentTimeYears = 20

    val investedAmountWithEarnedPercentage = investedAmount * (1 + percentagePerYear / 100).pow(investmentTimeYears)

    println("Total amount after 20 years: ${"%.3f".format(investedAmountWithEarnedPercentage)}")

}