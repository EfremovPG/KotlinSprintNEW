package Lesson_3

fun main() {

    val turn = "D2-D4;0"
    val data = turn.split("-", ";")
    val from = data[0]
    val to = data[1]
    val turnNumber = data[2]

    println(
        """Ход № $turnNumber,
        |Переместили фигуру с клетки $from на клетку $to
    """.trimMargin()
    )
}

