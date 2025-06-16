package org.example.lesson_10

fun main() {
    var humanWins = 0

    do {
        val isHumanWin = newRound()

        if (isHumanWin) humanWins++
        println("Хотите бросить кости еще раз? Введите Да или Нет: ")
    } while (readln().equals("Да", ignoreCase = true))

    println("Игра окончена. Вы выиграли $humanWins раз.")
}

fun newRound(): Boolean {
    val computer = getDiceValue("компьютер")
    println("Выпавшее значение: $computer")

    val user = getDiceValue("пользователь")
    println("Выпавшее значение: $user")

    return when {
        computer > user -> {
            println("Победила машина")
            false
        }

        computer < user -> {
            println("Победило человечество")
            true
        }

        else -> {
            println("Победила дружба")
            false
        }
    }
}

fun getDiceValue(player: String): Int {
    println("Ходит $player. Брось кости.")
    return (1..6).random()
}
