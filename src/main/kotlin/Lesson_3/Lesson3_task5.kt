package Lesson_3

fun main() {

    val turn = "D2-D4;0"
    val from = "${turn[0]}${turn[1]}"
    val to = "${turn[3]}${turn[4]}"
    val turnNumber = "${turn[6]}"

    println(
        """Ход № $turnNumber,
        |Переместили фигуру с клетки $from на клетку $to
    """.trimMargin()
    )

}

