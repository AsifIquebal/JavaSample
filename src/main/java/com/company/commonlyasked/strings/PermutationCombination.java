package com.company.commonlyasked.strings;

import org.testng.annotations.Test;

/**
 * Created by user on 21-May-17.
 */
public class PermutationCombination {

    public static void main(String[] args) {
        String string = "AB";
        permutation(string);
    }

    public static void permutation(String str) {
        permutation("", str);
    }

    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0)
            System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
        }
    }

    @Test
    public void test01_combinations() {
        String input_str = "ABCD";
        for (int i = 0; i < input_str.length(); i++) {
            String x = "";
            for (int j = i + 1; j <= input_str.length(); j++) {
                x = input_str.substring(i, j);
                System.out.println(x);
            }
        }
    }


}
