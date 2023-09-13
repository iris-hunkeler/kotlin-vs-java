package demo.demo_09_interoperability


import model.Person
import org.junit.jupiter.api.assertThrows
import kotlin.test.Test

internal class InteroperabilityDemoTestSolved {

    @Test
    fun test() {
        // TODO: create a new Person and change their name
        val p = Person("Michael Miller", "Lausanne")
        p.name = "Michael Allen"
        println(p)

        // TODO: set address to null and try to print its length
        p.address = null
        assertThrows<NullPointerException> {
            p.address.length
        }

    }
}