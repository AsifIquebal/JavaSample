package com.company.commonlyasked.strings;

import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindingWordInString {


    @Test
    public void getIndexMethod() {
        String s = "it is what it is";
        System.out.println("First occurrence of is : " + s.indexOf("is"));
        //str.indexOf("is", str.indexOf("is") + 1);
        System.out.println("Second occurrence of is: " + s.indexOf("is", s.indexOf("is") + 1));
    }

    @Test
    public void frequencyOfDuplicatesInAString() {
        String str = "India is great. I am an Indian. India is my country. India will be on zero net emission by 2070";
        List<String> words = List.of(str.split("\\W+"));
        System.out.println(words);
        // getting the unique words
        HashSet<String> uniqueWords = new HashSet<>(words);

        for (String word : uniqueWords) {
            if (Collections.frequency(words, word) > 1) {
                System.out.println(word + ": " + Collections.frequency(words, word));
            }
        }
    }

    @Test
    public void getIndex() {
        String s = "India is great. I am an Indian. India is my country. India is";
        String s2 = "India";

        int first = s.indexOf(s2);
        int second = s.indexOf(s2, first + 1);
        int third = s.indexOf(s2, second + 1);
        System.out.println(first + ", " + second + ", " + third);

        // get the desired index
        int occurrence = 4;
        int j = s.indexOf(s2);
        int n = 1;
        while (j >= 0) {
            System.out.println("------------------");
            System.out.println(n);
            j = s.indexOf(s2, j + 1);
            n++;
            if (n == occurrence) {
                break;
            }
        }
        System.out.println("Occurrence count [" + occurrence + "]: Index: " + j);
    }

    @Test
    public void demo() {
        String str = "x is x is x is x";
        int i = str.indexOf('x');
        while (i >= 0) {
            System.out.println(i);
            i = str.indexOf('x', i + 1);
        }
    }

    @Test
    public void countWordsUsingStringTokenizer() {
        String sentence = "I love India. India is a great country.";
        if (sentence == null || sentence.isEmpty()) {
            System.out.println("null or empty");
        } else {
            StringTokenizer tokens = new StringTokenizer(sentence);
            System.out.println(tokens.countTokens());
        }
    }

    @Test
    public void countWordsUsingJava8() {
        String str = "Lorem adipising ipsum dolor sit Lorem amet Consectetur adipising elit Lorem ipsum dolor";
        List<String> list = Stream.of(str).map(w -> w.split("\\s+")).flatMap(Arrays::stream)
                .collect(Collectors.toList());
        Map<String, Integer> wordCounter = list.stream()
                .collect(Collectors.toMap(w -> w.toLowerCase(), w -> 1, Integer::sum));
        System.out.println(wordCounter);
    }

    @Test
    public void sortWords() {
        String[] names = {"Rahul", "Ajay", "Gourav", "Riya"};
        Arrays.sort(names);
        System.out.println("The names in alphabetical order are: ");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        // brute force approach
        String text = "I am a Student, learning java";
        String[] words = text.split("\\W+");
        String temp;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].compareTo(words[j]) > 0) {
                    temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(words));
    }
}
