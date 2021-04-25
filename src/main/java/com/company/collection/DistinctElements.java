package com.company.collection;

import org.testng.annotations.Test;

import java.util.Arrays;

public class DistinctElements {

    @Test
    public void test_01() {
        int[] nums = {1,1,3,3,4,6};
        usingSortGetDistinct(nums);
    }

    public void usingSortGetDistinct(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            // Move the index ahead while there are duplicates
            while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                i++;
            }
            // print last occurrence of the current element
            System.out.print(arr[i] + " ");
        }
    }


    public static void printDistinctElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isDistinct = true;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String a[]) {
        int[] nums = {5, 2, 7, 2, 4, 7, 8, 2, 3, 5};
        DistinctElements.printDistinctElements(nums);
        System.out.println();
        newDistinct(nums);
    }


    public static void newDistinct(int... num) {
        /*for(int i=0; i <num.length; i++){
            int num1 = num[i];
            int count = 0;
            for(int j=0; j<num.length; j++){
                int num2 = num[j];
                if(num1==num2){
                    count = count + 1;

                }
            }

            System.out.println(num1 + " found " + count + " times");
        }*/

        // Pick all elements one by one
        for (int i = 0; i < num.length; i++) {
            // Check if the picked element is already printed
            int j;
            for (j = 0; j < i; j++) {
                if (num[i] == num[j])
                    break;
            }
            // If not printed earlier, then print it
            if (i == j) {
                System.out.println(num[i]);
            }
        }
    }
}
