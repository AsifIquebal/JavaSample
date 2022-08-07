package com.company.commonlyasked;

import org.testng.annotations.Test;

public class InterviewSet2_Bit {
    @Test
    public void perfectNumber() {
        // A Perfect Number is sum of its positive divisors, excluding the number itself. The First Perfect number is 6,
        // For example 6 is a perfect number as 1,2 and3 are its divisors and the sum of divisors= ( 1 + 2 + 3)  = 6.
        // 28 also
        int n = 6;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
                System.out.println(i);
            }
        }
        if (sum == n) {
            System.out.println(n + " is a Perfect number...");
        } else {
            System.out.println("NOT a Perfect Number");
        }
    }

    @Test
    public void bitwiseXORTest() {
        int a = 5;
        int b = 6;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(a ^ b) + " : " + (a ^ b));
    }

    @Test
    public void swapUsingXOR() {
        int a = 5, b = 6;
        System.out.println("a: " + a + ", b:" + b);
        // A quick way to swap a and b
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("a: " + a + ", b:" + b);
    }

    @Test
    public void oddEvenUsingAND() {
        int n = 67;
        System.out.println(Integer.toBinaryString(n));
        if ((n & 1) == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
        //System.out.print(isEven(n) == true ? "Even" : "Odd");
    }

    //XOR Operation on a number by 1 increment the value of the number by 1 if the number is even otherwise
    // it decrements the value of the number by 1 if the value is odd
    @Test
    public void oddEvenUsingXOR() {
        int n = 67;
        // n^1 is n+1, then even, else odd
        if ((n ^ 1) == n + 1) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
        //System.out.print(isEven(n) == true ? "Even" : "Odd");
    }

}
