package com.company.lambda;

import org.testng.annotations.Test;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionDemo {

    @Test
    public void function_01() {
        Function<Integer, Integer> f = i -> i * i;
        System.out.println("square of 4: " + f.apply(4));
    }

    @Test
    public void predicate_01() {
        Predicate<Integer> f = i -> i % 2 == 0;
        System.out.println("is 7 even: " + f.test(7));
        System.out.println("is 8 even: " + f.test(8));

    }
}

