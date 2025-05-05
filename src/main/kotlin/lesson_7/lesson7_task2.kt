package org.example.lesson_7

fun main() {
    val range = 1000..9999
    var confirmationCode = range.random()

    while (true) {
        println("Ваш код авторизации: $confirmationCode")
        print("Введите код авторизации: ")
        val userCode = readln().toInt()

        if (userCode == confirmationCode) {
            println("Авторизация прошла успешно!")
            break
        } else {
            println("Неверный код. Отправляем новый...")
            confirmationCode = range.random()
        }
    }
}
