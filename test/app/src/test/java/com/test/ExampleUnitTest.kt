package com.test

import org.junit.Test
import org.junit.Assert.*

class UnitTest {
    @Test
    fun addition_isCorrect() {
        val result = 2 + 2
        assertEquals(4, result)
    }
    @Test
    fun isEven_correctlyIdentifiesEvenNumbers() {
        assertTrue(NumberUtils.isEven(2))
        assertFalse(NumberUtils.isEven(3))
    }
    @Test
    fun reverseString_worksCorrectly() {
        val result = StringUtils.reverse("hello")
        assertEquals("olleh", result)
    }
    @Test
    fun validateAge_throwsExceptionWhenNegative() {
        assertThrows(IllegalArgumentException::class.java) {
            Validator.validateAge(-5)
        }
    }
    @Test
    fun sortArray_sortsCorrectly() {
        val result = SortUtils.sort(intArrayOf(3, 1, 2))
        assertArrayEquals(intArrayOf(1, 2, 3), result)
    }
}

object NumberUtils {
    fun isEven(number: Int) = number % 2 == 0
}
object StringUtils {
    fun reverse(str: String): String = str.reversed()
}
object Validator {
    fun validateAge(age: Int) {
        require(age >= 0) { "Age cannot be negative" }
    }
}
object SortUtils {
    fun sort(arr: IntArray) = arr.sortedArray()
}