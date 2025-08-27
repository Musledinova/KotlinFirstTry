package org.example.lesson_13

class ContactTask5(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
) {
    fun printContactInfo() {
        println("Имя: $name, номер телефона: $phoneNumber, название компании: ${company ?: "не указано"}")
    }
}

fun addNewContactTask5(): ContactTask5 {
    println("Введите имя: ")
    val newContactName = readln()

    println("Введите номер телефона: ")
    val newContactPhoneNumberInput = readln()
    var newContactPhoneNumber = 0L
    try {
        newContactPhoneNumber = newContactPhoneNumberInput.toLong()
    } catch (e: Exception) {
        println("Номер телефона должен содержать только цифры.")
    }

    println("Введите название компании: ")
    val companyNameInput: String? = readlnOrNull()

    val newContactCompanyName = if (companyNameInput.isNullOrBlank()) null else companyNameInput

    return ContactTask5(newContactName, newContactPhoneNumber, newContactCompanyName)
}

fun main() {
    val phoneBook = addNewContactTask5()
}
