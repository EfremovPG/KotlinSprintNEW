package Lesson_2

fun main() {
    val secInMinute = 60
    val trainDepartureH = 9
    val trainDepartureM = 39
    val duration = 457
    val arrivalH = (trainDepartureH * secInMinute + trainDepartureM + duration) / secInMinute
    val arrivalM = (trainDepartureH * secInMinute + trainDepartureM + duration) % secInMinute

    println(
        String.format(
            "Отправление поезда  в:  %02d:%02d", trainDepartureH, trainDepartureM))
    println(
        String.format(
            "Прибытие поезда в  %02d:%02d", arrivalH, arrivalM

        )
    )

}