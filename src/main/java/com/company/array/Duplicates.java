package com.company.array;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Duplicates {

    // brute force :O(n2)
    @Test
    public void test_01() {
        int[] a = {2, 3, 2, 2, 2, 3, 1};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j])
                    System.out.println(a[j]);
            }
        }
        /*for (int i = 0; i < a.length; i++) {
            int counter = 1;

            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == (a[j])) {
                    counter++;
                    System.out.println(a[j]);
                    //break;
                }
            }
            if(counter>1){
                System.out.println(a[i] +":"+ counter);

            }*/
    }


    @Test
    public void test_02() {
        int a[] = {1, 2, 3, 1, 3, 4, 1, 4, 3, 1, 3, 5, 5, 5, 5, 6};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int count = 1;
        for (int i = 0; i < a.length; i++) {
            System.out.println("for loop: i : " + i);
            System.out.println("Condition1: " + (a.length - 1));
            System.out.println("Condition2: a[i]: " + a[i] + ", a[i+1]: " + a[i + 1]);
            if (i == a.length - 1 || a[i] != a[i + 1]) {
                System.out.println(a[i] + "::: " + count);
                count = 1;
            } else {
                count++;
            }
        }
    }




}
