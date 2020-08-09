package com.company.reflection;

import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class Test_2 {

    @Test
    public void getTheMethodsOfStringClass(){
        Method m[] = String.class.getDeclaredMethods();
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i].toString());
        }
    }
}
