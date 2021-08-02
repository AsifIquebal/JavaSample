package com.company.commonQAs;

import org.testng.annotations.Test;

public class WrapperClassDemo {
    @Test
    public void test01(){
        Integer n1 = new Integer(100);
        Integer n2 = new Integer(100);

        Integer n3 = 127;
        Integer n4 = 127;

        Integer n5 = 128;
        Integer n6 = 128;

        System.out.println(n1==n2);
        System.out.println(n3==n4);
        System.out.println(n5==n6);
    }
}
