package com.company.commonlyasked.slidingwindow;

import org.testng.annotations.Test;

public class FixedSizeWindow {

    @Test
    public void test01() {
        int[] a = {4, 2, 3, 5, 2, 2, 10};
        int windowSize = 3;
        System.out.println(maximumSumSubArrayOfSizeK(a,windowSize));
    }

    public int maximumSumSubArrayOfSizeK(int[] a, int windowSize) {
        int i = 0;
        int maxSum = Integer.MIN_VALUE;
        int windowSum = 0;
        for (int j = 0; j < a.length; j++) {
            windowSum = windowSum + a[j];
            // j-i+1 is always the window size, which must be equal to k
            if (j - i + 1 == windowSize) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum = windowSum - a[i];
                i++;
            }
        }
        return maxSum;
    }

    @Test
    public void minimumSumSubArrayOfSizeK() {
        int[] a = {4, 2, 3, 5, 2, 2, 10};
        int k = 3;
        int i = 0;
        int minSum= Integer.MAX_VALUE;
        int windowSum = 0;
        for (int j = 0; j < a.length; j++) {
            windowSum = windowSum + a[j];
            // j-i+1 is always the window size, which must be equal to k
            if (j - i + 1 == k) {
                minSum = Math.min(minSum, windowSum);
                windowSum = windowSum - a[i];
                i++;
            }
        }
        System.out.println(minSum);
    }

    @Test
    public void firstNegativeNumberInEveryWindowOfSizeK() {
        int[] array = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        int i=0, j=0;
        while(j<array.length){
            if(array[j]<0){

            }
            if(j-i+1 < k){
                j++;
            }else if(j-i+1 == k){

            }
        }

    }

}
