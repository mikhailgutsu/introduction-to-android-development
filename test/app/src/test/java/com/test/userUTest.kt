package com.test

import org.junit.Test
import org.junit.Assert.*

class UTest{

    @Test
    fun testArithmeticOperators() {
        val a = 10
        val b = 3

        assertEquals(13, a + b)
        assertEquals(7, a - b)
        assertEquals(30, a * b)
        assertEquals(3, a / b)
        assertEquals(1, a % b)
    }

    @Test
    fun testComparisonOperators() {
        val a = 5
        val b = 10

        assertTrue(a < b)
        assertFalse(a > b)
        assertTrue(a <= b)
        assertFalse(a >= b)
        assertFalse(a == b)
        assertTrue(a != b)
    }

    @Test
    fun testLogicalOperators() {
        val x = true
        val y = false

        assertTrue(x && x)
        assertFalse(x && y)
        assertTrue(x || y)
        assertFalse(y || y)
        assertFalse(!x)
    }

    @Test
    fun testAssignmentOperators() {
        var num = 10

        num += 5
        assertEquals(15, num)

        num -= 3
        assertEquals(12, num)

        num *= 2
        assertEquals(24, num)

        num /= 4
        assertEquals(6, num)

        num %= 5
        assertEquals(1, num)
    }

    @Test
    fun testBitwiseOperators() {
        val x = 0b1010 // 10 in binary
        val y = 0b1100 // 12 in binary

        assertEquals(0b1000, x and y) // 8
        assertEquals(0b1110, x or y) // 14
        assertEquals(0b0110, x xor y) // 6

        // Inverted 10 (mask with 0b1111 to limit to 4 bits)
        assertEquals(0b0101, x.inv() and 0b1111)

        assertEquals(0b10100, x shl 1) // Shift left (20)
        assertEquals(0b0101, x shr 1) // Shift right (5)
    }

    @Test
    fun testIncrementDecrementOperators() {
        var num = 5

        assertEquals(6, ++num)
        assertEquals(6, num)
        assertEquals(5, --num)
    }

    @Test
    fun testSizeOfDataTypes() {
        assertEquals(8, Byte.SIZE_BITS)
        assertEquals(16, Short.SIZE_BITS)
        assertEquals(32, Int.SIZE_BITS)
        assertEquals(64, Long.SIZE_BITS)
        assertEquals(32, Float.SIZE_BITS)
        assertEquals(64, Double.SIZE_BITS)
    }
}