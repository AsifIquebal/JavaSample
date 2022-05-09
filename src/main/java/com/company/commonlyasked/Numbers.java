package com.company.commonlyasked;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

public class Numbers {

    @Test
    public void binaryTest() {
        System.out.println(Integer.toBinaryString(0));
        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(8));
        System.out.println("bitwise AND(&)[8&1]: " + (8 & 1));
        System.out.println("bitwise AND(&)[9&1]: " + (9 & 1));
        System.out.println(Integer.toBinaryString(2 << 33));
        System.out.println("================");
        int a = 17;
        int b = 16;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(a & b) + ": " + (a & b));
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
            //System.out.println(remainder);
            sum = sum + remainder;
            num = num / 10;
        }
        System.out.println(sum);
    }

    @Test
    public void palindrome() {
        System.out.println(1 % 10);
        System.out.println(1 / 10);
        System.out.println(reverseANum(122));
    }

    public int reverseANum(int number) {
        int revNum = 0;
        while (number > 0) {
            revNum = (revNum * 10) + number % 10;
            number = number / 10;
        }
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

    @Test
    public void secondLastDigit() {
        int i = 1843;
        System.out.println(i/10);
        System.out.println((i / 10) % 10);
        String number = Integer.toString(i);
        // java.lang.StringIndexOutOfBoundsException: String index out of range: -1 in case its length is less than 2
        int secondLastDigit = Character.getNumericValue((number.charAt(number.length() - 2)));
        System.out.println(secondLastDigit);
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
