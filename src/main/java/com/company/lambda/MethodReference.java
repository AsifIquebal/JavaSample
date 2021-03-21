package com.company.lambda;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MethodReference {

    //Traditional approach: just for understanding, logic is not full proff
    private static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    //Declarative approach
    /*private static boolean isPrime(int number) {
        return number > 1
                && IntStream.range(2, number).noneMatch(
                index -> number % index == 0);
    }*/

    @Test
    public void test_withoutMethodRef() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 4, 6, 8, 9, 17, 23));
        List<Integer> collect = numbers.stream()
                .filter(number -> IntStream.range(2, number).noneMatch(index -> number % index == 0))
                .collect(Collectors.toList());
        System.out.println(collect);
    }

    @Test
    public void test_withMethodRef() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 4, 6, 8, 9, 17, 23));
        List<Integer> collect = numbers.stream()
                .filter(MethodReference::isPrime)
                .collect(Collectors.toList());
        System.out.println(collect);
    }

}
