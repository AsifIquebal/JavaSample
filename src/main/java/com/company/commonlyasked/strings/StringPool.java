package com.company.commonlyasked.strings;

import org.testng.annotations.Test;

public class StringPool {


    @Test
    public void t1(){
        String s1 = new String("Asif");
        String s2 = "Sarkar";

        String s3 = s1.intern();
        String s4 = s2.intern();


        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        System.out.println(s2==s4);
        System.out.println(s2.equals(s4));

        System.out.println(s1.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s3);
        System.out.println(s2.hashCode());
        System.out.println(s4.hashCode());
    }

    @Test
    public void t2(){
        String s1 = "Test";
        String s2 = "Test";
        String s3 = new String("Test");
        final String s4 = s3.intern();
        /*System.out.println(s1 == s2);
        System.out.println(s2 == s3);*/
        System.out.println(s3 == s4);
        /*System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s3));*/
    }


}
