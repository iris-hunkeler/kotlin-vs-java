package demo.demo_01_null_safety

import kotlin.random.Random
import kotlin.test.Test

internal class NullSafetyDemoTestSolved {

    @Test
    fun test_1() {
        var nullableString: String?
        var nonNullableString: String

        // TODO: assign values (null and not null) to nullable String and non-nullable String
        nullableString = null //success
        nullableString = "some value" //success

        //nonNullableString = null //compile-time error
        nonNullableString = "some value" //success
    }


    @Test
    fun test_2() {
        // TODO: if a random condition is true, create and assign a new person
        val person: Person? = if(Random.nextBoolean()) {
            Person("Iris")
        } else {
            null
        }

        // TODO: print that person's employer's name
        println(person?.employer?.name) // null checks required

        // TODO: create a non-nullable person
        val anotherPerson =  Person("Anna")

        // TODO: print that person's employer's name
        println(anotherPerson.employer.name)
    }
}


