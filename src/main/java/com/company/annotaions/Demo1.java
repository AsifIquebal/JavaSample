package com.company.annotaions;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@ interface TestAnnotation {
    String str1() default "India";
}

public class Demo1 {
    @TestAnnotation(str1="Asif")
    void fun1() {
        System.out.println("method 1");
    }
    @TestAnnotation(str1="Annotation Test")
    void fun2() {
        System.out.println("method 2");
    }
    public static void main(String args[]) throws NoSuchMethodException {
        System.out.println("Demo");
        //Demo h=new Demo();
        Demo1 demo1 = new Demo1();
        Method m = demo1.getClass().getMethod("fun2");
        //Method m=h.getClass().getMethod("sayHello");
        TestAnnotation testAnnotation = m.getAnnotation(TestAnnotation.class);
        //MyAnnotation manno=m.getAnnotation(MyAnnotation.class);
        System.out.println("value is: " + testAnnotation.str1());
    }
}
