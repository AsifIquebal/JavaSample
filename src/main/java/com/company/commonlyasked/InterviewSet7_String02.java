package com.company.commonlyasked;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class InterviewSet7_String02 {

    public String reverseRecursively(String str) {
        if (str.length() < 2) {
            return str;
        }
        //return str.charAt(0) + reverseRecursively(str.substring(1));
        return reverseRecursively(str.substring(1)) + str.charAt(0);
    }

    @Test
    public void test01() {
        System.out.println(reverseRecursively("hello world"));
        r2("another");
    }

    public void r2(String str) {
        if ((str == null) || (str.length() <= 1)) {
            System.out.println(str);
        } else {
            System.out.print(str.charAt(str.length() - 1));
            r2(str.substring(0, str.length() - 1));
        }
    }

    @Test
    public void test1() {
        String input = "This noon, Anna drove the racecar.";
        String[] stringArray = input.split("\\W");

        List<String> palindromicWord = new ArrayList<>();
        for (String string : stringArray) {
            if (string.equalsIgnoreCase(getReverseString(string)) && !string.isEmpty()) {
                palindromicWord.add(string);
            }
        }
        System.out.println("Total Palindromic word count: " + palindromicWord.size() + " " + palindromicWord);
    }

    public String getReverseString(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            stringBuilder.append(chars[i]);
        }
        return stringBuilder.toString();
    }

    @Test
    public void test02() {
        isPalindrome("Abba");
        isPalindrome("Abb");
    }

    private void isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        boolean b = true;
        while (i < j) {
            if (str.toLowerCase().charAt(i) != str.toLowerCase().charAt(j)) {
                b = false;
                break;
            }
            i++;
            j--;
        }
        if (b) {
            System.out.println(str + " is Palindrome");
        } else {
            System.out.println(str + " is not palindrome");
        }
    }

    // above with 2 counters, but below with only 1
    public static boolean isP(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < (chars.length / 2); i++) {
            if (chars[i] != chars[(chars.length - i - 1)])
                return false;
        }
        return true;
    }

    @Test
    public void usingStatck() {
        //TODO
        /*
        * Find the length of the string say len. Now, find the mid as mid = len / 2.
Push all the elements till mid into the stack i.e. str[0…mid-1].
If the length of the string is odd then neglect the middle character.
Till the end of the string, keep popping elements from the stack and compare them with the current character i.e. string[i].
If there is a mismatch then the string is not a palindrome. If all the elements match then the string is a palindrome.
        * */
    }
}
