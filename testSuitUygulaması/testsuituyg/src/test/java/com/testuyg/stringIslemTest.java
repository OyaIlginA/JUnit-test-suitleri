package com.testuyg;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;

import static org.junit.jupiter.api.Assertions.*;

public class stringIslemTest {
    private final stringIslem stringUtils = new stringIslem();

    @Test
    @Tag("hızlı")
    void testConcatenate() {
        assertEquals("HelloWorld", stringUtils.concatenate("Hello", "World"));
    }

    @Test
    @Tag("yavas")
    void testGetLength() {
        assertEquals(5, stringUtils.getLength("Hello"));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", stringUtils.toUpperCase("hello"));
    }
}
