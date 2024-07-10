package Lesson_5

fun main() {

    println("Попробуйте угадать два числа ")
    println("Введите первое число:")

    val checkWinFirst = readln().toInt()

    println("Введите второе число:")

    val checkWinSecond = readln().toInt()

    if (checkWinFirst == WIN_NUMBER_FIRST && checkWinSecond == WIN_NUMBER_SECOND ||
        checkWinFirst == WIN_NUMBER_SECOND && checkWinSecond == WIN_NUMBER_FIRST
    ) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (checkWinFirst == WIN_NUMBER_FIRST || checkWinSecond == WIN_NUMBER_SECOND ||
        checkWinFirst == WIN_NUMBER_SECOND || checkWinSecond == WIN_NUMBER_FIRST
    ) {

        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }
    println("Загаданные числа: 23 и 41")

}

const val WIN_NUMBER_FIRST = 23
const val WIN_NUMBER_SECOND = 41