package com.company.strings;

import org.testng.annotations.Test;

import java.util.StringTokenizer;

public class FindingWordInString {


    @Test
    public void getIndexMethod(){
        String s = "it is what it is";
        System.out.println("First occurrence of is : " + s.indexOf("is"));
        //str.indexOf("is", str.indexOf("is") + 1);
        System.out.println("Second occurrence of is: " + s.indexOf("is",s.indexOf("is")+1));
    }
    @Test
    public void getIndex(){
        String s = "India is great. I am an Indian. India is my country. India is";
        String s2 = "India";

        int first = s.indexOf(s2);
        int second = s.indexOf(s2, first + 1);
        int third = s.indexOf(s2, second + 1);
        System.out.println(first + ", " + second + ", " + third);

        // get the desired index
        int occurrence = 4;
        int j = s.indexOf(s2);
        int n=1;
        while(j >= 0) {
            System.out.println("------------------");
            System.out.println(n);
            j = s.indexOf(s2, j+1);
            n++;
            if(n==occurrence){
                break;
            }
        }
        System.out.println("Occurrence count [" + occurrence + "]: Index: " + j);
    }

    @Test
    public void demo(){
        String str = "x is x is x is x";
        int i = str.indexOf('x');
        while(i >= 0) {
            System.out.println(i);
            i = str.indexOf('x', i+1);
        }
    }

    @Test
    public void countWordsUsingStringTokenizer() {
        String sentence = "I love India. India is a great country.";
        if (sentence == null || sentence.isEmpty()) {
            System.out.println("null or empty");
        }else {
            StringTokenizer tokens = new StringTokenizer(sentence);
            System.out.println(tokens.countTokens());
        }
    }
}
