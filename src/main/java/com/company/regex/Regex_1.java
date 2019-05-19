package com.company.regex;

import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_1 {
    @Test
    public void test1(){
        String text = "My mobile number is 7504187461 Code for India is +91";
        Pattern pattern = Pattern.compile("(\\s)(\\d+)");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println("Match: " + matcher.group(2));
        }
    }

    @Test
    public void test2(){
        String text = "My mobile number is 7504187461 Code for India is +91";
        Pattern pattern = Pattern.compile("(\\s)(\\d+)");// this matches the phone number with the space placed in-front
        // of it
        Matcher m1 = pattern.matcher(text);
        while (m1.find()) {
            System.out.println("Match: " + m1.group());
        }

        System.out.println("-----------------------------------------------------------------------------");
        String line = "This order was placed for QT3000! OK?";
        String pattern1 = "(.*)(\\d+)(.*)";
        // Create a Pattern object
        Pattern r1 = Pattern.compile(pattern1);
        // Now create matcher object.
        Matcher m2 = r1.matcher(line);
        if (m2.find()) {
            System.out.println("Found value: " + m2.group(0));	//group 0 is a special group, which always represents the entire
            //expression. This group is not included in the total reported
            //by groupCount.
            System.out.println("Found value: '" + m2.group(1)+"'."+" Starts at: '"+m2.start()+"' & Ends at: '"+m2.end()+"'");
            System.out.println("Found value: '" + m2.group(2)+"'."+" Starts at: '"+m2.start()+"' & Ends at: '"+m2.end()+"'");
            System.out.println("Found value: '" + m2.group(3)+"'."+" Starts at: '"+m2.start()+"' & Ends at: '"+m2.end()+"'");
        } else {
            System.out.println("NO MATCH");
        }
        System.out.println("-----------------------------------------------------------------------------");
        String Str = "Welcome to Selenium Web Driver";
        if (Str.matches("(.*)Selenium(.*)") == true) {
            System.out.println("Hi");
            System.out.println(Str.matches("(.*)Selenium(.*)"));
        } else {
            System.out.println("Not found");
        }
    }

}