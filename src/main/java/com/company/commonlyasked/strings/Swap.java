package com.company.commonlyasked.strings;

import org.testng.annotations.Test;

import java.io.IOException;

public class Swap {
    @Test
    public void swapWithout3rdStringVariable() throws IOException {
        String a = "AAA";
        String b = "BBB";
        int len1 = a.length();
        a = a + b;
        //The substring begins at the specified beginIndex and extends to the character at index endIndex - 1.
        b = a.substring(0, len1);
        //The substring begins with the character at the specified index and extends to the end of this string.
        a = a.substring(len1);
        System.out.println("Strings After Swapping : ");
        System.out.println("1st String = " + a);
        System.out.println("2nd String = " + b);
    }

    @Test
    public void swap2() {
        String a = "a";
        String b = "bbb";
        System.out.println("Strings before swap: a = " + a + " and b = " + b);
        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());
        System.out.println("Strings after swap: a = " + a + " and b = " + b);
    }

    @Test
    public void swapIntegers() {
        int x = 10;
        int y = 20;
        System.out.println("Before swap:");
        System.out.println("x value: " + x);
        System.out.println("y value: " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swap:");
        System.out.println("x value: " + x);
        System.out.println("y value: " + y);
    }

    @Test
    public void test123() {
        System.out.println(Integer.valueOf("10"));
    }


}
