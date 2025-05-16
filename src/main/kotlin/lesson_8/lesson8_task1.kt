package org.example.lesson_8

fun main() {
    val range = 0..999

    val weeklyViews =
        intArrayOf(
            range.random(),
            range.random(),
            range.random(),
            range.random(),
            range.random(),
            range.random(),
            range.random(),
        )
    println(weeklyViews.sum())
}
