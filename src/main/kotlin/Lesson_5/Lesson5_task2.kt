package Lesson_5

fun main() {

    println("Введите год рождения:")
    val thisYear = 2024
    val userYear = readln().toInt()

    if (thisYear - userYear >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    }
}
const val AGE_OF_MAJORITY = 18