package com.company.commonlyasked.strings;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReverseStringProblems {

    @Test
    public void tes01_twoPointer(){
        String str = "Kolkata";
        if(str == null || str.isEmpty()){
            //System.out.println();
            //return str;
        }
        char[] characters = str.toCharArray();
        int i = 0;
        int j = characters.length - 1;
        while (i < j) {
            swap(characters, i, j);
            i++;
            j--;
        }
        System.out.println(Arrays.toString(characters));
    }

    private void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

    @Test
    public void test01() {
        String input;
        System.out.printf("Enter a String: ");
        Scanner read_input = new Scanner(System.in);
        input = read_input.next();
        System.out.println("You have entered: " + input);
        ReverseStringProblems object1 = new ReverseStringProblems();
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
        System.out.println("StringBuffer is mutable, Synchronized and has the reverse method: " + s.reverse());
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

    @Test
    public void usingTwoPointer() {
        String str = " this is a beautiful world!";
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            System.out.println("i: " + i);
            if (str.charAt(i) == ' ') {
                continue;
            }
            int start = i;
            while (i < str.length() && str.charAt(i) != ' ') {
                i++;
            }
            System.out.println("start: " + start + ", end: " + i);
            if (stringBuilder.length() == 0) {
                stringBuilder.insert(0, str.substring(start, i));
            } else {
                stringBuilder.insert(0, ' ').insert(0, str.substring(start, i));
            }
        }
        System.out.println(stringBuilder);

    }

    @Test
    public void abc() {
        String s = "How are you" + " ";
        StringBuilder rev = new StringBuilder();
        StringBuilder word = new StringBuilder(" ");
        char ch;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            ch = s.charAt(i);
            if (ch != ' ') {
                word.append(ch);
            } else {
                rev.insert(0, word + " ");
                word = new StringBuilder(" ");
            }
            System.out.println("word: " + word + ", rv: " + rev);
        }
        System.out.println(rev);
    }
}
