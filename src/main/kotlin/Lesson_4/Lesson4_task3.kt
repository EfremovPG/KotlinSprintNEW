package Lesson_4

fun main() {

    val isSunny = true
    val isAwningOpen = true
    val airHumidityToday = 20
    val seasonToday = "winter"
    val favorableConditions = SUNNY == isSunny && AWING_OPEN == isAwningOpen &&
            AIR_HUMIDITY == airHumidityToday && SEASON != seasonToday

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}

const val SUNNY = true
const val AWING_OPEN = true
const val AIR_HUMIDITY = 20
const val SEASON = "winter"

