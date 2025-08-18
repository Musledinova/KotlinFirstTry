package org.example.lesson_11

class Category(
    val id: String,
    val title: String,
    val picture: String,
    val description: String,
    val recipe: MutableList<String> = mutableListOf(),
)

class Recipe(
    val id: String,
    val title: String,
    val picture: String,
    val isFavorite: Boolean = false,
    val serve: Int,
    val ingredients: List<Ingredient>,
    val preparationSteps: List<String>,
)

class Ingredient(
    val name: String,
    val amount: String,
    val unit: IngredientUnits,
)

enum class IngredientUnits(
    units: String,
) {
    GRAM("Г"),
    PIECE("ШТУКИ"),
    TABLESPOON("С. ЛОЖЕК"),
}
