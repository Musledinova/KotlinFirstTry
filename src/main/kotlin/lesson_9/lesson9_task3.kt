package org.example.lesson_9

fun main() {
    val omeletteOneServe = mutableListOf(2, 50, 15)

    println("Введите количество порций: ")
    val serveAmount = readln().toInt()

    val omeletteForUserServe = omeletteOneServe.map { it * serveAmount }

    println(
        "На $serveAmount порций вам понадобится: " +
            "яиц – ${omeletteForUserServe[0]} шт, " +
            "молока – ${omeletteForUserServe[1]} мл, " +
            "сливочного масла – ${omeletteForUserServe[2]} гр",
    )
}
