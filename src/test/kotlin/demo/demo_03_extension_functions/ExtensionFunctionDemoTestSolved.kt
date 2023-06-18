package demo.demo_03_extension_functions

import model.employment.Employee
import model.employment.NETLIGHT
import kotlin.test.Test
import kotlin.test.assertTrue

internal class ExtensionFunctionDemoTestSolved {

    @Test
    fun test() {
        val employee = Employee("Iris Hunkeler")
        //person.profession
        assertTrue(employee.worksForAwesomeCompany())
    }
}

// TODO write extension function for person
private fun Employee.worksForAwesomeCompany(): Boolean {
    return this.employer == NETLIGHT
}