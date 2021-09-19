package com.company.commonlyasked;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

public class Numbers {


    @Test
    public void print1to100WithoutLoop_recursion() {
        printNos(1, 100);
    }

    public static void printNos(int initial, int last) {
        if (initial <= last) {
            System.out.print(initial + " ");
            printNos(initial + 1, last);
        }
    }

    @Test
    public void print1to100WithoutLoop_ArrayFillMethod() {
        Object[] num = new Object[100];
        Arrays.fill(num, new Object() {
            int count = 0;

            @Override
            public String toString() {
                return Integer.toString(++count);
            }
        });
        System.out.println(Arrays.toString(num));
    }

    @Test
    public void print1to100WithStreams() {
        IntStream.range(1, 101).forEach(System.out::println);
    }

    @Test
    public void conversion() {
        Integer.parseInt("12");
        Integer.valueOf("25");

    }

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


    // A Perfect Number is sum of its positive divisors, excluding the number itself. The First Perfect number is 6,
    // For example 6 is a perfect number as 1,2 and3 are its divisors and the sum of divisors= ( 1 + 2 + 3)  = 6.
    // 28 also
    @Test
    public void isTheGivenAPerfectNumber() {
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
    public void sumOfDigits() {
        int num = 786, sum = 0;
        while (num > 0) {
            int remainder = num % 10;
            sum = sum + remainder;
            int quotient = num / 10;
            num = quotient;
        }
        System.out.println(sum);

    }

    @Test
    public void palindrome() {

    }

    public int reverseANum(int number) {
        int revNum = 0;
        while (number > 0) {
            revNum = (revNum * 10) + number % 10;
            number = number / 10;
        }
        System.out.println(revNum);
        return revNum;
    }

    @Test
    public void armstrongNumber() {
        // Armstrong Number in Java: A positive number is called armstrong number if it is equal to the sum of cubes of
        // its digits for example 0, 1, 153, 370, 371, 407 etc.
        int num = 153;
        int cubeSum = 0, temp;
        temp = num;
        while (num > 0) {
            int remainder = num % 10;
            int quotient = num / 10;
            System.out.println(remainder);
            num = quotient;
            cubeSum = cubeSum + (remainder * remainder * remainder);
        }
        if (temp == cubeSum) {
            System.out.println("Number " + temp + " is Armstrong");
        } else {
            System.out.println("Number " + temp + " is NOT Armstrong");
        }
    }

    /*
    * A number which leaves 1 as a result after a sequence of steps and in each step number is replaced
    * by the sum of squares of its digit.
    * For example, if we check whether 23 is a Happy Number, then sequence of steps are
    Step 1: 2×2+3×3 = 4+9 = 13 // Sum of square of each digit
    Step 2: 1×1+3×3 = 1+9 = 10
    Step 3: 1×1+0x0 = 1 (A Happy Number)
    *A number will not be a Happy Number when it makes a loop in its sequence that is it touches a number in
    * sequence which already been touched. So to check whether a number is happy or not, we can keep a set,
    * if the same number occurs again we flag result as not happy.
    *
    * */

    @Test
    public void abc() {
        int num = 23;
        int sum;
        Set<Integer> numbers = new HashSet<>();
        while (numbers.add(num)) {
            sum = 0;
            while (num > 0) {
                sum = sum + (num % 10) * (num % 10);
                num = num / 10;
            }
            num = sum;
            System.out.println("Num at end of outer loop: " + num);
        }
        System.out.println((num == 1) ? "Happy Number" : "Not a Happy Number");
    }

    public static void main(String[] args) {
        System.out.println("Enter string or number");
        Scanner scanner = new Scanner(System.in);
        String i = scanner.next();
        boolean b = true;
        try {
            Integer.parseInt(i);
        } catch (NumberFormatException ex) {
            b = false;
        }
        if (b) {
            System.out.println("Input is number");
        } else {
            System.out.println("Input is NOT a number");
        }
    }

}
