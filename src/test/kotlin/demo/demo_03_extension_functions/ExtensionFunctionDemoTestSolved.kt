package demo.demo_03_extension_functions

import model.NETLIGHT
import kotlin.test.Test
import kotlin.test.assertTrue

internal class ExtensionFunctionDemoTestSolved {

    @Test
    fun test() {
        val person = Person("Iris Hunkeler")
        //person.profession
        assertTrue(person.worksForAwesomeCompany())
    }
}

// TODO write extension function for person
private fun Person.worksForAwesomeCompany(): Boolean {
    return this.employer == NETLIGHT
}