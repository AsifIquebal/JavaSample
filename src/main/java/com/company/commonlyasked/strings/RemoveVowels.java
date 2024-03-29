package com.company.commonlyasked.strings;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveVowels {

    @Test
    public void test01() {



        String str = "asiefxouvit";
        List<Character> collect = str.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

        Character[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        List<Character> vowelList = Arrays.asList(vowels);

        int counter = 0;

        for (int i = 0; i < collect.size(); i++) {
            if (vowelList.contains(collect.get(i))) {
                counter++;
            } else {
                counter = 0;
            }
            if (counter > 1) {
                collect.remove(i);
                collect.remove(i - 1);
                counter = 0;
            }
        }
        System.out.println(collect);

    }


}
