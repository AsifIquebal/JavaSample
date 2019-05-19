package com.company;

import org.testng.annotations.Test;

public class hashCodeDemo {

    @Test
    public void test1(){
        Integer i = 10;
        System.out.println(i.hashCode());// the value

        Character c = 'a';
        System.out.println(c.hashCode()); // the ASCII code

        String a = "Asif";
        System.out.println(a.hashCode());

    }

}
