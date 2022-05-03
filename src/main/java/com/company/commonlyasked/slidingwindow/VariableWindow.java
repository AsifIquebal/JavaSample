package com.company.commonlyasked.slidingwindow;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class VariableWindow {
    @Test
    public void test01(){
        System.out.println(getLongestUniqueCharacterSubstring("ABCDEFF")); //ABCDEF
        System.out.println(getLongestUniqueCharacterSubstring("AABCDEF")); //ABCDEF
        System.out.println(getLongestUniqueCharacterSubstring("CODINGISAWESOME")); //NGISAWE
    }

    public String getLongestUniqueCharacterSubstring(String input) {
        Map<Character, Integer> visited = new HashMap<>();
        String output = "";
        for (int i = 0, j = 0; j < input.length(); j++) {
            char currChar = input.charAt(j);
            if (visited.containsKey(currChar)) {
                i = Math.max(visited.get(currChar)+1, i);
                //System.out.println("end: " + j + ", start: " + i);
                //System.out.println(visited);
            }
            if (output.length() < j - i + 1) {
                output = input.substring(i, j + 1);
            }
            visited.put(currChar, j);
        }
        //System.out.println(visited);
        return output;
    }
}
