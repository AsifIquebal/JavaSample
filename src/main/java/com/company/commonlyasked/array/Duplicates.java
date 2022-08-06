package com.company.commonlyasked.array;

import org.testng.annotations.Test;

import java.util.*;

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
    }


    @Test
    public void test02_usingArraysSort() {
        int[] a = {1, 2, 3, 1, 3, 4, 1, 4, 3, 1, 3, 5, 5, 5, 5, 6};
        Arrays.sort(a);
        int count = 1;
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1 || a[i] != a[i + 1]) {
                System.out.println(a[i] + " : " + count);
                count = 1;
            } else {
                count++;
            }
        }
    }

    @Test
    public void usingHashMapGetOrDefaultMethod() {
        int[] numbers = {1, 2, 3, 1, 2, 4};
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int i : numbers) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i : map.keySet()) {
            if (map.get(i) > 1)
                result.add(i);
        }
        System.out.println(result);
    }

}
