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
        Function<Integer, Integer> f1 = i -> 2 * i;
        Function<Integer, Integer> f2 = i -> i * i;

        System.out.println(f1.compose(f2).apply(2));
    }

    @Test
    public void test04() {
        MyPersonInterface<String,String,Integer,String,Persons> m = (fName,lname, age, location) -> new Persons(fName,lname, age, location);

        List<Persons> personsList = Arrays.asList(
                m.myApply("Picasso", "Bhowmick", 32, "Kolkata"),
                m.myApply("Asif", "Sarkar", 33, "Pune"),
                m.myApply("Sudip", "Paul", 31, "Kolkata"),
                m.myApply("Amlan", "Chackroborty", 30, "Siliguri"),
                m.myApply("Manish", "Agarwal", 29, "Siliguri")
        );

        for (Persons p : personsList){
            System.out.println(p);
        }
    }
}

interface MyPersonInterface<T1,T2,T3,T4,R>{
    R myApply(T1 t1,T2 t2, T3 t3, T4 t4);
}
