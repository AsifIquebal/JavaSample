package com.company.lambda;

import org.testng.annotations.Test;

public class ConstructorReference2 {

    @Test
    public void test01() {
        ZInterface2 z = Sample2::new;
        Sample2 s1 = z.get("R");
        Sample2 s2 = z.get("K");
    }

}

interface ZInterface2 {
    public Sample2 get(String s);
}

class Sample2 {

    Sample2(String s) {
        System.out.println("Constructor called...String value: " +s );
    }
}