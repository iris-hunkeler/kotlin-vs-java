package demo.demo_05_functional_programming

import model.university.Student
import java.time.LocalDate
import kotlin.test.Test

internal class FunctionalProgrammingDemoTest {

    @Test
    fun test() {
        val students = listOf(
            Student("Lisa", LocalDate.parse("2012-05-09"), mutableListOf(95, 86, 87)),
            Student("Alina", LocalDate.parse("2011-08-13"), mutableListOf(26, 33, 45, 56, 54)),
            Student("Anna", LocalDate.parse("2012-05-30"), mutableListOf(56, 68, 95, 75, 45)),
            Student("Michael", LocalDate.parse("2013-02-05"), mutableListOf(53, 68, 85, 73, 55)),
        )
        println(students.map { "${it.name}: ${it.averageGrade}" })

        // TODO: filter out students with above 60 average grade, get highest 2 and sort by name
        val topStudents = emptyList<Student>()


        println(topStudents.map { "${it.name}: ${it.averageGrade}" })

        //assertEquals("Anna", topStudents[0].name)
        //assertEquals("Lisa", topStudents[1].name)
    }
}