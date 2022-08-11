package com.company.commonlyasked;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class InterviewSet1_Numbers {

    //region Fibonacci numbers
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

    //endregion
    // region Factorial
    private static int factorial(int n) {
        if (n == 0) return 1;
        else return (n * factorial(n - 1));
    }

    @Test
    public void usingRecursion() {
        int fact = 1;
        int number = 25;//It is the number to calculate factorial
        fact = factorial(number);
        System.out.println("Factorial of " + number + " is: " + fact);
    }

    //endregion
    //region Largest and Smallest
    @Test
    public void largestAndSmallest() {
        int[] numbers = new int[]{32, 43, 53, 54, 32, 65, 63, 98, 43, 23};
        //assign first element of an array to largest and smallest
        int smallest = numbers[0];
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            } else if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("Largest Number is : " + largest + "Smallest Number is : " + smallest);
    }

    //endregion
    //region moves zeros
    @Test
    public void moveZerosToEnd() {
        int[] array = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int i = 0, j = 0;
        while (i < array.length) {
            if (array[i] != 0) {
                int temp = array[j];
                array[j++] = array[i];
                array[i] = temp;
            }
            i++;
        }
        System.out.println(Arrays.toString(array));
    }

    //endregion
    //region Summation Pairs
    @Test
    public void findSummationPairs() {
        int[] nums = {3, 5, 7, 10, 12};
        int sum = 17;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            int temp = sum - num;
            if (set.contains(temp)) {
                System.out.println("Pair found for sum " + sum + "(" + temp + "," + num + ")");
            }
            set.add(num);
        }
    }

    //endregion
    //region Remove adjacent vowels from String // TODO
    /* Remove vowels only if it is consecutive
        input = {"A","S","I","E","F","X","O","U","V","I","T"}
        output = {"A","S","F","X","V","I","T"}
        */
    private boolean isVowel(char c) {
        return (c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u');
    }

    @Test
    public void removeVowels() {
        String str = "asiefxouvit";
        for (int i = 1; i < str.length(); i++) {
            if ((!isVowel(str.charAt(i - 1))) || (!isVowel(str.charAt(i)))) {
                System.out.print(str.charAt(i));
            }
        }
    }

    //endregion
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

    @Test
    public void primeNumber() {
        printPrime(10);
    }

    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        // This is checked so that we can skip middle five numbers in below loop
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        // one of the divisors must be smaller than or equal to √n. So we check for divisibility only till √n.
        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    private void printPrime(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

}
