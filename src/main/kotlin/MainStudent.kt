fun main() {

    val group = Group()
    val first = Student("Milena","Mrugała","51251", Grades.DB_PLUS)
    val second = Student("Monika","Mrugała","31431", Grades.DST)
    val third = Student("Adam","Mrugała","68368", Grades.BDB)
    val fourth = Student("Henryk", "Fik","12512", Grades.DB_PLUS)

    group.add(first)
    group.add(second)
    group.add(third)
    group.add(fourth)

    for (student in group.getStudents()) {
        println(student)
    }

    println()

    val (min, max, avg, stdDev) = group.statistics()
    println("Najmniejsza ocena: $min")
    println("Największa ocena: $max")
    println("Średnia ocen: $avg")
    println("Odchylenie standardowe: $stdDev")
}