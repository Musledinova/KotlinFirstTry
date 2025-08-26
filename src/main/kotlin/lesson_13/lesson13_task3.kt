package org.example.lesson_13

class ContactTask3(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
) {
    fun printContactInfo() {
        println("Имя: $name, номер телефона: $phoneNumber, название компании: ${company ?: "не указано"}")
    }
}

fun main() {
    val contacts: ArrayList<ContactTask3> =
        arrayListOf(
            ContactTask3("Kate", 9312746381, null),
            ContactTask3("Alex", 9312746382, null),
            ContactTask3("John", 9312746383, "null"),
            ContactTask3("Liza", 9312746384, "Trust & Co"),
            ContactTask3("Stephan", 9312746385, "InvestmentPRO"),
        )

    val companies: List<String> = contacts.mapNotNull { it.company }

    companies.forEach { company -> println(company) }
}
