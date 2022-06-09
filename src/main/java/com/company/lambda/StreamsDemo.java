package com.company.lambda;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.testng.AssertJUnit.assertEquals;

public class StreamsDemo {

    @Test
    public void reduceExample(){
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // 1st argument, init value = 0
        System.out.println(Arrays.stream(numbers).reduce(0, (a, b) -> a + b));
        OptionalInt sum1 = Arrays.stream(numbers).reduce((a, b) -> a + b);
        System.out.println(sum1.isEmpty());//false

        System.out.println(Arrays.stream(numbers).reduce(0, (a, b) -> a > b ? a : b));  // 10
        System.out.println(Arrays.stream(numbers).reduce(0, Integer::max));            // 10

        System.out.println(Arrays.stream(numbers).reduce(0, (a, b) -> a < b ? a : b));  // 0
        System.out.println(Arrays.stream(numbers).reduce(0, Integer::min));
    }

    @Test
    public void test01() {
        List<String> list = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl", "");
        System.out.println("List: " + list);

        long count = list.stream().filter(string -> string.isEmpty()).count();
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

        List<Integer> integers = Arrays.asList(1, 2, 13, 4, 15, 6, 17, 8, 19);
        System.out.println("List: " + integers);

        IntSummaryStatistics stats = integers.stream().mapToInt((x) -> x).summaryStatistics();

        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());
        System.out.println("Average of all numbers : " + stats.getAverage());
        System.out.println("Random Numbers: ");
        Random random = new Random();
        random.ints().limit(10).sorted().forEach(System.out::println);
    }

    @Test
    public void test02_peek() {
        List<String> result = Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());
        System.out.println(result);
    }

    @Test
    public void test03_distinct() {
        List<Integer> result = Stream.of(1, 2, 3, 4, 1, 2, 3)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(result);
    }

    @Test
    public void test04_limit() {
        List<Integer> result = Stream.of(1, 2, 3, 4, 1, 2, 3)
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(result);
    }

    @Test
    public void whenFlatMapEmployeeNames_thenGetNameStream() {
        List<List<String>> namesNested = Arrays.asList(
                Arrays.asList("Jeff", "Bezos"),
                Arrays.asList("Bill", "Gates"),
                Arrays.asList("Mark", "Zuckerberg"));

        List<String> namesFlatStream = namesNested.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        assertEquals(namesFlatStream.size(), namesNested.size() * 2);
    }

    @Test
    public void whenIncrementSalaryUsingPeek_thenApplyNewSalary() {
        Employee[] arrayOfEmps = {
                new Employee("Jeff Bezos", 15),
                new Employee("Bill Gates", 25),
                new Employee("Mark Zuckerberg", 35)
        };

        List<Employee> empList = Arrays.asList(arrayOfEmps);

        empList.stream()
                .peek(e -> e.salaryIncrement(5))
                .peek(System.out::println)
                .collect(Collectors.toList());

    }

    @Test
    public void puzzle01() {
        Stream.of("d2", "e2", "a2", "b1", "b3", "c")
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .anyMatch(s -> {
                    System.out.println("anyMatch: " + s);
                    return s.startsWith("A");
                });
    }

    @Test
    public void puzzle02() {
        Stream.of("d2", "a2", "b1", "b3", "c")
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .anyMatch(s -> {
                    System.out.println("anyMatch: " + s);
                    return s.startsWith("D");
                });
    }

    @Test
    public void test03() {
        List<Integer> l = Arrays.asList(1, 2, 13, 4, 15, 6, 17, 8, 19);
        System.out.println("List: " + l);
        l.stream().forEach(System.out::println);
        Integer[] a = l.stream().toArray(Integer[]::new);
        Arrays.stream(a).forEach(System.out::println);
        Stream.of(a).forEach(System.out::println);
    }

    @Test
    public void streamToList() {
        Stream<String> countriesStream = Stream.of("India", "China", "France", "Germany");
        List<String> listOfCountiesName = countriesStream.collect(Collectors.toList());
        System.out.println(listOfCountiesName);
    }

    @Test
    public void flatMapTest() {
        List<List<Integer>> number = new ArrayList<>();
        number.add(Arrays.asList(1, 2));
        number.add(Arrays.asList(3, 4));
        number.add(Arrays.asList(5, 6));
        number.add(Arrays.asList(7, 8));
        System.out.println("List of list-" + number);
        // using flatmap() to flatten this list
        List<Integer> flatList
                = number.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());
        System.out.println("List generate by flatMap :" + flatList);
    }

    @Test
    public void createParallelStream_whenFindAnyResultIsPresent_thenCorrect() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> result = list
                .stream().parallel()
                .filter(num -> num < 4).findAny();
        Assert.assertTrue(result.isPresent());
        result.stream().forEach(System.out::println);//3
    }

    @Test
    public void createStream_whenFindFirstResultIsPresent_thenCorrect() {
        List<String> list = Arrays.asList("A", "B", "C", "D");
        Optional<String> result = list.stream().findFirst();
        Assert.assertTrue(result.isPresent());
        //assertThat(result.get(), is("A"));
    }

    @Test
    public void test938() {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13);
        int primeGreaterThanFive = primes.stream()
                .peek(num -> System.out.println("will filter " + num))
                .filter(x -> x > 5)
                .findFirst()
                .get();
        System.out.println(primeGreaterThanFive);
        List<String> collect = Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());

    }

    @Test
    public void oddEven() {
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        ints.forEach(i -> {
            if (i % 2 == 0) {
                System.out.println(i + ": even ");
            } else {
                System.out.println(i + ": odd ");
            }
        });
    }

}
