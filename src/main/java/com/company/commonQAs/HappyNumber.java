package com.company.commonQAs;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {


    /*
    * A number which leaves 1 as a result after a sequence of steps and in each step number is replaced
    * by the sum of squares of its digit.
    * For example, if we check whether 23 is a Happy Number, then sequence of steps are
    Step 1: 2×2+3×3 = 4+9 = 13 // Sum of square of each digit
    Step 2: 1×1+3×3 = 1+9 = 10
    Step 3: 1×1+0x0 = 1 (A Happy Number)
    *
    *
    * */

    @Test
    public void abc() {
        int num = 23;
        int sum;
        Set<Integer> numbers = new HashSet<>();
        while (numbers.add(num)) {
            sum = 0;
            while (num > 0) {
                sum = sum + (num % 10) * (num % 10);
                num = num / 10;
            }
            num = sum;
            System.out.println("Num at end of outer loop: " + num);
        }
        System.out.println((num == 1) ? "Happy Number" : "Not a Happy Number");
    }

}