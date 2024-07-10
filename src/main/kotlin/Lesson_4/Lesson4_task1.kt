package Lesson_4

fun main() {

    val reservToday = 13
    val reservTomorrow = 9

    val availabilityToday = reservToday < ALL_TABLES
    val availabilityTomorrow = reservTomorrow < ALL_TABLES

    println("Доступность столиков на сегодня:$availabilityToday \nДоступность столиков на завтра:$availabilityTomorrow")
}

const val ALL_TABLES = 13