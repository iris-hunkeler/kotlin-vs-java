package demo.demo_04_smart_casts

import kotlin.test.Test

internal class SmartCastDemoTestSolved {

    @Test
    fun test() {
        printValue("Test")

        val aPerson = Person("Iris")
        printValue(aPerson)
    }

    private fun printValue(x: Any) {
        // TODO: check if x is a String and then print its length
        if (x is String) {
            println(x.length)
        }

        // TODO: check if x is a Person and then print a nice summary with String templates
        if (x is Person) {
            println(x.name)
        }
    }
}