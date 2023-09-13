package demo.demo_04_smart_casts

import model.university.Student
import java.time.LocalDate
import kotlin.test.Test

internal class SmartCastDemoTest {

    @Test
    fun test() {
        printValue("Test")

        val student = Student("Lisa", LocalDate.parse("2012-05-09"), mutableListOf(95, 86, 87))
        printValue(student)
    }

    private fun printValue(x: Any) {
        // TODO: check if x is a String and then print its length

        // TODO: check if x is a Student and then print a nice summary with String templates

    }
}