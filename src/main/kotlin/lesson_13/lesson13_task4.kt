package org.example.lesson_13

class ContactTask4(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
) {
    fun printContactInfo() {
        println("Имя: $name, номер телефона: $phoneNumber, название компании: ${company ?: "не указано"}")
    }
}

fun addNewContact(): ContactTask4 {
    println("Введите имя: ")
    val newContactName = readln()

    var newContactPhoneNumber: Long?
    println("Введите номер телефона: ")
    do {
        newContactPhoneNumber = readln().toLongOrNull()
        if (newContactPhoneNumber == null) {
            println("Номер телефона не может быть пустым. Повторите снова.")
        }
    } while (newContactPhoneNumber == null)

    println("Введите название компании: ")
    val companyNameInput: String? = readlnOrNull()

    val newContactCompanyName = if (companyNameInput.isNullOrBlank()) null else companyNameInput

    return ContactTask4(newContactName, newContactPhoneNumber, newContactCompanyName)
}

fun main() {
    val phoneBook = arrayListOf<ContactTask4>()

    do {
        phoneBook.add(addNewContact())
        println("Хотите добавить еще контакты? Введите Да или Нет: ")
    } while (readln() == "Да")

    phoneBook.forEach { it.printContactInfo() }
}
