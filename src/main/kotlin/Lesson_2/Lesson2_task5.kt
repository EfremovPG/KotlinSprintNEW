package Lesson_2

import kotlin.math.pow

fun main() {
    val deposit = 70000
    val rate = 16.7
    val time = 20

    val result = deposit * (1 + rate / 100).pow(time)

    println("Размер вклада через $time лет:$result")
}
