package com.company.commonlyasked;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CountRepeats {
    @Test
    public void test01() {
        int[] nums = {655, 578, 786};
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            char[] n = String.valueOf(nums[i]).toCharArray();
            for (int j = 0; j < n.length; j++) {
                if (map.containsKey(n[j])) {
                    map.put(n[j], map.get(n[j]) + 1);
                } else {
                    map.put(n[j], 1);
                }
            }
        }
        System.out.println(map);
    }


    @Test
    public void test02(){
        System.out.println(checkRepeatingCharactersFromMap("Programming"));
    }

    public static boolean checkRepeatingCharactersFromMap(String s1) {
        boolean repeat = false;
        if (s1 != null && s1.length() > 0) {
            char[] s1Array = s1.toCharArray();
            Set<Character> set = new TreeSet<>();
            Set<Character> repeatChar = new TreeSet<>();
            for (char c1 : s1Array) {
                if (!set.add(c1)) {
                    // System.out.print(c1 + " "); //if you want to print each occurrence of the repeating character
                    repeatChar.add(c1);
                    repeat = true;
                    // return true; //end the loop if you don't want to cache the repeating characters
                }
            }
            System.out.print(repeatChar);
        }
        return repeat;
    }

}
