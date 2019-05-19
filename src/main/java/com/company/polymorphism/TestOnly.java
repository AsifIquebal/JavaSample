package com.company.polymorphism;

import org.testng.annotations.Test;

public class TestOnly {

    public void m1(int i){
        System.out.println("Passed value: " + i);
    }

    private void m1(String s){
        System.out.println("Passed value: " + s);
    }


    @Test
    public void testNow(){
        TestOnly testOnly = new TestOnly();
        testOnly.m1(1);
        testOnly.m1("Asif");
    }
}
