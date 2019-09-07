package com.company.lambda;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {

    @Test
    public void test01() {
        Function<Integer, Integer> f = i -> i * i;
        System.out.println("square of 4: " + f.apply(4));

        Function<String, Integer> f1 = s -> s.length();
        System.out.println(f1.apply("Hello World"));
    }

    @Test
    public void test02() {
        Function<Integer, Integer> f1 = i -> 2 * i;
        Function<Integer, Integer> f2 = i -> i * i;

        System.out.println(f1.andThen(f2).apply(2));
    }

    @Test
    public void test03() {

        List<Persons> personsList = Arrays.asList(
                new Persons("Picasso", "Bhowmick", 32, "Kolkata"),
                new Persons("Asif", "Sarkar", 33, "Pune"),
                new Persons("Sudip", "Paul", 31, "Kolkata"),
                new Persons("Amlan", "Chackroborty", 30, "Siliguri"),
                new Persons("Manish", "Agarwal", 29, "Siliguri")
        );


    }
}

