package demo.demo_01_null_safety

import model.university.Student
import java.time.LocalDate
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

        // TODO: print the length of both values (when one is null)
        println(nullableString?.length ?: 0)
        println(nonNullableString.length)
    }


    @Test
    fun test_2() {
        // TODO: if a random condition is true, create and assign a new student
        val student: Student? = if (Random.nextBoolean()) {
            Student("Lisa", LocalDate.parse("2012-05-09"))
        } else {
            null
        }

        // TODO: print that student's name
        println(student?.name) // null checks required

        // TODO: create a non-nullable student
        val anotherStudent = Student("Bart", LocalDate.parse("2014-02-23"))

        // TODO: print that student's name
        println(anotherStudent.name)
    }
}


