package com.company.lambda;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsDemo3 {

    @Test
    public void createStream_whenFindAnyResultIsPresent_thenCorrect() {
        List<String> list = Arrays.asList("A", "B", "C", "D");
        Optional<String> result = list.stream().findAny();
        System.out.println("result.isPresent(): " + result.isPresent());
        System.out.println(result.get());
    }

    @Test
    public void createStream_whenFindFirstResultIsPresent_thenCorrect() {
        List<String> list = Arrays.asList("A", "B", "C", "D");
        Optional<String> result = list.stream().findFirst();
        System.out.println("result.isPresent(): " + result.isPresent());
        System.out.println(result.get());
    }
    @Test
    public void test01() {
        String[] alphabet = new String[]{"A", "B", "C"};
        String result = Arrays.stream(alphabet)
                .filter("x"::equalsIgnoreCase)
                .findAny()
                .orElse("none match");
        System.out.println(result);//none match
    }

    @Test
    public void test02(){
        String[] alphabet = new String[]{"A", "B", "C"};
        boolean result = Arrays.stream(alphabet)
                .filter("a"::equalsIgnoreCase)
                .count() > 0;
        System.out.println(result);
    }

    @Test
    public void test03(){
        String[] alphabet = new String[]{"A", "B", "C"};
        boolean result = Arrays.stream(alphabet)
                .anyMatch("a"::equalsIgnoreCase);
        System.out.println(result);
    }

    @Test
    public void test04(){
        String[] alphabet = new String[]{"A", "B", "C"};
        boolean result = Arrays.stream(alphabet)
                .allMatch("a"::equalsIgnoreCase);
        System.out.println(result);
    }
}
