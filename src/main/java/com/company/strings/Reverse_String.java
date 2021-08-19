package com.company.strings;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reverse_String {
    public static void main(String[] args) {
        String input;
        System.out.printf("Enter a String: ");
        Scanner read_input = new Scanner(System.in);
        input = read_input.next();
        System.out.println("You have entered: " + input);
        Reverse_String object1 = new Reverse_String();
        object1.reverse_method1(input);
        object1.reverse_method2(input);
        read_input.close();
        StringBuffer stringBuffer = new StringBuffer(input);
        object1.usingStringBuffer(stringBuffer);
        StringBuilder stringBuilder = new StringBuilder(input);
        object1.usingStringBuilder(stringBuilder);
    }

    public void reverse_method1(String input) {
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }
        System.out.printf("Reverse of %s is: %s", input, reverse);
        System.out.println("");
    }

    public void reverse_method2(String string) {
        char[] chars = string.toCharArray();
        String a = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            a = a + chars[i];
        }
        System.out.println("Test  " + a);
    }

    @Test
    public void reverseUsingStringBuffer() {
        reverse_method3("Demo World");
    }

    public void reverse_method3(String string) {
        char[] chars = string.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = chars.length - 1; i >= 0; i--) {
            sb.append(chars[i]);
        }
        System.out.println("Test  " + sb);
    }

    public void usingStringBuffer(StringBuffer s) {
        System.out.println("StringBuffer is mutable and has the reverse method: " + s.reverse());
    }

    public void usingStringBuilder(StringBuilder s) {
        System.out.println("StringBuilder is also mutable, but it is not synchronized as StringBuffer " +
                "and has the reverse method: " + s.reverse());
    }

    @Test
    public void printInReverse() {
        String s = "Hello World!";
        String[] strings = s.split("\\s");
        String[] result = new String[strings.length];
        int j = 0;
        for (int i = strings.length - 1; i >= 0; i--) {
            result[j] = strings[i];
            j++;
        }
        System.out.println("-----------" + String.join(" ", result)); //Sarkar Asif
        for (int i = 0; i <= result.length - 1; i++) {
            StringBuffer sb = new StringBuffer(result[i]).reverse();
            result[i] = sb.toString();
        }
        System.out.println(String.join(" ", result)); //rakraS fisA
    }

    @Test
    public void printInReverse1() {
        String s = "1space 2space  3space   word4";
        String pattern = "\\s+";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(s);
        List<String> list = new ArrayList<>();
        while (m.find()) {
            String s1 = m.group();
            list.add(s1);
            //System.out.println("...." + m.group());
        }
        //System.out.println(list.size());
        String[] s2 = s.split("\\s+");
        //System.out.println("..............."+s2.length);
        //System.out.println(list.get(1).toCharArray().length);
        for (int i = s2.length - 1; i >= 0; i--) {
            System.out.print(s2[i]);
            if (i >= 1) {
                System.out.print(list.get(i - 1));
            }
        }
    }

    @Test
    public void test_01() {
        String str = "Hello World!";
        String a[] = str.split(" ");
        String x = "";
        for (int i = 0; i < a.length; i++) {
            String s = a[i];
            String rev = "";
            for (int j = s.length() - 1; j >= 0; j--) {
                rev = rev + s.charAt(j);
            }
            x = x + " " + rev;
        }
        System.out.println("Original: " + str);
        System.out.println("Words reverse: " + x);
    }

    @Test
    public void usingSwap() {
        String str = "Hello World!";
        char[] s = str.toCharArray();
        int n = s.length;
        int halfLength = n / 2;
        for (int i = 0; i < halfLength; i++) {
            char temp = s[i];
            s[i] = s[n - 1 - i];
            s[n - 1 - i] = temp;
        }
        System.out.println(new String(s));
    }

}
