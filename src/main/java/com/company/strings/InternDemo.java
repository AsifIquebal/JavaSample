package com.company.strings;

import org.testng.annotations.Test;

public class InternDemo {

    @Test
    public void demo1() {
        // S1 refers to Object in the Heap Area
        String s1 = new String("GFG");
        // S2 refers to Object in the Heap Area
        String s2 = s1.intern();
        System.out.println(s1 == s2);// false
        // S3 refers to Object in the SCP Area
        String s3 = "GFG";
        System.out.println(s2 == s3); //true
    }

    @Test
    public void demo2(){
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
