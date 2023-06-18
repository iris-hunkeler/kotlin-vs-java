package demo.demo_04_smart_casts

import kotlin.test.Test

internal class SmartCastDemoTest {

    @Test
    fun test() {
        printValue("Test")

        val aPerson = Person("Iris")
        printValue(aPerson)
    }

    private fun printValue(x: Any) {
        // TODO: check if x is a String and then print its length

        // TODO: check if x is a Person and then print a nice summary with String templates

    }
}