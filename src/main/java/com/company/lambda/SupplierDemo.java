package com.company.lambda;

import org.testng.annotations.Test;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {

    @Test
    public void test01(){
        Supplier<Date> s = ()->new Date();

        System.out.println(s.get());
    }

    @Test
    public void test02(){
        Supplier<String> s = ()->{
            String otp = "";
            for (int i=0; i<6; i++){
                otp = otp + (int)(Math.random()*10);
            }
            return otp;
        };
        System.out.println(s.get());
    }
}
