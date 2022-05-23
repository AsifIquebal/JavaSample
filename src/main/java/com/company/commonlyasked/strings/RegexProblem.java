package com.company.commonlyasked.strings;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexProblem {

    public List<String> findWordsInMixedCase(String text) {
        Pattern pattern = Pattern.compile("(([A-Z]?[a-z]+)|([A-Z]))");
        Matcher matcher = pattern.matcher(text);
        List<String> words = new ArrayList<>();
        while (matcher.find()) {
            words.add(matcher.group(0));
        }
        System.out.println(words);
        return words;
    }

    @Test
    public void test01() {
        findWordsInMixedCase("thisIsCamelCaseText");
        findWordsInMixedCase("thisHasASingleLetterWord");
    }


    @Test
    public void test02() {
        int ch1 = 'a';
        int ch2 = 'b';
        System.out.println("The ASCII value of a is: " + ch1);
        System.out.println("The ASCII value of b is: " + ch2);
        for (int i = 0; i <= 255; i++) {
            System.out.println(" The ASCII value of " + (char) i + "  =  " + i);
        }
    }
}
