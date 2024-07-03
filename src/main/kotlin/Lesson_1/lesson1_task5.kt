package Lesson_1

fun main() {

    var TimeInSeconds = 6480

    var Hour: Float = (TimeInSeconds / 3600f).toFloat()
    var Mimute = TimeInSeconds % 3600
println("Время в космосе $Hour : $Mimute ")
// нужны пояснения как работать со временем и как указывать с 0 (03)
}
