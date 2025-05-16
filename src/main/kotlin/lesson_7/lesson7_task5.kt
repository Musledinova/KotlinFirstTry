package org.example.lesson_7

fun main() {
    val lowerChars = 'a'..'z'
    val upperChars = 'A'..'Z'
    val numbers = '0'..'9'
    val allChars = lowerChars + upperChars + numbers

    var password = ""

    while (true) {
        println("Введите длину пароля для случайной генерации (минимум 6 символов): ")
        val length = readln().toInt()
        if (length >= 6) {
            password += lowerChars.random()
            password += upperChars.random()
            password += numbers.random()

            for (i in 1..length - 3) {
                password += allChars.random()
            }

            password.toList().shuffled().joinToString("")

            break
        } else {
            println("Введена длина пароля меньше 6 символов. Попробуйте снова.")
        }
    }
}
