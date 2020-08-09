package com.company.commonQAs;

/**
 * Created by user on 20-May-17.
 */
public class First2MaxValue {
    public static void main(String[] args) {
        int nums[] = { 15, 24, 95, 21, 43, 11, 79, 93 };
        int maxOne = 0;
        int maxTwo = 0;
        for (int n : nums) {
            if (maxOne < n) {
                maxTwo = maxOne;
                maxOne = n;
            } else if (maxTwo < n) {
                maxTwo = n;
            }
        }
        System.out.println("Max1 - " + maxOne);
        System.out.println("Max2 - " + maxTwo);
    }
}
