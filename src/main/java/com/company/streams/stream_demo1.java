package com.company.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class stream_demo1 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl", "");
        System.out.println("List: " +list);

        System.out.println("Using Java 8: ");
        System.out.println("List: " +list);

        long count = list.stream().filter(string->string.isEmpty()).count();
        System.out.println("Empty Strings: " + count);
        long count1 = list.stream().filter(String::isEmpty).count();
        System.out.println("Empty Strings: " + count1);

        long count2 = list.stream().filter(elem -> elem.startsWith("a")).count();
        System.out.println("Count of Elements Starts with 'a': " + count2);

        count = list.stream().filter(string -> string.length() == 3).count();
        System.out.println("Strings of length 3: " + count);

        List<String> filtered = list.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println("Filtered List: " + filtered);

        String mergedString = list.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("Merged String: " + mergedString);

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        System.out.println("Squares List: " + squaresList);

        List<Integer> integers = Arrays.asList(1,2,13,4,15,6,17,8,19);
        System.out.println("List: " +integers);

        IntSummaryStatistics stats = integers.stream().mapToInt((x) ->x).summaryStatistics();

        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());
        System.out.println("Average of all numbers : " + stats.getAverage());
        System.out.println("Random Numbers: ");
        Random random = new Random();
        random.ints().limit(10).sorted().forEach(System.out::println);
    }


    // Collectors are used to combine the result of processing on the elements of a stream. Collectors can be used to return a list or a string.
    // The collect() method is one of the stream processing methods on the Stream interface. When this method is invoked, the filtering and mapping will take place and the object resulting from those actions will be collected
    // The ‘sorted’ method is used to sort the stream.
    // The ‘filter’ method is used to eliminate elements based on a criteria.
    // The ‘map’ method is used to map each element to its corresponding result.
    // By using map , you are transforming the object values .
    // The map operations allows us to apply a function, that takes in a parameter of one type, and returns something else.
    // Filter is used for filtering the data , it always returns the boolean value . If it returns true , the item is added to list else its filtered out (ignored)


}
