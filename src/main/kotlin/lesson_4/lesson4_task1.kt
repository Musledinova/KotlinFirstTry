package org.example.lesson_4

fun main() {

    val tablesBookedToday = 13
    val tablesBookedTomorrow = 9

    println(
        "[Доступность столиков на сегодня: ${tablesBookedToday < TOTAL_TABLES}]" +
                "\n[Доступность столиков на завтра: ${tablesBookedTomorrow < TOTAL_TABLES}]"
    )

}

const val TOTAL_TABLES = 13
