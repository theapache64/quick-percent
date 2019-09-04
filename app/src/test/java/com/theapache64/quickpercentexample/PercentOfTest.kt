package com.theapache64.quickpercentexample

import com.theapache64.quickpercent.isWhatPercentOf
import com.theapache64.quickpercent.percentOf
import org.junit.Assert.assertEquals
import org.junit.Test


class PercentOfTest {
    @Test
    fun test() {
        assertEquals(400f, 20.percentOf(2000))
        assertEquals(10f, 100.isWhatPercentOf(1000))
    }
}