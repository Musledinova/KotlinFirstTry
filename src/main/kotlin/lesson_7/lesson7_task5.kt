package org.example.lesson_7

fun main() {
    val lowerChars = 'a'..'z'
    val upperChars = 'A'..'Z'
    val numbers = '0'..'9'
    val allChars = lowerChars + upperChars + numbers

    while (true) {
        println("Введите длину пароля для случайной генерации (минимум 6 символов): ")
        val length = readln().toInt()
        if (length >= 6) {
            val password = mutableListOf<Char>()
            password += lowerChars.random()
            password += upperChars.random()
            password += numbers.random()

            for (i in 4..length) {
                password += allChars.random()
            }

            val finalPassword = password.shuffled().joinToString("")
            println(finalPassword)

            break
        } else {
            println("Введена длина пароля меньше 6 символов. Попробуйте снова.")
        }
    }
}
