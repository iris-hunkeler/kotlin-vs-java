package demo.demo_05_functional_programming

import model.university.Student
import java.time.LocalDate
import kotlin.test.Test
import kotlin.test.assertEquals

internal class FunctionalProgrammingDemoTestSolved {

    @Test
    fun test() {
        val students = listOf(
            Student("Cora", LocalDate.parse("2013-12-10"), listOf(86, 89, 70, 85, 76)),
            Student("Alina", LocalDate.parse("2011-08-13"), listOf(26, 33, 45, 56, 54)),
            Student("Liam", LocalDate.parse("2012-05-30"), listOf(56, 68, 95, 75, 45)),
            Student("Michael", LocalDate.parse("2013-02-05"), listOf(53, 68, 85, 73, 55)),
        )
        print(students.map { "${it.name}: ${it.averageGrade}"})

        // filter out students with above 50 average grade, get highest 2 and sort by name
        val topStudents = students.filter { it.averageGrade > 50 }
            .sortedByDescending { it.averageGrade }
            .take(2)
            .sortedWith(compareBy { it.name })

        assertEquals("Cora", topStudents[0].name)
        assertEquals("Liam", topStudents[1].name)
    }
}