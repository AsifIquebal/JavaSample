package com.company.collection;

import org.testng.annotations.Test;

import java.util.Arrays;

public class ArraysDemo {

    @Test
    public void toStringMethod(){
        int[] ar = {4, 6, 1, 8, 3, 9, 7, 4, 2};
        // To print the elements in one line
        System.out.println(Arrays.toString(ar));
    }

    @Test
    public void sortMethod(){
        int[] ar = {4, 6, 1, 8, 3, 9, 7, 4, 2};
        // To sort a specific range of array in ascending order.
        Arrays.sort(ar, 0, 4);
        System.out.println("Sorted array in range of 0-4 =>\n" + Arrays.toString(ar));
        // To sort the complete array in ascending order.
        Arrays.sort(ar);
        System.out.println("Completely sorted order =>\n" + Arrays.toString(ar));
    }

    @Test
    public void binarySearchMethod(){
        int[] ar = {4, 6, 1, 8, 3, 9, 7, 5, 2};
        // Sort the complete array in ascending order so that Binary Search can be applied
        Arrays.sort(ar);
        System.out.println("Sorted Array: " + Arrays.toString(ar));
        // To search for a particular value(for eg 9) use binarysearch method of arrays
        int index = Arrays.binarySearch(ar,9);
        System.out.println("Position of 9 in sorted arrays is => \n" + index);
    }
}
