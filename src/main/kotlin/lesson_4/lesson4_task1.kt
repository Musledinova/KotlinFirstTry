package org.example.lesson_4

fun main() {

    val totalTables = 13

    val tablesBookedToday = 13
    val tablesBookedTomorrow = 9

    println(
        "[Доступность столиков на сегодня: ${tablesBookedToday < totalTables}]" +
                "\n[Доступность столиков на завтра: ${tablesBookedTomorrow < totalTables}]"
    )

}
