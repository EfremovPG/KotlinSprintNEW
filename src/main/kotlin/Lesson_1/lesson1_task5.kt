package Lesson_1

fun main() {

    val timeInSeconds = 6480
    val timeInMimute = timeInSeconds / 60
    val hour = timeInMimute / 60
    val minute = timeInMimute % 60
    val second = timeInSeconds % 60

    println(String.format("Время в космосе: %02d:%02d:%02d", hour, minute, second))

}
