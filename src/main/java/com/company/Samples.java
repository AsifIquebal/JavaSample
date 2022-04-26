package com.company;

import org.testng.annotations.Test;

public class Samples {

    @Test
    public void test01_hashCode(){
        Integer i = 10;
        System.out.println(i.hashCode());// the value
        Character c = 'a';
        System.out.println(c.hashCode()); // the ASCII code
        String a = "Asif";
        System.out.println(a.hashCode());
    }

    @Test
    public void test02_Infinity(){
        System.out.println("==========================================");
        float negativeInfUsingFloat = Float.NEGATIVE_INFINITY;
        System.out.println(negativeInfUsingFloat);
        float positiveInfUsingFloat = Float.POSITIVE_INFINITY;
        System.out.println(positiveInfUsingFloat);
        System.out.println("==========================================");
        double negativeInfUsingDouble = Double.NEGATIVE_INFINITY;
        System.out.println(negativeInfUsingDouble);
        double positiveInfUsingDouble = Double.POSITIVE_INFINITY;
        System.out.println(positiveInfUsingDouble);
        System.out.println("==========================================Operations with Infinity");
        double positiveInf = Double.POSITIVE_INFINITY;
        double negativeInf = Double.NEGATIVE_INFINITY;
        System.out.println(positiveInf - negativeInf);
        System.out.println(negativeInf - positiveInf);
        System.out.println(positiveInf + negativeInf);
        System.out.println("==========================================Print Infinity");
        double num = 100.0/0.0;
        System.out.println(num);
        double num2 = -10.0/0.0;
        System.out.println(num2);
    }
}
