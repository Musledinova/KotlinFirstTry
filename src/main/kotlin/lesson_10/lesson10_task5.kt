package org.example.lesson_10

const val LOGIN = "amusledinova"
const val PASSWORD = "KotlinSprint2025"
const val TOKEN_LENGTH = 32

fun main() {
    println("Введите логин: ")
    val login = readln()

    println("Введите пароль: ")
    val password = readln()

    val token = getToken(login, password)

    if (token != null) {
        println(getShoppingList(token))
    } else {
        println("Неудачная авторизация. Попробуйте залогиниться снова.")
    }
}

fun getToken(
    login: String,
    password: String,
): String? =
    if (login == LOGIN && password == PASSWORD) {
        generateToken(login)
    } else {
        null
    }

fun generateToken(login: String): String {
    val chars = 'A'..'Z'
    val numbers = '0'..'9'

    val token = mutableListOf<Char>()

    val tokenLength = TOKEN_LENGTH - login.length

    repeat(tokenLength / 2) {
        token += chars.random()
        token += numbers.random()
    }

    if (tokenLength % 2 != 0) {
        token += (chars + numbers).random()
    }

    return token.shuffled().joinToString("") + login
}

fun getShoppingList(token: String): Map<String, String>? =
    if (token.contains(LOGIN)) {
        mapOf(
            "лук" to "1 кг",
            "морковь" to "1 кг",
            "свекла" to "500 гр",
            "говядина" to "500 гр",
        )
    } else {
        null
    }
