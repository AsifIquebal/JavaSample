package com.company.commonlyasked;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class InterviewSet4_Array02 {

    @Test
    public void pairSum() {
        int[] array = {1, 4, 45, 6, 10, 8, 12};
        int sum = 10;
        Set<Integer> set = new HashSet<>();
        for (int j : array) {
            int temp = sum - j;
            set.add(j);
            if (set.contains(temp)) {
                System.out.println("Pair with given sum " + sum + " is (" + j + ", " + temp + ")");
            }

        }
    }

    @Test
    public void pairSumTwoPointer() {
        int[] array = {1, 4, 45, 6, 10, 8, 12};
        Arrays.sort(array);
        int sum = 18;
        int i = 0, j = array.length - 1;
        while (i < j) {
            if (array[i] + array[j] == sum) {
                System.out.println(array[i] + ", " + array[j]);
                break;
            } else if (array[i] + array[j] < sum) {
                i++;
            } else {
                j--;
            }
        }
    }
}
