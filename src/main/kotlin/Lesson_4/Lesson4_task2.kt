package Lesson_4

fun main() {
    val weight1 = 20
    val capacity1 = 80
    val weight2 = 50
    val capacity2 = 100

    var average = weight1 >= MIN_WEIGHT && weight1 <= MAX_WEIGHT && capacity1 <= ACCEPTABLE_CAPACITY

    println("Груз с весом $weight1 кг и объемом $capacity1 л соответствует категории 'Average': $average.")

    average = weight2 >= MIN_WEIGHT && weight2 <= MAX_WEIGHT && capacity2 <= ACCEPTABLE_CAPACITY

    println("Груз с весом $weight2 кг и объемом $capacity2 л соответствует категории 'Average': $average.")
}
const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val ACCEPTABLE_CAPACITY = 100
