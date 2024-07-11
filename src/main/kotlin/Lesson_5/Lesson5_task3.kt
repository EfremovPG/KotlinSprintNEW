package Lesson_5

fun main() {

    val winNumberFirst = diceRange.random()
    val winNumberSecond = diceRange.random()
    println("Попробуйте угадать два числа от 0 до 42 ")

    println("Введите первое число:")

    val checkWinFirst = readln().toInt()

    println("Введите второе число:")

    val checkWinSecond = readln().toInt()

    if (checkWinFirst == winNumberFirst && checkWinSecond == winNumberSecond ||
        checkWinFirst == winNumberSecond && checkWinSecond == winNumberFirst
    ) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (checkWinFirst == winNumberFirst || checkWinSecond == winNumberSecond ||
        checkWinFirst == winNumberSecond || checkWinSecond == winNumberFirst
    ) {

        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }
    println("Загаданные числа: $winNumberFirst и $winNumberSecond")

}
val diceRange = 0..42