package demo.demo_03_extension_functions

import model.university.Student
import java.time.LocalDate
import kotlin.test.Test
import kotlin.test.assertTrue

internal class ExtensionFunctionDemoTestSolved {

    @Test
    fun test() {
        val student = Student("Lisa", LocalDate.parse("2012-05-09"))
        student.grades.add(95)
        student.grades.add(86)
        student.grades.add(87)

        // TODO: check if student is passing all courses
        assertTrue(student.isPassingAllCourses())
    }
}

// TODO write extension function for Student: check if they pass all courses (pass = "grade is at least 60")
private fun Student.isPassingAllCourses(): Boolean {
    return this.grades.all { it >= 60 }
}