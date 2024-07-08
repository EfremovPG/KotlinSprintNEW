package Lesson_1

fun main() {
    val secInMinute = 60
    val timeInSeconds = 6480
    val timeInMimute = timeInSeconds / secInMinute
    val hour = timeInMimute / secInMinute
    val minute = timeInMimute % secInMinute
    val second = timeInSeconds % secInMinute

    println(String.format("Время в космосе: %02d:%02d:%02d", hour, minute, second))

}
