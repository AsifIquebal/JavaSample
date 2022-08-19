package com.company.commonlyasked;

import org.testng.annotations.Test;

public class InterviewSet_String02 {

    public String reverseRecursively(String str) {
        if (str.length() < 2) {
            return str;
        }
        //return str.charAt(0) + reverseRecursively(str.substring(1));
        return reverseRecursively(str.substring(1)) + str.charAt(0);
    }

    @Test
    public void test01() {
        System.out.println(reverseRecursively("hello world"));
        r2("another");
    }

    public void r2(String str) {
        if ((str == null) || (str.length() <= 1)) {
            System.out.println(str);
        } else {
            System.out.print(str.charAt(str.length() - 1));
            r2(str.substring(0, str.length() - 1));
        }
    }
}
