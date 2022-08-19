package com.company.ds.sortingSearching;

import org.testng.annotations.Test;

import java.util.Arrays;

public class SelectionSort {
    /*The selection sort algorithm works in a very simple way. It maintains two sub-array for the given array.
    One sub-array is already sorted. And the second sub-array is unsorted.
    With every iteration of selection sort, an element is picked from the unsorted sub-array and
    moved to the sorted sub-array.*/

    public void selectionSort(int[] arr) {
        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int index = lastUnsortedIndex;
            for (int j = lastUnsortedIndex + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;//searching for lowest index
                }
            }
            swap(arr, lastUnsortedIndex, index);
        }
    }

    @Test
    public void test_01() {
        int[] arr1 = {9, 14, 3, 2, 43, 11, 58, 22};
        System.out.println("Before Selection Sort");
        System.out.println(Arrays.toString(arr1));
        System.out.println();
        selectionSort(arr1);
        System.out.println("After Selection Sort");
        System.out.println(Arrays.toString(arr1));
    }

    private void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void sort(int[] arr) {
        int n = arr.length;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }
            // Swap the found minimum element with the first element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    @Test
    public void test_02() {
        int[] arr1 = {9, 14, 3, 2, 43, 11, 58, 22};
        sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
