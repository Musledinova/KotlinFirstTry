package org.example.lesson_10

fun main() {
    println("Задайте длину пароля для генерации: ")
    val passwordLength = readln().toInt()

    println("Сгенерированный пароль: [${generatePassword(passwordLength)}]")
}

fun generatePassword(length: Int): String {
    val digits = ('0'..'9')
    val symbols = "!\"#$%&'()*+,-./ "

    val password: MutableList<String> = mutableListOf()

    for (i in 0 until length) {
        if (i % 2 == 0) {
            password.add(digits.random().toString())
        } else {
            password.add(symbols.random().toString())
        }
    }

    return password.joinToString("")
}
