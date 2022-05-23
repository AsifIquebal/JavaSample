package com.company.commonlyasked;


import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LetterCases {

    public static void main(String[] args) {
        System.out.println(checkRightUsageOfUpperCase("INDIA"));
        System.out.println(checkRightUsageOfUpperCase("India"));
        System.out.println(checkRightUsageOfUpperCase("india"));
        System.out.println(checkRightUsageOfUpperCase("IndiA"));
    }

    private static boolean checkRightUsageOfUpperCase(String s) {
        char[] letters = s.toCharArray();
        long count = 0;
        /*for (char x : letters) {
            if (('Z' - x) >= 0) {
                count++;
            }
        }*/
        /*The codePoints() method of IntStream class is used to get a stream of code point values from the given
        sequence. It returns the ASCII values of the characters passed as an argument
        * */
        count = s.codePoints().filter(c -> c >= 'A' && c <= 'Z').count();
        //
        s.chars().filter(c -> Character.isUpperCase(c)).count();

        System.out.println(count);
        return count == 0 ||
                (count == 1 && 'Z' - (s.charAt(0)) >= 0) ||
                (count == s.length());

    }

    @Test
    public void test02() {
        String s = "India";
        Stream<Character> characterStream = s.chars().mapToObj(x -> (char) x);
        //long count = characterStream.filter(e -> Character.isUpperCase(e)).count();
        //System.out.println(count);
        characterStream.forEach(e -> {
            System.out.println(e);
        });
    }

    /*if (Character.isUpperCase(e)) {
        System.out.println(e + "upper case");
    } else {
        System.out.println(e + "lower case");
    }*/




}
