package org.example.lesson_14

open class CelestialBody(
    val name: String,
    val atmosphere: Boolean = false,
    val isGoodForLanding: Boolean = false,
)

class Planet(
    name: String,
    atmosphere: Boolean,
    isGoodForLanding: Boolean,
    val satellites: List<Satellite>,
) : CelestialBody(name, atmosphere, isGoodForLanding)

class Satellite(
    name: String,
    atmosphere: Boolean,
    isGoodForLanding: Boolean,
) : CelestialBody(name, atmosphere, isGoodForLanding)

fun main() {
    val satellite1 = Satellite("Спутник 1", false, false)
    val satellite2 = Satellite("Спутник 2", false, true)

    val newPlanet = Planet("Планета", true, true, listOf(satellite1, satellite2))

    println("Название планеты: ${newPlanet.name}")

    newPlanet.satellites.forEach { println("Название спутника: ${it.name}") }
}
