package com.company.commonlyasked;

import org.testng.annotations.Test;

public class Factorial {
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    @Test
    public void usingRecursion() {
        int fact = 1;
        int number = 25;//It is the number to calculate factorial
        fact = factorial(number);
        System.out.println("Factorial of " + number + " is: " + fact);
    }

    @Test
    public void test_findOutTrailingNumberOfZeros() {
        int res = 0;
        int n = 11;//the number for the factorial result needs to be checked for trailing zeros
        if (n < 5) {
            System.out.println("No Trailing Zeros!");
        } else {
            for (int i = 5; i <= n; i = i * 5) {
                res = res + n / i;
            }
            System.out.println(res);
        }

    }
}
