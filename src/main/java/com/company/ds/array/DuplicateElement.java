package com.company.ds.array;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {

    // Brute force
    // Traversing the array, 2 loops, time O(n^2)

    // Set: traversing time O(n)
    // worst case space O(n)
    @Test
    public void usingSet() {
        int[] a = {1, 2, 3, 1, 2, 4};
        Set<Integer> s = new HashSet<>();
        for (int i : a) {
            if(!s.add(i)){
                System.out.println(i + " ");
            }
        }
    }

    // Find duplicates in O(n) and O(1) for a given array of n elements,
    // elements can be in 1 to n-1,
    // Encoding: O(N) and O(1),
    @Test
    public void test_01() {
        int[] a = {1, 2, 3, 1, 3, 3, 1, 6, 6};
        //int[] a = {3,1,3}; // invalid, not in 1 to n-1

        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            int index = Math.abs(a[i]);
            if (a[index] > 0) {
                a[index] = -a[index];
            } else {
                result.add(Math.abs(a[i]));
            }
        }
        System.out.println(result);
    }


    /* Problem Statement:
     * an array of n+1 integers between 1 and n [inclusive]
     * only one duplicate, may be repeated several times
     * 1,3,4,2,2 => 2
     * 3,1,3,4,2 => 3
     * No modification of the array allowed
     * Floyd Cycle Method/ Tortoise Hare Method
     * Time: O(n) space: O(1)
     * */

    @Test
    public void test_02() {
        int[] a = {5, 3, 2, 4, 2, 1};
        int slow = a[0];
        int fast = a[0];

        do {
            slow = a[slow];
            fast = a[a[fast]];
        } while (slow != fast);

        fast = a[0];
        while (slow != fast) {
            slow = a[slow];
            fast = a[fast];
            System.out.println("slow: " + slow + ", fast: " + fast);
        }
        System.out.println("Duplicate: " + fast);
    }

}
