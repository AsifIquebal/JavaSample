package com.company.ds.array;

import org.testng.annotations.Test;

public class MajorityElement {

    /* Moore's Voting Algorithm
     * Element which occurs more than n/2 times of any array consisting of n elements is the majority element
     * Only one or 0 majority element can be there
     * */

    private int candidateElementCheck(int[] a) {
        int major = a[0];
        int count = 1;
        for (int i = 1; i < a.length; i++) {
            if (major == a[i]) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    major = a[i];
                    count++;
                }
            }
        }
        return major;
    }

    private boolean frequencyCheck(int[] a, int major) {
        int frequency = 0;
        for (int element : a) {
            if (major == element) {
                frequency++;
            }
        }
        return frequency > a.length / 2;
    }

    @Test
    public void test_01() {
        int[] a = {1, 4, 2, 4, 3};
        //int[] a = {2, 3, 4, 3, 3};
        //int[] a = {2, 2, 2, 3, 4};
        int candidate = candidateElementCheck(a);
        System.out.println("Candidate Element: " + candidate);
        System.out.println(frequencyCheck(a, candidate) ? "Majority Candidate: " + candidate : "No Majority Candidate Found");
    }

}