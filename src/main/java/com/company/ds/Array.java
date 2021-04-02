package com.company.ds;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class Array {

    // Find duplicates in O(n) and O(1) for a given array of n elements
    // elements can be in 0 to n-1
    // Encoding: O(N) and O(1)
    @Test
    public void test_01() {
        int[] a = {1, 2, 2, 1,2,6,6,7};
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            int index = Math.abs(a[i]);
            if (a[index] > 0) {
                a[index] = -a[index];
            }
            else {
                result.add(Math.abs(a[i]));
            }
        }
        System.out.println(result);
    }

}
