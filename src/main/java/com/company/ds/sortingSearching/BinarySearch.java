package com.company.ds.sortingSearching;

import org.testng.annotations.Test;

import java.util.Arrays;

public class BinarySearch {

    public int search(int[] a, int target) {
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            //System.out.println(mid);
            if (a[mid] == target) return mid;
            else if (a[mid] < target) left = mid + 1;
            else if (a[mid] > target) right = mid - 1;
        }
        return -1;
    }

    public int searchRecursively(int[]a, int left, int right, int target){
        int mid = (left+right)/2;
        if(target == a[mid]){
            return mid;
        }else if(target < a[mid]){
            return searchRecursively(a,left, mid-1, target);
        }else if(target > a[mid]){
            return searchRecursively(a,mid+1, right, target);
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
        System.out.println(searchRecursively(array,0,array.length-1, 7));
    }

}
