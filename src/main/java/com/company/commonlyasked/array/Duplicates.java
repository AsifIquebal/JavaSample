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
        int[] a = {1, 2, 3, 1, 3, 4, 1, 4, 3, 1, 3, 5, 5, 5, 5, 6};
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

    @Test
    public void removeDuplicateChar() {
        char[] withDuplicateChars = {'e', 'a', 'b', 'a', 'c', 'd', 'b', 'd', 'c', 'e'};
        String result = "";
        //char[] withOutDuplicateChars;
        //List<String> withDuplicateChars = new ArrayList<>();
        int k = 0;
        for (char c : withDuplicateChars) {
            if (result.indexOf(c) == -1) {
                result = result + c;
                //withDuplicateChars[k++] = c;
            }
        }
        System.out.println(result.toCharArray());
        //System.out.println(Arrays.toString(withOutDuplicateChars));
    }

    @Test
    public void removeDuplicateIntegers(){
        int [] a = {1,2,2,6,3,2,1};//1,2,6,3
        Set<Integer> result = new LinkedHashSet<>();
        List<Integer> leftOver = new ArrayList<>();
        for (int j : a) {
            if(!result.contains(j)){
                result.add(j);
            } else {
                leftOver.add(j);
            }
        }
        System.out.println(result);
        System.out.println(leftOver);
    }


}
