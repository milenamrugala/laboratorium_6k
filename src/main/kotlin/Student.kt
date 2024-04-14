class Student(
    private var firstName: String,
    private var lastName: String,
    private var id: String,
    private var grade: Double
) {

    override fun toString(): String {
        return "imię: $firstName, nazwisko: $lastName, numer indeksu: $id, ocena: $grade"
    }

    fun description(): String {
        return when (grade) {
            2.0 -> "niedostateczny"
            3.0 -> "dostateczny"
            3.5 -> "dostateczny plus"
            4.0 -> "dobry"
            4.5 -> "dobry plus"
            5.0 -> "bardzo dobry"
            else -> "error"
        }
    }

    fun getGrade(): Double {
        return grade
    }

    fun getFirstName(): String {
        return firstName
    }

    fun getLastName(): String {
        return lastName
    }

    fun getId(): String {
        return id
    }

    fun setGrade(grade: Double) {
        this.grade = grade
    }

    fun setFirstName(firstName: String) {
        this.firstName = firstName
    }

    fun setLastName(lastName: String) {
        this.lastName = lastName

    }
}