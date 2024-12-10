package org.example;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {

    private Calculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        assertEquals(8,calculator.add(3,5));
        assertNotEquals(8, calculator.add(3,4));
    }

    @Test
    void subtract() {
        assertEquals(-8, calculator.subtract(10,18));
        assertNotEquals(10, calculator.subtract(3,4));

    }
}