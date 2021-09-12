package com.company.commonlyasked;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = scanner.next();
        Character c;
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for (int i=0;i < s.length();i++)
        {
            c = s.charAt(i);
            if(map.containsKey(c))
            {
                // increment count corresponding to c
                map.put(  c ,  map.get(c) +1 );
            }
            else
            {
                map.put( c , 1 ) ;
            }
        }
        System.out.println(map);
        // Search map in order of string str
        for (int i =0 ; i < s.length() ; i++ )
        {
            c = s.charAt(i);
            if( map.get(c)  == 1 ){
                System.out.println("The Character is: " + c);
                break;
            }
        }
    }
}
