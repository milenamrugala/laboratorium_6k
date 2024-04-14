import java.lang.IllegalArgumentException

fun main() {
    // laboratorium_1, laboratorium_4
    val group = Group()

    val first = Student("Milena", "Mrugała", "51251", 7.0) // ok, nie wchodzi do avg
    val second = Student("Monika", "Mrugała", "45845", 4.0)
    val third = Student("Adam", "Mrugała", "67467", 3.0)
    val fourth = Student("Henryk", "Fik", "12312", 4.0)
    val fifth = Student("Maria", "Fik", "12312", 5.0) // ok, nie wchodzi do avg
    val sixth = Student("Katarzyna", "Starzyńska", "43534", 4.0)

    try {
        group.add(first)
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }

    group.add(second)
    group.add(third)
    group.add(fourth)
    group.add(sixth)

    try {
        group.add(fifth)
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }

    println("Average grade is ${group.avg()} of ${group.number()} students.")

    println()
    // laboratorium_5
    val seventh = Student("Nikodem", "Wyka", "30930", 5.0)
    val eight = Student("Janina", "Dołgań", "41941", 2.0)
    println("$seventh, opis: ${seventh.description()}")
    println("$eight, opis: ${eight.description()}")

}



