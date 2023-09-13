package model.university

import java.time.LocalDate

data class Student (
    val name: String,
    val birthdate: LocalDate,
    // each grade is a number between [0 and 100]
    var grades: MutableList<Int> = mutableListOf(),
) {
    val averageGrade: Int
        get() = this.grades.average().toInt()
}

