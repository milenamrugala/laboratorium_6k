import kotlin.math.pow

class Group {
    private val students = mutableMapOf<String, Student>()

    fun add(student: Student) {
        if (students.containsKey(student.getId())) {
            throw IllegalArgumentException("Student ${student.getId()} already exists, cannot add a new student.")
        }
        students[student.getId()] = student
    }

    fun getStudents(): Collection<Student> {
        return students.values
    }

    fun statistics(): Stats {
        val grades = students.values.map { it.getGrade().grade }
        val min = grades.minOrNull() ?: 0.0
        val max = grades.maxOrNull() ?: 0.0
        val avg = grades.average()
        val stdDev = kotlin.math.sqrt(grades.map { (it - avg).pow(2.0) }.average())
        return Stats(min, max, avg, stdDev)
    }

}