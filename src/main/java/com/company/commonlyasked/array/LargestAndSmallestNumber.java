package com.company.commonlyasked.array;

import org.testng.annotations.Test;

public class LargestAndSmallestNumber {
    @Test
    public void largestAndSmallest() {
        int numbers[] = new int[]{32, 43, 53, 54, 32, 65, 63, 98, 43, 23};
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
}
