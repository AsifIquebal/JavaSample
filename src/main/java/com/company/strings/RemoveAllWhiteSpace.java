package com.company.strings;

import org.testng.annotations.Test;

public class RemoveAllWhiteSpace {


    @Test
    public void m1(){
        String s = "Hello World. This is a text. "; //HelloWorld.Thisisatext.
        System.out.println(s.replaceAll("\\s+",""));
    }

    @Test
    public void m2(){
        String s = "Hello (World).";
        System.out.println(s.replaceAll("[^a-zA-Z ]","")); //Hello World
    }


}
