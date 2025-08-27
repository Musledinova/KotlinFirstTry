package org.example.lesson_14

open class Liner(
    val speed: Int = 60,
    val cargoCapacity: Int = 2000,
    val passengerCapacity: Int = 300,
)

class Cargo(
    speed: Int,
    cargo: Int,
    passengerCapacity: Int,
) : Liner(
        speed,
        cargo,
        passengerCapacity,
    )

class Icebreaker(
    speed: Int,
    cargo: Int,
    passengerCapacity: Int,
    val breakIce: Boolean,
) : Liner(
        speed,
        cargo,
        passengerCapacity,
    )

fun main() {
    val liner = Liner()

    val cargo = Cargo(55, 3000, 150)

    val icebreaker = Icebreaker(50, 1000, 50, true)
}
