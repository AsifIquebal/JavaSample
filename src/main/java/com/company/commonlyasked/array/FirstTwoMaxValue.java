package com.company.commonlyasked.array;

import org.testng.annotations.Test;

public class FirstTwoMaxValue {
    @Test
    public void firstTwoMaxValue() {
        int nums[] = {15, 24, 95, 21, 43, 11, 79, 93};
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
        System.out.println("Max1 - " + maxOne + "Max2 - " + maxTwo);
    }
}
