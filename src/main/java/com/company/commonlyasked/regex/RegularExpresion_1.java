package com.company.commonlyasked.regex;

import org.testng.annotations.Test;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpresion_1 {
    public static void main(String args[]) {
        // String to be scanned to find the pattern.
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(.*)(\\d+)(.*)";
        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);
        // Now create matcher object.
        Matcher m = r.matcher(line);

        System.out.println("Total Groups present [groupCount method]: " + m.groupCount());
        if (m.find()) {
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));


        } else {
            System.out.println("NO MATCH");
        }
    }

    @Test
    public void test2() {
        String a = "Asif(01)";
        String b = a.replaceAll("[^a-zA-Z]", "");
        System.out.println(b);
        System.out.println("Gaurav J(01)".replaceAll("[^a-zA-Z]", ""));
        System.out.println("Gaurav J(01)".replaceAll("[^a-zA-Z\\s]", ""));
    }

    @Test
    public void test3() {
        Pattern p = Pattern.compile("-?\\d+");
        Matcher m = p.matcher("There are more than -2 and less than 12 numbers here");
        int i = 0;
        while (m.find()) {
            System.out.println(i);
            System.out.println(m.group());
            i++;
        }
    }

    @Test
    public void maskAllExceptLast4Characters(){
        String str = "4DR534D&234dfrt234";
        System.out.println(str.replaceAll(".(?=.{4})", "X"));
    }

    @Test
    public void splitOnNonWordChars(){
        String str = "India is great. I am an Indian. India is my country. India will be on zero net emission by 2070";
        List<String> words = List.of(str.split("\\W+"));
        for(String word : words){
            System.out.println(word);
        }
    }


}
