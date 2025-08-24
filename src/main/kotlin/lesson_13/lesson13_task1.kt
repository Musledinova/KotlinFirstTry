package org.example.lesson_13

class Contact(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
)

fun main() {
    val contact = Contact("Kate", 9312746381, null)

    println(contact.name)
    println(contact.phoneNumber)
    println(contact.company)
}
