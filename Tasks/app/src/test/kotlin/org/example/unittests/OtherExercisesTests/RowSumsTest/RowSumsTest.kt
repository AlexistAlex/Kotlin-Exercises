package org.example.unittests.OtherExercisesTests.RowSumsTest

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import rowSums

class RowSumTest {
    @Test
    fun rowSumsTests() {
        assertArrayEquals(intArrayOf(6, 15), rowSums(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6))), "For input [[1, 2, 3], [4, 5, 6]]")
        assertArrayEquals(intArrayOf(0, 0, 5), rowSums(arrayOf(intArrayOf(-1, -2, 3), intArrayOf(0, 0, 0), intArrayOf(10, -10, 5))), "For input [[-1, -2, 3], [0, 0, 0], [10, -10, 5]]")
        assertArrayEquals(intArrayOf(), rowSums(emptyArray<IntArray>()), "For input []")
    }
}