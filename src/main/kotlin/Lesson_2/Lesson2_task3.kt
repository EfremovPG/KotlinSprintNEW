package Lesson_2

fun main(){
    val TrainDepartureH = 9
    val TrainDepartureM = 39
    val Duration = 457
    val ArrivalH:Int = (TrainDepartureH * 60 + TrainDepartureM + Duration) / 60
    val ArrivalM:Int = (TrainDepartureH * 60 + TrainDepartureM + Duration) % 60

    println("""Отправление поезда  в $TrainDepartureH:$TrainDepartureM
        |Прибытие поезда в $ArrivalH:$ArrivalM
    """.trimMargin())

}