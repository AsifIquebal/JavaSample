package com.company.commonlyasked.array;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class CommonProblems {

    @Test
    public void test01() {
        int[] array = {15, 24, 95, 21, 43, 11, 79, 93};
        getSecondHighest(array);
    }

    public void getSecondHighest(int[] arr) {
        int i, first, second;
        if (arr.length < 2) {
            System.out.print(" Invalid Input ");
        }
        first = second = Integer.MIN_VALUE;
        for (i = 0; i < arr.length; i++) {
            /* If current element is greater than first then update both first and second */
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            }
            /* If arr[i] is in between first and second then update second  */
            else if (arr[i] > second && arr[i] != first)
                second = arr[i];
        }
        if (second == Integer.MIN_VALUE)
            System.out.print("There is no second largest" + " element\n");
        else
            System.out.print("The second largest element" + " is " + second);
    }

    @Test
    public void firstTwoMaxValue() {
        int[] nums = {15, 24, 95, 21, 43, 11, 79, 93};
        int first = 0;
        int second = 0;
        for (int n : nums) {
            if (first < n) {
                second = first;
                first = n;
            } else if (second < n) {
                second = n;
            }
        }
        System.out.println("Max1 - " + first + ", Max2 - " + second);
    }

    @Test
    public void largestAndSmallest() {
        int[] numbers = new int[]{32, 43, 53, 54, 32, 65, 63, 98, 43, 23};
        //assign first element of an array to largest and smallest
        int smallest = numbers[0];
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest)
                largest = numbers[i];
            else if (numbers[i] < smallest)
                smallest = numbers[i];
        }
        System.out.println("Largest Number is : " + largest + "Smallest Number is : " + smallest);
    }

    @Test
    public void givenListContainsDuplicates_whenRemovingDuplicatesPreservingOrderWithPlainJava_thenCorrect() {
        List<Integer> listWithDuplicates = new ArrayList<>(Arrays.asList(5, 0, 3, 1, 2, 3, 0, 0));
        List<Integer> listWithoutDuplicates = new ArrayList<>(new LinkedHashSet<>(listWithDuplicates));
        System.out.println(listWithoutDuplicates);
        //[5, 0, 3, 1, 2]
    }

}
