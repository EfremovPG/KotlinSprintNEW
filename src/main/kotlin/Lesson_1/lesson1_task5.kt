package Lesson_1

fun main() {

    val timeInSeconds = 6480
    val timeInMimute = timeInSeconds / 60
    val hour = timeInMimute / 60
    val minute = timeInMimute % 60

    println("Время в космосе $hour:$minute")

}
