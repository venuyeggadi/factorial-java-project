package com.thoughtworks.math;

public class FactorialCalculator {
    public static int factorial(int number) {
        if(number < 0)
            throw new ArithmeticException("Factorial of negative numbers is not defined");

        if(number < 2)
            return 1;

        int factorial = 1;
        for (int multiplier = 2; multiplier <= number; multiplier++) {
            factorial = factorial * multiplier;
        }

        return factorial;
    }
}
