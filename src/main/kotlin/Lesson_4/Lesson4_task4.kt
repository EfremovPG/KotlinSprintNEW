package Lesson_4

fun main() {
    val dayOfTraining = 5
    val isEven = (dayOfTraining % 2) != 0
    val isNotEven = (dayOfTraining % 2) == 0

    println(
        """Сегодня делаем упражнения-
    |Упражнения для рук:$isEven
    |Упражнения для пресса:$isEven
    |
    |Упражнения для ног:$isNotEven
    |Упражнения для спины:$isNotEven
""".trimMargin()
    )
}