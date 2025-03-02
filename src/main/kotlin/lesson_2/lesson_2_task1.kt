package org.example.lesson_2

fun main() {

    val numberOfStudents = 4
    val studentMarks = listOf(3, 4, 3, 5)

    val averageMark = studentMarks.sum() / numberOfStudents.toDouble()

    println(averageMark)

}
