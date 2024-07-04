package Lesson_2

import kotlin.time.times

fun main(){
    val CrystalOre = 7
    val IronOre = 11
    val Buff = 20
    val CystalBuff = CrystalOre * Buff / 100
    val OreBuff = IronOre * Buff / 100

    println("""Увеличение добычи Кристаллов на $CystalBuff
        |Увеличение добычи Железа на $OreBuff""".trimMargin())

}