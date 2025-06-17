package org.example.lesson_10

fun main() {
    val computer = getDiceValue("компьютер")
    println("Выпавшее значение: $computer")

    val user = getDiceValue("пользователь")
    println("Выпавшее значение: $user")

    println(getWinner(computer, user))
}

fun getDiceValue(player: String): Int {
    val range = 1..6
    println("Ходит $player. Брось кости.")
    return range.random()
}

fun getWinner(
    computerValue: Int,
    userValue: Int,
): String =
    when {
        computerValue > userValue -> "Победила машина"
        computerValue < userValue -> "Победило человечество"
        else -> "Победила дружба"
    }
