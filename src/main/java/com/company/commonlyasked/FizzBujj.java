package com.company.commonlyasked;

import org.testng.annotations.Test;

public class FizzBujj {

    @Test
    public void bestApproach() {
        int c3 = 0, c5 = 0;
        for (int i = 1; i <= 30; i++) {
            c3++;
            c5++;
            String d = "";
            if (c3 == 3) {
                d += "fizz";
                c3 = 0;
            }
            if (c5 == 5) {
                d += "buzz";
                c5 = 0;
            }
            if (d.equals("")) {
                System.out.println(i);
            } else {
                System.out.println(d);
            }
        }
    }

}
