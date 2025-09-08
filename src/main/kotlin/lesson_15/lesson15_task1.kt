package org.example.lesson_15

interface Flyable {
    fun fly() {
        println("Полетели!")
    }
}

interface Swimmable {
    fun swim() {
        println("Поплыли!")
    }
}

class CrucianCarp(
    private val name: String = "Карась",
) : Swimmable {
    override fun swim() {
        println("${this.name} поплыл!")
    }
}

class Seagull(
    private val name: String = "Чайка",
) : Flyable {
    override fun fly() {
        println("${this.name} полетела!")
    }
}

class Duck(
    private val name: String = "Утка",
) : Flyable,
    Swimmable {
    override fun fly() = println("$name полетела!")

    override fun swim() = println("$name поплыла!")

    fun move() {
        fly()
        swim()
    }
}

fun main() {
    CrucianCarp().swim()

    Seagull().fly()

    Duck().move()
}
