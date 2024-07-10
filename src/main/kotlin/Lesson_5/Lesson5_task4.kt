package Lesson_5

fun main() {

    val trueUsername = "Zaphod"
    val truePassword = "PanGalactic"
    println(
        """Внимание, пассажир. Моя обязанность, как обычно, незавидная,
        | - приветствовать вас на борту корабля "Heart of Gold". [вздыхает...]
        |  Что ж, введи, пожалуйста, свое имя пользователя:, """.trimMargin()
    )
    val checkUsername = readln()
    if (trueUsername == checkUsername) {
        println(
            """Пользователь идентифицирован.
            |Введите пароль:
        """.trimMargin()
        )
    }
    val checkPassword = readln()
    if (truePassword == checkPassword) {

        println(
            """Ваши данные проверены, и о, чудо, они верны... 
            |Пользователь "Zaphod", вам разрешено входить на борт корабля
            |"Heart of Gold". Хотя мне всё равно... Ну вперед, войдите... 
            |Если вам так уж надо, в конце концов..""".trimMargin()
        )
    } else {
        println("Пожалуйста пройдите регистрацию!")
    }
}