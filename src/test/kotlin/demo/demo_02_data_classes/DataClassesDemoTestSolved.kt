package demo.demo_02_data_classes

import org.junit.jupiter.api.Test


internal class DataClassesDemoTestSolved {

    @Test
    fun test_1() {
        // TODO: create a class "Course" with title, credits and if it is graded or not

        // TODO: create different courses, using defaults and named parameters
        /*
        val math = Course("Mathematics 2")

        math.credits = 12
        math.title = "test" --> does not work because title is not editable

        val communication = Course("Communication", graded = false)
         */
    }
}

/*
data class Course(
    val title: String,
    val credits: Int = 6,
    val graded: Boolean = true
)
 */