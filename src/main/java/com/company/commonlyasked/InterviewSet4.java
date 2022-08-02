package com.company.commonlyasked;

import org.testng.annotations.Test;

import java.util.*;
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
        System.out.println("\nAfter Applying retainAll()" + " method to Boxes\n");
        System.out.println("Bags Contains :" + bags);
        System.out.println("Boxes Contains :" + boxes);
    }

    @Test
    public void findLargestAndSmallestNumber() {
        Integer[] arr = {34, 22, 10, 60, 30, 22};
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        System.out.println(set);
        TreeSet<Integer> sortedSet = new TreeSet<>(set);
        System.out.println("The sorted list is:");
        System.out.println(sortedSet);
        System.out.println("Smallest: " + sortedSet.first());
        System.out.println("Largest: " + sortedSet.last());
    }

    @Test
    public void test01() {
        int[] array = {15, 24, 95, 21, 43, 11, 79, 93};
        getSecondHighest(array);
    }

    public void getSecondHighest(int[] arr) {
        int i, first, second;
        if (arr.length < 2) {
            System.out.print(" Invalid Input ");
        }
        first = second = Integer.MIN_VALUE;
        for (i = 0; i < arr.length; i++) {
            /* If current element is greater than first then update both first and second */
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            }
            /* If arr[i] is in between first and second then update second  */
            else if (arr[i] > second && arr[i] != first)
                second = arr[i];
        }
        if (second == Integer.MIN_VALUE)
            System.out.print("There is no second largest" + " element\n");
        else
            System.out.print("The second largest element" + " is " + second);
    }

    @Test
    public void firstTwoMaxValue() {
        int[] nums = {15, 24, 95, 21, 43, 11, 79, 93};
        int first = 0;
        int second = 0;
        for (int n : nums) {
            if (first < n) {
                second = first;
                first = n;
            } else if (second < n) {
                second = n;
            }
        }
        System.out.println("Max1 - " + first + ", Max2 - " + second);
    }

    @Test
    public void givenListContainsDuplicates_whenRemovingDuplicatesPreservingOrderWithPlainJava_thenCorrect() {
        List<Integer> listWithDuplicates = new ArrayList<>(Arrays.asList(5, 0, 3, 1, 2, 3, 0, 0));
        List<Integer> listWithoutDuplicates = new ArrayList<>(new LinkedHashSet<>(listWithDuplicates));
        System.out.println(listWithoutDuplicates);
        //[5, 0, 3, 1, 2]
    }
}
