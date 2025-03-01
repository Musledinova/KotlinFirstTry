package org.example.lesson_2

fun main() {

    var numberOfEmployees = 50
    val employeesSalary = 30000

    var totalSalaryCosts = numberOfEmployees * employeesSalary

    val numberOfInterns = 30
    val internsSalary = 20000
    val totalCostsToInterns = numberOfInterns * internsSalary

    totalSalaryCosts += totalCostsToInterns
    numberOfEmployees += numberOfInterns

    val averageSalaryInCompany = totalSalaryCosts / numberOfEmployees

    println(averageSalaryInCompany)

}