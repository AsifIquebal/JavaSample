package com.company.commonlyasked.array;

import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Basic {

    @Test
    public void t1() {
        int i = 4;
        int ia[][][] = new int[i][i = 3][i];
        System.out.println(ia.length);
        System.out.println(ia[0].length);
        System.out.println(ia[0][0].length);
    }

    @Test
    public void listToArray() {
        String[] str1 = {"A", "E", "I"};
        String[] str2 = {"O", "U"};
        List<String> list = new ArrayList<>(Arrays.asList(str1));
        list.addAll(Arrays.asList(str2));
        Object[] str3 = list.toArray();
        System.out.println(Arrays.toString(str3));
    }

    @Test
    public void arrayCopyMethod() {
        int[] scores = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(scores));
        System.arraycopy(scores, 2, scores, 3, 2);
        System.out.println(Arrays.toString(scores));
        for (int i : scores) {
            System.out.println(i);
        }
        /*src – the source array.
          srcPos – starting position in the source array.
          dest – the destination array.
          destPos – starting position in the destination data.
          length – the number of array elements to be copied.
        arraycopy(Object src, int srcPos, Object dest,int destPos, int length);*/
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8};
        int[] arr3 = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
        System.out.println(Arrays.toString(arr3));
    }

    @Test
    public void mergeTwoSortedArrayAndRemoveDuplicates() {
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8};
        Map<Integer, Boolean> mp = new TreeMap<>();
        for (int j : arr1) {
            mp.put(j, true);
        }
        for (int j : arr2) {
            mp.put(j, true);
        }
        for (Map.Entry<Integer, Boolean> me : mp.entrySet()) {
            System.out.print(me.getKey() + " ");
        }
    }

    @Test
    public void mergeTwoSortedArrayAndKeepDuplicates() {
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = new int[]{2, 4, 6, 8};
        int[] arr3 = new int[arr1.length + arr2.length];
        System.out.println(arr3.length);
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
        System.out.println(Arrays.toString(arr3));
        for (int i = arr3.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr3[j] > arr3[j + 1]) {
                    int temp = arr3[j + 1];
                    arr3[j + 1] = arr3[j];
                    arr3[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr3));
    }

    @Test
    public void intersectionAndUnion() {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] nums2 = {12, 11, 10, 6, 7, 8};
        /*HashSet<Integer> set1 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }*/
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        HashSet<Integer> set2 = new HashSet<>();
        for (int i : nums2) {
            if (set1.contains(i)) {
                set2.add(i);
            }
        }
        System.out.println("Intersection: " + set2);
        for (int i : nums2) {
            System.out.println(set1.add(i));
        }
        System.out.println("Union: " + set1);
        System.out.println("-----------------");
        int[] result = new int[set2.size()];
        int i = 0;
        for (int n : set2) {
            result[i++] = n;
        }
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }

    @Test
    public void printArray() {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(array1));
        int[][] array2 = {{1, 2}, {3, 4}, {5, 6, 7}};
        System.out.println(Arrays.deepToString(array2));
        System.out.println(array1);
    }

    @Test
    public void intToIntegerArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Class/Type: " + array.getClass().toGenericString());
        Integer[] boxedArray = IntStream.of(array).boxed().toArray(Integer[]::new);
        System.out.println(Arrays.toString(boxedArray));
        System.out.println("Class/Type : " + boxedArray.getClass().toGenericString());
        Set<Integer> set = IntStream.of(array).boxed().collect(Collectors.toSet());
        //or if you need a HashSet specifically
        HashSet<Integer> hashset = IntStream.of(array).boxed().collect(Collectors.toCollection(HashSet::new));
    }

    @Test
    public void splitArrayAndGetMax() {
        Integer[] array = {1, 200, 3, 4, 5, 6, 700, 8};
        TreeSet<Integer> set1 = new TreeSet<>(Arrays.asList(Arrays.copyOfRange(array, 0, (array.length + 1) / 2)));
        TreeSet<Integer> set2 = new TreeSet<>(Arrays.asList(Arrays.copyOfRange(array, (array.length + 1) / 2, array.length)));
        System.out.println(set1.last());
        System.out.println(set2.last());
    }

    @Test
    public void usingReflection() {
        int count = 0;
        // Creating 2D array
        int[][] a = (int[][]) Array.newInstance(int.class, 3, 2);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = count++;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void test01() {
        int[] a = {1, 2, 3};
        //System.out.println("Last Element: " + a[a.length-1]);
        //System.out.println("Second Last Element: " + a[a.length-2]);
        for (int i = 1; i <= a.length; i++) {
            System.out.println(a[a.length - i]);
        }
    }
}
