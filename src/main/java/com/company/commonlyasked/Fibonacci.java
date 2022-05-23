package com.company.commonlyasked;

import org.testng.annotations.Test;

import java.util.Arrays;

public class Fibonacci {
    @Test
    public void printFibonacci() {
        int i = 8; // generating upto 8th character
        int num1 = 0, num2 = 1, nextNum;
        System.out.print(num1 + " " + num2);
        for (int x = 2; x < i; x++) {
            nextNum = num1 + num2;
            System.out.print(" " + nextNum);
            num1 = num2;
            num2 = nextNum;
        }
    }

    @Test
    public void fibonacciUsingDP() {
        int n = 8;
        int[] num = new int[8];
        num[0] = 0;
        num[1] = 1;
        for (int i = 2; i < n; i++) {
            num[i] = num[i - 1] + num[i - 2];
        }
        Arrays.stream(num).forEach(x -> System.out.print(x + " "));
    }
}
