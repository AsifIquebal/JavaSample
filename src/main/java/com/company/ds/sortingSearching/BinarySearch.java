package com.company.ds.sortingSearching;

import org.testng.annotations.Test;

import java.util.Arrays;

public class BinarySearch {

    public int search(int[] a, int target) {
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] == target) return mid;
            else if (a[mid] < target) left = mid + 1;
            else if (a[mid] > target) right = mid - 1;
        }
        return -1;
    }

    @Test
    public void test_01(){
        int[] array = {2,1,8,3,4,7,9};
        Arrays.sort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));
        int i = search(array,7);
        System.out.println(array[i] + ":" + i);
    }

}
