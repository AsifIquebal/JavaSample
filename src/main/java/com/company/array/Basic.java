package com.company.array;

import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
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
    public void intersectionAndUnion() {
        int nums1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int nums2[] = {12, 11, 10, 7, 8, 6};
        HashSet<Integer> set1 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for (int i : nums2) {
            if (set1.contains(i)) {
                set2.add(i);
            }
        }

        System.out.println("Intersection: " + set2);

        for (int i : nums2) {
            set1.add(i);
        }
        System.out.println("Union: " + set1);

        System.out.println("-----------------");
        int[] result = new int[set2.size()];
        int i = 0;
        for (int n : set2) {
            result[i++] = n;
        }
        for (int x = 0; x < result.length; x++) {
            System.out.print(result[x] + " ");
        }
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
    public void intToIntergerArray() {
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
    public void usingReflcetion() {
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
}