package model.university

import java.time.LocalDate

data class Student (
    val name: String,
    val birthdate: LocalDate,
    // grade a number between 0 and 100
    val grades: List<Int>,
) {
    val averageGrade: Int
        get() = this.grades.average().toInt()
}

