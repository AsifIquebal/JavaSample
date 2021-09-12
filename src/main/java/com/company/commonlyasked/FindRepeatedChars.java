package com.company.commonlyasked;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by user on 21-Dec-16.
 */
public class FindRepeatedChars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = scanner.next();
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                int cnt = map.get(c);
                map.put(c, ++cnt);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map);
    }
}
