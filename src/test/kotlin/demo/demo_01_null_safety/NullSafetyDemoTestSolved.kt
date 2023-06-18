package demo.demo_01_null_safety

import model.employment.Employee
import kotlin.random.Random
import kotlin.test.Test

internal class NullSafetyDemoTestSolved {

    @Test
    fun test_1() {
        var nullableString: String?
        var nonNullableString: String

        // TODO: assign values (null and not null) to nullable String and non-nullable String
        nullableString = "some value" //success
        nullableString = null //success

        //nonNullableString = null //compile-time error
        nonNullableString = "some value" //success

        // TODO: print the length of both values (when one is null)
        println(nullableString?.length)
        println(nonNullableString.length)
    }


    @Test
    fun test_2() {
        // TODO: if a random condition is true, create and assign a new person
        val employee: Employee? = if(Random.nextBoolean()) {
            Employee("Iris")
        } else {
            null
        }

        // TODO: print that person's employer's name
        println(employee?.employer?.name) // null checks required

        // TODO: create a non-nullable person
        val anotherEmployee = Employee("Anna")

        // TODO: print that person's employer's name
        println(anotherEmployee.employer.name)
    }
}


