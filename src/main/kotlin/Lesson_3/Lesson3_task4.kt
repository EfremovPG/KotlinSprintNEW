package Lesson_3

fun main() {

    var from = "E2"
    var to = "E4"
    var turn = 1

    println("Ход $turn: $from:$to")

    from = "D2"
    to = "D3"
    turn += turn

    println("Ход $turn: $from:$to")

}