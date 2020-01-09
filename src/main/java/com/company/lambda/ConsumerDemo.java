package com.company.lambda;

import org.testng.annotations.Test;

import java.util.function.Consumer;

public class ConsumerDemo {

    @Test
    public void test01(){
        Consumer<String> c = s-> System.out.println(s.length());
        c.accept("Asif");
    }

    @Test
    public void test02(){
        Consumer<String> c1 = s-> System.out.println(s.length());
        Consumer<String> c2 = s-> System.out.println(s.toLowerCase());
        Consumer<String> c3 = s-> System.out.println(s.indexOf("A"));

        c1.andThen(c2).andThen(c3).accept("Asif");

        System.out.println("\n");
        Consumer<String> cc = c1.andThen(c2).andThen(c3);
        cc.accept("Demo World");

    }





}
