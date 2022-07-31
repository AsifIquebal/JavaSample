package com.company.commonlyasked;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class InterviewSet4 {


    @Test
    public void findNumberInAnArray() {
        int[] array = {1, 2, 3, 45, 45, 7, 8, 9, 5, 4, 2, 0, 5};
        System.out.println(IntStream.of(array).anyMatch(x -> x == 4));
    }

    @Test
    public void findCommon01() {
        Integer[] arrayOne = {1, 4, 5, 2, 7, 3, 9};
        Integer[] arrayTwo = {5, 2, 4, 9, 5};
        Integer[] common = findCommon(arrayOne, arrayTwo);
        System.out.print("Common Elements Between Two Arrays: ");
        for (Integer entry : common) {
            System.out.print(entry + " ");
        }
    }

    public static Integer[] findCommon(Integer[] arrayOne, Integer[] arrayTwo) {
        Integer[] arrayToHash;
        Integer[] arrayToSearch;
        if (arrayOne.length < arrayTwo.length) {
            arrayToHash = arrayOne;
            arrayToSearch = arrayTwo;
        } else {
            arrayToHash = arrayTwo;
            arrayToSearch = arrayOne;
        }
        HashSet<Integer> intersection = new HashSet<>();
        HashSet<Integer> hashedArray = new HashSet<>();
        for (Integer entry : arrayToHash) {
            hashedArray.add(entry);
        }
        for (Integer entry : arrayToSearch) {
            if (hashedArray.contains(entry)) {
                intersection.add(entry);
            }
        }
        Integer[] arr = new Integer[intersection.size()];
        return intersection.toArray(arr);
    }

    @Test
    public void findCommon() {
        int[] arr1 = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
        int[] arr2 = {100, 9, 64, 7, 36, 5, 16, 3, 4, 1};
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : arr1) {
            set1.add(i);
        }
        for (int i : arr2) {
            set2.add(i);
        }
        // use retainAll() method to find common elements
        set1.retainAll(set2);
        System.out.println("Common elements- " + set1);
    }

    @Test
    public void reatinAllMethodOfArrayList() {
        ArrayList<String> bags = new ArrayList<>();
        bags.add("pen");
        bags.add("pencil");
        bags.add("paper");
        ArrayList<String> boxes = new ArrayList<>();
        boxes.add("pen");
        boxes.add("paper");
        boxes.add("books");
        boxes.add("rubber");
        System.out.println("Bags Contains :" + bags);
        System.out.println("Boxes Contains :" + boxes);

        // Apply retainAll() method to boxes passing bags as parameter
        boxes.retainAll(bags);

        // Displaying both the lists after operation
        System.out.println("\nAfter Applying retainAll()" +
                " method to Boxes\n");
        System.out.println("Bags Contains :" + bags);
        System.out.println("Boxes Contains :" + boxes);
    }
}
