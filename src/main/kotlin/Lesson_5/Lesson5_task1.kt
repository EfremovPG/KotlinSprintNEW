package Lesson_5

fun main() {
    val diceRange = 1..50
    val termOne = diceRange.random()
    val termTwo = diceRange.random()
    val check = termOne + termTwo

    println(
        """Введите правильный ответ :
        |$termOne+$termTwo=""".trimMargin()
    )
    var checkOut = readln().toInt()
    if (check == checkOut) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен")
    }

}