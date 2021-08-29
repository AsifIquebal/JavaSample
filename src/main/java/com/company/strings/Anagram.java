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
        String s1 = str1.replaceAll("\\s", "").replaceAll("'", "");
        String s2 = str2.replaceAll("\\s", "").replaceAll("'", "");
        boolean status;
        if (s1.length() != s2.length()) {
            status = false;
        } else {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            System.out.println(ArrayS1[0]);
            status = Arrays.equals(ArrayS1, ArrayS2);
        }
        if (status) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
    }

    private void isAnagram02(String str1, String str2) {
        String s1 = str1.toLowerCase().replaceAll("\\s", "").replaceAll("'", "");
        String s2 = str2.toLowerCase().replaceAll("\\s", "").replaceAll("'", "");
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

}
