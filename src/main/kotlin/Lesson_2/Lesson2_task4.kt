package Lesson_2

fun main(){
    val allPercent = 100
    val crystalOre = 7
    val ironOre = 11
    val buff = 20
    val cystalBuff = crystalOre * buff / allPercent
    val oreBuff = ironOre * buff / allPercent

    println("""Увеличение добычи Кристаллов на $cystalBuff
        |Увеличение добычи Железа на $oreBuff""".trimMargin())

}