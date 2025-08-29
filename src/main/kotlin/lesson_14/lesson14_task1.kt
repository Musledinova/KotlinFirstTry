package org.example.lesson_14

open class Liner(
    open val speed: Int = 60,
    open val cargoCapacity: Int = 2000,
    open val passengerCapacity: Int = 300,
)

class Cargo :
    Liner(
        speed = 55,
        cargoCapacity = 3000,
        passengerCapacity = 150,
    )

class Icebreaker(
    val breakIce: Boolean = true,
) : Liner(
        speed = 50,
        cargoCapacity = 1000,
        passengerCapacity = 50,
    )

fun main() {
    val liner = Liner()

    val cargo = Cargo()

    val icebreaker = Icebreaker()
}
