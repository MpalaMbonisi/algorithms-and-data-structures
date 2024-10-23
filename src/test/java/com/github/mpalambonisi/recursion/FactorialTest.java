package com.github.mpalambonisi.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void testFactorialOfFive() {
        assertEquals(120,Factorial.factorial(5));
    }

    @Test
    void testFactorialOfTen() {
        assertEquals(3_628_800,Factorial.factorial(10));
    }
}