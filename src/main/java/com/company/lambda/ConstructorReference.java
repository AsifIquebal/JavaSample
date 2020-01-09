package com.company.lambda;

import org.testng.annotations.Test;

public class ConstructorReference {

    @Test
    public void test01() {
        ZInterface z = Sample::new;
        Sample s1 = z.get();
        Sample s2 = z.get();
    }

}

interface ZInterface {
    public Sample get();
}

class Sample {

    Sample() {
        System.out.println("Constructor called...");
    }
}