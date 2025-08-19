package org.example.lesson_11

class Category(
    val id: String,
    val title: String,
    val picture: String,
    val description: String,
    val recipe: List<Recipes>
)

class Recipes(
    val id: String,
    val title: String,
    val picture: String,
    val isFavorite: Boolean = false,
    val serve: Int,
    val ingredients: List<Ingredients>,
    val preparationSteps: List<String>,
)

class Ingredients(
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
