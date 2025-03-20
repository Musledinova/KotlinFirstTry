package lesson_4

fun main() {

    val firstCargoWeight = 20
    val firstCargoValue = 80

    val secondCargoWeight = 50
    val secondCargoValue = 100

    println(
        "Груз с весом $firstCargoWeight кг и объемом $firstCargoValue л соответствует категории '$AVERAGE_CATEGORY': " +
                "${
                    (firstCargoWeight > AVERAGE_CATEGORY_WEIGHT_FROM) && (firstCargoWeight <= AVERAGE_CATEGORY_WEIGHT_TO)
                            && (firstCargoValue <= AVERAGE_CATEGORY_VALUE)
                } \n" +
                "Груз с весом $secondCargoWeight кг и объемом $secondCargoValue л соответствует категории '$AVERAGE_CATEGORY': ${
                    (secondCargoWeight > AVERAGE_CATEGORY_WEIGHT_FROM) && (secondCargoWeight <= AVERAGE_CATEGORY_WEIGHT_TO)
                            && (secondCargoValue <= AVERAGE_CATEGORY_VALUE)
                }"
    )

}

const val AVERAGE_CATEGORY = "Average"
const val AVERAGE_CATEGORY_WEIGHT_FROM = 35
const val AVERAGE_CATEGORY_WEIGHT_TO = 100
const val AVERAGE_CATEGORY_VALUE = 100
