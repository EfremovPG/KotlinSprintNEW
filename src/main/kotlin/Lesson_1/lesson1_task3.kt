package Lesson_1

fun main() {
    val year = "1961"
    var hour = "09"
    var minute = "07"

    println(
        """$year
    |$hour
    |$minute
""".trimMargin()
    )

    hour = "10"
    minute = "55"

    println("$hour:$minute")

}