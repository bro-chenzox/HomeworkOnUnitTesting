package com.palchak.sergey.homeworkonunittesting

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class HomeworkTest {

    // Use cases for Fibonacci function
    @Test
    fun `n = 0 returns 0`() {
        val result = Homework.fib(0)
        assertThat(result).isEqualTo(0)
    }

    @Test
    fun `n = 1 returns 1`() {
        val result = Homework.fib(1)
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `n = 10 returns 55`() {
        val result = Homework.fib(10)
        assertThat(result).isEqualTo(55)
    }

    // Use cases for checking braces function
    @Test
    fun `correct braces returns true`() {
        val result = Homework.checkBraces(
                "(((text)))"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `excess brace returns false`() {
        val result = Homework.checkBraces(
            "(text))"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `braces being turned around returns false`() {
        val result = Homework.checkBraces(
                ")text("
        )
        assertThat(result).isFalse()
    }
}