package com.github.bucherfa.accessibilitylinter.annotators

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class HandlebarsAnnotatorTest {
    @Test
    fun prepareInputFilterHandlebarsSyntax() {
        val actual = HandlebarsAnnotator().prepareInput("<div>Hello {{user}}!</div>")
        assertEquals("<div>Hello         !</div>", actual)
    }
}
