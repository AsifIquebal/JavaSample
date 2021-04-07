package com.company.ds.array;

import org.testng.annotations.Test;

import java.util.Arrays;

public class FindTheFirstRepeatingCharacter {


    @Test
    public void test_01() {

        String str = "abcabcd";
        char[] arr = str.toCharArray();

        System.out.println(str.charAt(0)-'a');
        System.out.println(str.charAt(1)-'a');
        System.out.println(arr[str.charAt(1)-'a']);

        int[] frequencyArray = new int[str.length()];

        for (int i = 0; i < arr.length; i++) {
            frequencyArray[arr[i]-'a'] += 1;
        }
        System.out.println(Arrays.toString(frequencyArray));
        for (int i =0; i<arr.length;i++){
            if(frequencyArray[arr[i]-'a']==1){
                System.out.println("First Non Repeating character is: " + arr[i]);
                break;
            }
        }
    }

}
