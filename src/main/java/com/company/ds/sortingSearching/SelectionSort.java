package com.company.ds.sortingSearching;

import org.testng.annotations.Test;

import java.util.Arrays;

public class SelectionSort {
    /*The selection sort algorithm works in a very simple way. It maintains two sub-array for the given array.
    One sub-array is already sorted.
    And the second sub-array is unsorted.
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
            swap(arr,lastUnsortedIndex,index);
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
}
