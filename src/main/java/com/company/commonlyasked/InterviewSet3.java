package com.company.commonlyasked;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.BitSet;

public class InterviewSet3 {
    /**
     * A general method to find missing values from an integer array in Java.
     * This method will work even if array has more than one missing element.
     */
    private static void printMissingNumber(int[] numbers, int count) {
        int missingCount = count - numbers.length;
        BitSet bitSet = new BitSet(count);
        for (int number : numbers) {
            bitSet.set(number - 1);
        }
        System.out.printf("Missing numbers in integer array %s, with total number %d is %n", Arrays.toString(numbers), count);
        int lastMissingIndex = 0;
        for (int i = 0; i < missingCount; i++) {
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }

    }

    @Test
    public void test01() {
        // one missing number
        printMissingNumber(new int[]{1, 2, 3, 4, 6}, 6);
        // two missing number
        printMissingNumber(new int[]{1, 2, 3, 4, 6, 7, 9, 8, 10}, 10);
        // three missing number
        printMissingNumber(new int[]{1, 2, 3, 4, 6, 9, 8}, 10);
        // four missing number
        printMissingNumber(new int[]{1, 2, 3, 4, 9, 8}, 10);
    }

    @Test
    public void bitsExamples() {
        BitSet bits1 = new BitSet(16);
        BitSet bits2 = new BitSet(16);
        // set some bits
        for (int i = 0; i < 16; i++) {
            if ((i % 2) == 0) bits1.set(i);
            if ((i % 5) != 0) bits2.set(i);
        }
        System.out.println("Initial pattern in bits1: ");
        System.out.println(bits1);
        System.out.println("\nInitial pattern in bits2: ");
        System.out.println(bits2);
        // AND bits
        bits2.and(bits1);
        System.out.println("\nbits2 AND bits1: ");
        System.out.println(bits2);
        // OR bits
        bits2.or(bits1);
        System.out.println("\nbits2 OR bits1: ");
        System.out.println(bits2);
        // XOR bits
        bits2.xor(bits1);
        System.out.println("\nbits2 XOR bits1: ");
        System.out.println(bits2);
    }
}
