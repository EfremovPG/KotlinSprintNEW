package Lesson_2

fun main(){
    val RegularWorker = 50
    val PayRegularWorker = 30000
    val Student = 30
    val PayStudent = 20000

    val SalaryRegular = RegularWorker * PayRegularWorker
    val SalaryStudent = Student * PayStudent
    val SalaryAll = SalaryRegular + SalaryStudent
    val AverageSalaryAll = SalaryAll / (RegularWorker + Student)
    println("""Расходы на выплату зарплаты постоянных сотрудников $SalaryRegular руб.
        |Общие расходы по ЗП после прихода стажеров $SalaryAll руб.зарплата
        |Средняя ЗП одного сотрудника после устройства стажеров $AverageSalaryAll руб.
    """.trimMargin())
}