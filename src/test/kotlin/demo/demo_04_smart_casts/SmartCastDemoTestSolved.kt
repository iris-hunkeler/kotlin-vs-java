package demo.demo_04_smart_casts

import model.employment.Employee
import kotlin.test.Test

internal class SmartCastDemoTestSolved {

    @Test
    fun test() {
        printValue("Test")

        val anEmployee = Employee("Iris")
        printValue(anEmployee)
    }

    private fun printValue(x: Any) {
        // TODO: check if x is a String and then print its length
        if (x is String) {
            println(x.length)
        }

        // TODO: check if x is a Person and then print a nice summary with String templates
        if (x is Employee) {
            println(x.name)
        }
    }
}