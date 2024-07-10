package Lesson_4

fun main() {
    val dayOfTraining = 5

    val handTraining = (dayOfTraining % 2) != 0
    val absTtaning = (dayOfTraining % 2) != 0
    val legTraning = (dayOfTraining % 2) == 0
    val backTraning = (dayOfTraining % 2) == 0

    println(
        """Сегодня делаем упражнения-
    |Упражнения для рук:$handTraining
    |Упражнения для пресса:$absTtaning
    |
    |Упражнения для ног:$legTraning
    |Упражнения для спины:$backTraning
""".trimMargin()
    )
}