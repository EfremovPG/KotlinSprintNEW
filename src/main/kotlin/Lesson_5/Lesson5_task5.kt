fun main() {

    val winNumberFirst = DICE_RANGE.random()
    val winNumberSecond = DICE_RANGE.random()
    val winNumberThird = DICE_RANGE.random()
    //println("Загаданные числа: $winNumberFirst , $winNumberSecond и $winNumberThird") для проверки
    println("Попробуйте угадать три числа от 0 до 42 ")
    println("Введите первое число:")

    val winCombinaton = setOf(winNumberFirst, winNumberSecond, winNumberThird)
    val checkWinFirst = readln().toInt()

    println("Введите второе число:")

    val checkWinSecond = readln().toInt()

    println("Введите третье число:")

    val checkWinThird = readln().toInt()
    val userCombination = setOf(checkWinFirst, checkWinSecond, checkWinThird)
    val result = winCombinaton.intersect(userCombination)
    val winner = result.size

    if (winner == 3) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (winner == 2) {
        println("Поздравляем! Вы угадали два числа и получаете крупный приз!")
    } else if (winner == 1) {
        println("Поздравляем! Вы угадали одно число и выплачивается утешительный приз.")
    } else {
        println("Вы ничего не угадали.")
    }
    println("Загаданные числа: $winNumberFirst , $winNumberSecond и $winNumberThird")
}

val DICE_RANGE = 0..42
