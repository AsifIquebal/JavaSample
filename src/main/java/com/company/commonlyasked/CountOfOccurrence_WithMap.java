package com.company.commonlyasked;

import com.mysql.cj.util.StringUtils;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by user on 27-Apr-17.
 */
public class CountOfOccurrence_WithMap {
    public static void main(String[] args) {
        CountOfOccurrence_WithMap countOfOccurrence = new CountOfOccurrence_WithMap();
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
        /*String str1 = "aab";
        char[] chars = str1.toCharArray();*/
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
        //if(obj instanceof StringUtils)
    }

}
