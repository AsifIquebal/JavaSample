package com.company.strings;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {


    @Test
    public void solution01() {
        isAnagram("Keep", "Peek");
        isAnagram("Mother In Law", "Hitler Woman");
        isAnagram("A decimal point", "I'm a dot in place");
    }

    @Test
    public void solution02() {
        isAnagram02("A decimal point", "I'm a dot in place");
        isAnagram02("abc", "acd");
    }


    private void isAnagram(String str1, String str2) {
        String s1 = str1.replaceAll("\\s", "").replace("'", "");
        String s2 = str2.replaceAll("\\s", "").replace("'", "");
        boolean status;
        if (s1.length() != s2.length()) {
            status = false;
        } else {
            char[] arrayS1 = s1.toLowerCase().toCharArray();
            char[] arrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(arrayS1);
            Arrays.sort(arrayS2);
            System.out.println(arrayS1[0]);
            status = Arrays.equals(arrayS1, arrayS2);
        }
        if (status) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
    }

    private void isAnagram02(String str1, String str2) {
        String s1 = str1.toLowerCase().replaceAll("\\s", "").replace("'", "");
        String s2 = str2.toLowerCase().replaceAll("\\s", "").replace("'", "");
        List<Character> list = new ArrayList<>();
        if (s1.length() != s2.length()) {
            System.out.println("Length is not matching");
        } else {
            System.out.println("Before adding up: " + list);
            s1.chars().mapToObj(c -> (char) c).forEach(list::add);
            System.out.println("After adding up: " + list);
            s2.chars().mapToObj(c -> (char) c).forEach(list::remove);
            System.out.println("After removing: " + list);
            System.out.println(list);
            if (list.isEmpty()) {
                System.out.println(str1 + " and " + str2 + ", are anagrams");
            } else {
                System.out.println(str1 + " and " + str2 + ", are not anagrams");
            }
        }
    }


    public int countManipulations(String s1, String s2) {
        int count = 0;
        int[] charCount = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            charCount[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            charCount[s2.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; ++i) {
            if (charCount[i] != 0) {
                count += Math.abs(charCount[i]);
            }
        }
        return count / 2;
    }

    //How many characters should one delete to make two given strings anagrams of each other?
    @Test
    public void countOFManipulation() {
        System.out.println(countManipulations("cde", "abc"));
    }



}
