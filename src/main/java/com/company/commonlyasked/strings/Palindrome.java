package com.company.commonlyasked.strings;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {

    @Test
    public void test1() {
        String input = "This noon, Anna drove the racecar.";
        String[] strings = input.split("\\W");

        List<String> palindromicWord = new ArrayList<>();
        for (String string : strings) {
            if (string.equalsIgnoreCase(getReverseString(string)) && !string.isEmpty()) {
                palindromicWord.add(string);
            }
        }
        System.out.println("Total Palindromic word count: " + palindromicWord.size() + " " + palindromicWord);
    }

    public String getReverseString(String str) {
        StringBuilder string = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            string.append(chars[i]);
        }
        return string.toString();
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


    @Test
    public void usingStatck(){
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
