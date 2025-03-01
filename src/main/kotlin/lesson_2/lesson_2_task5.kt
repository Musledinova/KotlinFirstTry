package org.example.lesson_2


fun main() {

    val investedAmount = 70000.0
    val percentagePerYear = 16.7
    val investmentTimeYears = 20

    var investedAmountWithEarnedPercentage = investedAmount

    for (i in 1..investmentTimeYears) {
        val earnedPercentageSumPerYear = investedAmountWithEarnedPercentage * percentagePerYear / 100.0
        investedAmountWithEarnedPercentage += earnedPercentageSumPerYear
    }

    println("Total amount after 20 years: ${"%.3f".format(investedAmountWithEarnedPercentage)}")
}
