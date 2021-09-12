package com.company.commonlyasked.strings;

import org.testng.annotations.Test;

public class RemoveAllWhiteSpace {


    @Test
    public void m1(){
        String s = "Demo World. This is a text. "; //HelloWorld.Thisisatext.
        System.out.println(s.replaceAll("\\s+",""));
    }

    @Test
    public void m2(){
        String s = "Demo (World).";
        System.out.println(s.replaceAll("[^a-zA-Z ]","")); //Demo World
    }


}
