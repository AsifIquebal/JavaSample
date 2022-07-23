package com.company.fileHandling;

import org.testng.annotations.Test;

import java.util.Map;

public class SystemProp {

    @Test
    public void test_01(){
        for (Map.Entry<?,?> e : System.getProperties().entrySet()) {
            System.out.println(String.format("%s = %s", e.getKey(), e.getValue()));
        }
    }

    @Test
    public void test_02(){
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("user.dir"));
    }


}
