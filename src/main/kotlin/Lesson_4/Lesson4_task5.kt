package Lesson_4

fun main() {

    println("Введите наличие повреждений: True/False")
    val readDamage = readln()

    println("Введите колличество человек:")
    val readCrew = readln().toInt()

    println("Введите благоприятны ли метеоусловия True/False")
    val readWeather = readln()

    println("Введите колличество запасов:")
    val readStocks = readln().toInt()

    val goAway: Boolean
    goAway = (readDamage == DAMAGE) &&
            (readCrew >= CREW_MIN) &&
            (readCrew <= CREW_MAX) &&
            (readWeather == WEATHER) &&
            (readStocks > STOCKS) ||
            (readDamage != DAMAGE) &&
            (readCrew == CREW_MAX) &&
            (readWeather == WEATHER) &&
            (readStocks >= STOCKS)

    println("Рассчётная возможность отправления: $goAway")

}

const val DAMAGE = "false"
const val CREW_MIN = 50
const val CREW_MAX = 70
const val WEATHER = "true"
const val STOCKS = 50