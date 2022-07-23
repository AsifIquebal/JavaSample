package com.company.commonlyasked;

import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by user on 27-Apr-17.
 */
public class CountOfOccurrence {
    public static void main(String[] args) {
        CountOfOccurrence countOfOccurrence = new CountOfOccurrence();
        countOfOccurrence.forString1("ababdzzy");
        countOfOccurrence.forString2("ababdzzy");
        int[] num = {1, 2, 2, 1, 3};
        countOfOccurrence.forInts(num);
    }

    public void forString1(String text) {
        String str = text;
        int count = 0;
        char ch;
        Map<Character, Integer> map = new HashMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            for (int j = 0; j < str.length(); j++) {
                ch = str.charAt(j);
                if (ch == c) {
                    count = count + 1;
                }
            }
            if (!map.containsKey(c) && count != 0) {
                map.put(c, count);
            }
            count = 0;
        }
        System.out.println(map);
    }

    public void forInts(int[] numbers) {
        int[] array = numbers;
        int count = 0;
        int num;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j < array.length; j++) {
                num = array[j];
                if (num == i) {
                    count = count + 1;
                }
            }
            if (!map.containsKey(i) && count != 0) {
                map.put(i, count);
            }
            count = 0;
        }
        System.out.println(map);
    }

    public void forString2(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character key = str.charAt(i);
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        System.out.println(map);
    }

    // Java 8
    @Test
    public void byJava8() {
        String str = "abcabcd";
        Map<String, Long> map =
                Arrays
                        .stream(str.split(""))
                        .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(map);
    }

    @Test
    public void countArray() {
        String str = "ababc"; // a2 b2 c1
        int[] charCount = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int x = c - 'a';
            charCount[x] = charCount[x] + 1;
        }
        for (int i = 0; i < str.length(); i++) {
            if (charCount[str.charAt(i) - 'a'] != 0) {
                System.out.print(str.charAt(i));
                System.out.print(charCount[str.charAt(i) - 'a'] + " ");
                charCount[str.charAt(i) - 'a'] = 0;
            }
        }
    }

    @Test
    public void countStringCharacters() {
        CountOfOccurrence countOfOccurrence = new CountOfOccurrence();
        countOfOccurrence.forString("ababdzzy");
    }

    @Test
    public void countIntegers() {
        CountOfOccurrence countOfOccurrence = new CountOfOccurrence();
        int[] num = {1, 2, 2, 1, 3};
        countOfOccurrence.forInts(num);
    }

    @Test
    public void test03UsingCollectionsFequency() {
        List<String> list = new ArrayList<>(Arrays.asList("1", "2", "3", "1", "2", "4", "5"));
        Map<String, Integer> map = new HashMap<>();
        for (String elem : list) {
            if (!map.containsKey(elem)) {
                int count = Collections.frequency(list, elem);
                map.put(elem, count);
            }
        }
        System.out.println(map);
    }

    public void forString(String text) {
        String str = text;
        int count = 0;
        char ch;
        for (char c = 'a'; c <= 'z'; c++) {
            for (int j = 0; j < str.length(); j++) {
                ch = str.charAt(j);
                if (ch == c) {
                    count = count + 1;
                }
            }
            if (count != 0) {
                System.out.println(c + ": " + count);
            }
            count = 0;
        }
    }

    public void forInts1(int[] numbers) {
        int[] array = numbers;
        int count = 0;
        int num;
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j < array.length; j++) {
                num = array[j];
                if (num == i) {
                    count = count + 1;
                }
            }
            if (count != 0) {
                System.out.println(i + ": " + count);
            }
            count = 0;
        }
    }
}
