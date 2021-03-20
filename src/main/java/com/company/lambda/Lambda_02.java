package com.company.lambda;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda_02 {

    @Test
    public void count_empty_strings() {
        List<String> list = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
        long count = list.stream().filter(x -> x.isEmpty()).count();
        System.out.printf("List %s has %d empty strings %n", list, count);
    }

    @Test
    public void check_length_of_string_elements() {
        List<String> list = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
        long count = list.stream().filter(x -> x.length() >= 3).count();
        System.out.println("Elements of specified length: " + count);//3
    }

    @Test
    public void fetch_non_empty_strings() {
        List<String> list = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
        List<String> l = list.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
        System.out.println("Non Empty String list: " + l);
    }

    @Test
    public void map_01() {
        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
        String G7Countries = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
        System.out.println(G7Countries);
    }

    @Test
    public void map_02() {
        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
        G7.stream().map(x -> x.toLowerCase()).forEach(System.out::println);
        G7.stream().map(x -> x.toLowerCase()).forEach(x -> System.out.print(x.charAt(0)));
    }

    @Test
    public void forEach_01() {
        List<String> list = Arrays.asList("PICASSO", "ASIF", "SUDIP", "AMLAN", "MANISH");
        list.stream().map(str -> str.length()).forEach(System.out::println);
        list.forEach(x -> System.out.print(x.charAt(0)));//PASAM
    }

    @Test
    public void square_distinct_numbers() {
        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        List<Integer> distinct = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        System.out.println(distinct);//[81, 100, 9, 16, 49]
    }


    @Test
    public void test() {
        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
        Stream<String> stringStream = G7.stream();

        // Create an array
        Integer[] myArray = {1, 5, 8};
        // Convert it into a Stream
        Stream<Integer> integerStream = Arrays.stream(myArray);
    }

    @Test
    public void simpleFilter() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));

        Integer integer = numbers.stream()
                .filter(n -> n > 4)
                .filter(n -> n % 2 == 0)
                .findFirst()
                .get();
        System.out.println(integer);

    }


}
