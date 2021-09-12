package com.company.commonlyasked.array;

import org.testng.annotations.Test;

public class MoveZerosToEnd {
    @Test
    public void moveZeroesMethod() {
        int[] nums = {0, 1, 0, 3, 12};
        int counter = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                counter++;
            } else {
                nums[temp] = nums[i];
                temp++;
            }
        }
        for (int j = nums.length - counter; j < nums.length; j++) {
            nums[j] = 0;
        }
        for (int num : nums) {
            System.out.println(num);
        }
    }

    @Test
    public void pushZerosToEnd() {
        int[] arr = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;
        int count = 0;
        // If element encountered is non-zero, then replace the element at index 'count' with this element
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i]; // here count is incremented
            }
            // Now all non-zero elements have been shifted to front and 'count' is set as index of first 0.
        }
        // Make all elements 0 from count to end.
        while (count < n) {
            arr[count++] = 0;
        }
        printTheArray(arr);
    }

    private void printTheArray(int[] arr) {
        System.out.println("Length: " + arr.length);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    @Test
    public void moveZerosToEndUsingSingleTraversal() {
        int[] arr = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        System.out.println("Length: " + arr.length);
        int n = arr.length;
        int count = 0;
        int temp;
        // If arr[i] is non-zero, then swap the element at index 'count' with the element at index 'i'
        for (int i = 0; i < n; i++) {
            if ((arr[i] != 0)) {
                temp = arr[count];
                arr[count++] = arr[i];
                arr[i] = temp;
                //count = count + 1;
            }
        }
        printTheArray(arr);

    }
}
