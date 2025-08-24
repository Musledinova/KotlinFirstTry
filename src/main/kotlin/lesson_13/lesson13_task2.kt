package org.example.lesson_13

class ContactTask2(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
) {
    init {
        println("Имя: $name, номер телефона: $phoneNumber, название компании: ${company ?: "не указано"}")
    }
}

fun main() {
    ContactTask2("Kate", 9312746381, null)
}
