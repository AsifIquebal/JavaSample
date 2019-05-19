package com.company.interfaces;

import org.testng.annotations.Test;

interface TestInterface1 {
    static void hello() {
        System.out.println("Welcome abroad..");
    }

    default String greeting() {
        return "Hello User...";
    }

    default void greeting2() {
        System.out.println("Hi Asif...");
    }
}

interface TestInterface2 {
    static void hello() {
        System.out.println("Welcome abroad..Interface2");
    }

    default String greeting() {
        return "Hello User...[Interface2 ]";
    }
}

interface TestInterface3 extends TestInterface1 {
    @Override
    default String greeting() {
        return "Hello User...";
    }
}

public class Demo1 implements TestInterface1, TestInterface2 {
    @Override
    public String greeting() {
        String a = TestInterface1.super.greeting();
        return a;
    }

    @Test
    public void test1() {
        Demo1 demo1 = new Demo1();
        System.out.println(demo1.greeting());
        demo1.greeting2();

        // Accessing the STATIC METHOD
        //System.out.println(TestInterface1.greeting()); // Not Allowed, as greeting is not a STATIC Method
        TestInterface1.hello();

        // Accessing the DEFAULT METHOD, we need an Object to call the DEFAULT METHOD
        TestInterface1 t1 = new Demo1();
        t1.greeting();
    }

}





