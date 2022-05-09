package com.company.ds.sortingSearching;

import org.testng.annotations.Test;

import java.util.Arrays;

public class BubbleSort {

    @Test
    public void test_01() {
        int[] arr = {64, 34, -25, 12, 22, -11, 90};
        System.out.println("Before Sorting: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }

    private void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            // we don't need to scan the entire loop, only un-sorted area scanning is needed
            for (int j = 0; j < lastUnsortedIndex; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    private void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
