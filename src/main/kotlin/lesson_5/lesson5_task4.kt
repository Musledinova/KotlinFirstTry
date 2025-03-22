package org.example.lesson_5

fun main() {
    println("Введите имя: ")
    val userName = readln()

    if (userName == EXISTED_USER_NAME) {
        println("Введите пароль: ")
        val userPassword = readln()

        when (userPassword) {
            EXISTED_USER_PASSWORD -> {
                println("Пользователь \"$userName\", вам разрешено входить на борт корабля \"Heart of Gold\"")
            }

            else -> {
                println("Некорректный пароль. Попробуйте войти в систему снова.")
            }
        }
    } else {
        println("Зарегистрируйтесь в системе")
    }
}

const val EXISTED_USER_NAME = "Zaphod"
const val EXISTED_USER_PASSWORD = "PanGalactic"
