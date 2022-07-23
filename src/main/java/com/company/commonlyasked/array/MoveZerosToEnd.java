package com.company.commonlyasked.array;

import org.testng.annotations.Test;

import java.util.Arrays;

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
        Arrays.stream(nums).forEach(e -> System.out.print(e + " "));
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
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void moveZerosToEnd() {
        int[] array = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int i = 0, j = 0;
        while (i < array.length) {
            if (array[i] != 0) {
                int temp = array[j];
                array[j++] = array[i];
                array[i] = temp;
            }
            i++;
        }
        System.out.println(Arrays.toString(array));
    }

    @Test
    public void rearrangePositiveAndNegative() {
        int[] arr = {2, 4, -10, 13, -7, -60, 52, 8, -19};
        int j = 0, temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                temp = arr[i];   // (i=2,j=0, -10),(i=4,j=1,-7)
                arr[i] = arr[j]; // (arr[2]=2),()
                arr[j] = temp;   // (arr[0]=-10),()
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void howArrayPushWorking() {
        int[] arr = {1, 2, 3};
        arr[0] = 4;
        System.out.println(Arrays.toString(arr)); // [4, 2, 3]
    }
}
