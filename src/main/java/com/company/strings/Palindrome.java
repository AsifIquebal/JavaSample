package com.company.strings;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {

    @Test
    public void test1(){
        String input = "This noon, Anna drove the racecar.";
        String[] strings = input.split("\\W");

        List<String> palindromicWord = new ArrayList<>();
        for (int i=0; i<strings.length; i++){
            if(strings[i].equalsIgnoreCase(getReverseString(strings[i])) && !strings[i].isEmpty()){
                palindromicWord.add(strings[i]);
            }
        }
        System.out.println("Total Palindromic word count: " + palindromicWord.size() +" " + palindromicWord);
    }

    public String getReverseString(String str){
        String string = "";
        char[] chars = str.toCharArray();
        for(int i=chars.length-1; i>=0; i--){
            string = string + chars[i];
        }
        return string;
    }
}
