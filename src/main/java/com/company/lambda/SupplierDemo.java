package com.company.lambda;

import org.testng.annotations.Test;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {

    public void print(Supplier<String> text) {
        System.out.println(text.get());
    }

    @Test
    public void test03() {
        //Pass lambdas to the print counter.
        //Each returns an String.
        print(() -> "Hello");
        print(() -> "World!");
    }

    @Test
    public void test01() {
        Supplier<Date> s = () -> new Date();
        System.out.println(s.get());
    }

    @Test
    public void test02() {
        Supplier<String> s = () -> {
            String otp = "";
            for (int i = 0; i < 6; i++) {
                otp = otp + (int) (Math.random() * 10);
            }
            return otp;
        };
        System.out.println(s.get());
    }

}
