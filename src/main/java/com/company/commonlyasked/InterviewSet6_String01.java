package com.company.commonlyasked;

import org.testng.annotations.Test;

import java.util.*;

public class InterviewSet6_String01 {
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

    @Test
    public void testTwoStringAreAnagramOrNot() {
        simple("Keep", "Peek");
        simple("A", "b");
    }

    private void simple(String str1, String str2) {
        String s1 = str1.toLowerCase().replaceAll("\\s", "").replace("'", "");
        String s2 = str2.toLowerCase().replaceAll("\\s", "").replace("'", "");
        List<Character> characterList = new ArrayList<>();
        for (char ch : s1.toCharArray()) {
            characterList.add(ch);
        }
        System.out.println(characterList);
        for (char ch : s2.toCharArray()) {
            characterList.remove(Character.valueOf(ch));
        }
        if (characterList.isEmpty()) {
            System.out.println(str1 + " and " + str2 + ", are anagrams");
        } else {
            System.out.println(str1 + " and " + str2 + ", are not anagrams");
        }
    }

    @Test
    public void removeDuplicateChar() {
        char[] charArray = {'e', 'a', 'b', 'a', 'c', 'd', 'b', 'd', 'c', 'e'};
        String result = "";
        //char[] withOutDuplicateChars;
        //List<String> withDuplicateChars = new ArrayList<>();
        int k = 0;
        for (char c : charArray) {
            if (result.indexOf(c) == -1) {
                result = result + c;
                //withDuplicateChars[k++] = c;
            }
        }
        System.out.println(result.toCharArray());
        //System.out.println(Arrays.toString(withOutDuplicateChars));
    }

    @Test
    public void removeDuplicateIntegers(){
        int [] a = {1,2,2,6,3,2,1};//1,2,6,3
        Set<Integer> result = new LinkedHashSet<>();
        List<Integer> leftOver = new ArrayList<>();
        for (int j : a) {
            if(!result.contains(j)){
                result.add(j);
            } else {
                leftOver.add(j);
            }
        }
        System.out.println(result);
        System.out.println(leftOver);
    }
}
