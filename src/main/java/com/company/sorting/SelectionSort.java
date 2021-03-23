package com.company.sorting;

public class SelectionSort {
    //The selection sort algorithm works in a very simple way. It maintains two subarray for the given array.
    //The subarray is already sorted.
    //And the second subarray is unsorted.
    //With every iteration of selection sort, an element is picked from the unsorted subarray and moved to the sorted subarray.

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    public static void main(String a[]) {
        int[] arr1 = {9, 14, 3, 2, 43, 11, 58, 22};
        System.out.println("Before Selection Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        selectionSort(arr1);//sorting array using selection sort
        System.out.println("After Selection Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }

    public int get(int i){
        return 10;
    }
    public String get(int i){
        return "ABC";
    }

}