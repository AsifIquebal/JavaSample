package com.company.lambda;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateDemo {

    @Test
    public void test1(){
        Predicate<Integer> predicate = i -> i%2==0;
        System.out.println(predicate.test(21));
    }

    @Test
    public void test2(){
        List<Persons> personsList = Arrays.asList(
                new Persons("Picasso", "Bhowmick", 32,"Kolkata"),
                new Persons("Asif", "Sarkar",33,"Pune"),
                new Persons("Sudip", "Paul", 31,"Kolkata"),
                new Persons("Amlan", "Chackroborty", 30,"Siliguri"),
                new Persons("Manish", "Agarwal", 29,"Siliguri")
        );
        Predicate<Persons> predicate1 = p -> p.getName().startsWith("A") && p.getAge()>32;
        for (Persons p: personsList) {
            if(predicate1.test(p)){
                System.out.println(p.getName());
            }
        }
    }

    @Test
    public void predicateJoing(){
        List<Persons> personsList = Arrays.asList(
                new Persons("Picasso", "Bhowmick", 32,"Kolkata"),
                new Persons("Asif", "Sarkar",33,"Pune"),
                new Persons("Sudip", "Paul", 31,"Kolkata"),
                new Persons("Amlan", "Chackroborty", 30,"Siliguri"),
                new Persons("Manish", "Agarwal", 29,"Siliguri")
        );
        Predicate<Persons> predicate1 = p -> p.getName().startsWith("A") ;
        Predicate<Persons> predicate2 = p -> p.getLocation().equalsIgnoreCase("Siliguri");

        for (Persons p: personsList) {
            if(predicate1.and(predicate2).test(p)){
                System.out.println("Predicate AND example");
                System.out.println(p.getName());
            }
        }
        System.out.println("----------------------------------------------");
        for (Persons p: personsList) {
            if(predicate1.or(predicate2).test(p)){
                System.out.println("Predicate OR example");
                System.out.println(p.getName());
            }
        }
        System.out.println("----------------------------------------------");
        for (Persons p: personsList) {
            if(predicate1.negate().test(p)){
                System.out.println("Predicate negate example");
                System.out.println(p.getName());
            }
        }
    }

    @Test
    public void test4(){
        Integer[] x = {0,5,10,15,20,25,30,35};
        Predicate<Integer> p1 = i-> i%2==0;
        Predicate<Integer> p2 = i-> i>10;

        Arrays.stream(x).filter(p1.and(p2)).forEach(System.out::println);

    }

    @Test
    public void test05(){
        BiPredicate<Integer, Integer> p = (a,b) -> (a+b)%2==0;
        System.out.println(p.test(10,20));
        System.out.println(p.test(15,10));
    }

    @Test
    public void test06(){
        int[] x = {0,5,10,15,20,25,30,35};
        IntPredicate p = i->i%2==0;

        Arrays.stream(x).filter(p).forEach(System.out::println);
    }

}
