package com.example.hellorecycler2

import com.example.source.DataRepository
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun array100test() {
        val array100: List<String> = DataRepository.getList100()
        assertEquals(array100.size, 100)
    }

    @Test
    fun array100test2() {
        val array100: List<String> = DataRepository.getList100()
        assertEquals(array100.size, 99)
    }
}