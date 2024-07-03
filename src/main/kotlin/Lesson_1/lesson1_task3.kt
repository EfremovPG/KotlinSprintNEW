package Lesson_1

fun main() {
    val Year = 1961
    var Hour = 9 //вопрос как прописать с нулём перед значением,чтоб правильно отображалось
    var Minute = 7 // или указывать как String, но мне кажется это не правильно
println("""$Year
    |$Hour
    |$Minute
""".trimMargin())
    Hour = 10
    Minute =55
    println("$Hour:$Minute")

}