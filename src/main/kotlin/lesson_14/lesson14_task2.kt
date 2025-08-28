package org.example.lesson_14

open class LinerTask2(
    open val speed: Int = 60,
    open val cargoCapacity: Int = 2000,
    open val passengerCapacity: Int = 300,
) {
    open fun cargoLoadingMethod() {
        println("Внимание! Осуществляется погрузка: выдвигаем горизонтальный трап со шкафута")
    }

    open fun printShipCharacteristic() {
        println("Скорость: $speed, грузоподъемность: $cargoCapacity, пассажировместимость: $passengerCapacity")
    }
}

class CargoTask2 :
    LinerTask2(
        speed = 55,
        cargoCapacity = 3000,
        passengerCapacity = 150,
    ) {
    override fun cargoLoadingMethod() {
        println("Внимание! Осуществляется погрузка: активируем посадочный кран")
    }
}

class IcebreakerTask2(
    val breakIce: Boolean = true,
) : LinerTask2(
        speed = 50,
        cargoCapacity = 1000,
        passengerCapacity = 50,
    ) {
    override fun cargoLoadingMethod() {
        println("Внимание! Осуществляется погрузка: открываем ворота со стороны кормы")
    }

    override fun printShipCharacteristic() {
        super.printShipCharacteristic()
        println("Ледодробильный элемент: $breakIce")
    }
}

fun main() {
    val liner = LinerTask2()
    liner.printShipCharacteristic()

    val cargo = CargoTask2()
    cargo.printShipCharacteristic()

    val icebreaker = IcebreakerTask2()
    icebreaker.printShipCharacteristic()
}
