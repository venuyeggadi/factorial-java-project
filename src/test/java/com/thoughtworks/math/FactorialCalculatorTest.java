package com.thoughtworks.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialCalculatorTest {
    @Test
    void factorialOfZeroIsOne() {
        int factorial = FactorialCalculator.factorial(0);
        assertEquals(1, factorial);
    }

    @Test
    void factorialOfOneIsOne() {
        int factorial = FactorialCalculator.factorial(1);
        assertEquals(1, factorial);
    }

    @Test
    void factorialOfThreeIsSix() {
        int factorial = FactorialCalculator.factorial(3);
        assertEquals(6, factorial);
    }

    @Test
    void factorialOfNegativeNumberThrowsException() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            int factorial = FactorialCalculator.factorial(-4);
        });

        assertEquals("Factorial of negative numbers is not defined", exception.getMessage());
    }
}
