package com.company.commonlyasked.strings;

import org.testng.annotations.Test;

public class InternDemo {

    @Test
    public void test01() {
        String str1 = new String("Java");
        String str2 = new String("Java");
        System.out.println(str1 == str2);//false
        String str3 = str1.intern();
        String str4 = str2.intern();
        System.out.println(str3 == str4);//true

        String str5 = str1.concat("Hello");
        String str6 = str5.intern();
        System.out.println(str5 == str6);//true
    }

    @Test
    public void demo1() {
        // S1 refers to Object in the Heap Area
        String s1 = new String("GFG");
        // S2 refers to Object in the SCP Area
        String s2 = s1.intern();
        System.out.println(s1 == s2);// false
        // S3 refers to Object in the SCP Area
        String s3 = "GFG";
        System.out.println(s2 == s3); //true
    }

    @Test
    public void demo2() {
        // S1 refers to Object in the Heap Area
        String s1 = new String("GFG");
        // S2 refers to Object in the Heap Area
        String s2 = s1.concat("GFG");
        // S3 refers to Object in the Heap Area
        String s3 = s2.intern();
        System.out.println(s2 == s3);//true
        // S4 refers to Object in the SCP Area
        String s4 = "GFGGFG";
        System.out.println(s3 == s4);//true
    }
}
