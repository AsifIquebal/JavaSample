package com.company.commonlyasked.regex;

import org.testng.annotations.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_1 {

    @Test
    public void test1() {
        String text = "My mobile number is 1234567890, Code for India is +91";
        Pattern pattern = Pattern.compile("(\\s)(\\d+)");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println(matcher.group(0));
            System.out.println(matcher.group(1));
            System.out.println("Match: " + matcher.group(2));
        }
    }

    @Test
    public void matchNumbersIfPresentInList() {
        List<String> numbers = Arrays.asList("1", "20", "A1", "333", "A2A211");
        for (String number : numbers) {
            if (number.matches("\\d+")) {
                System.out.println(number);        // 1, 20, 333
            }
        }
        // Java 8 stream example
        numbers.stream()
                .filter(x -> x.matches("\\d+"))
                .forEach(System.out::println);
        numbers.stream()
                .map(x -> x.replaceAll("\\d", "#"))
                .forEach(System.out::println);
    }


    @Test
    public void test2() {
        String text = "My mobile number is 1234567890 Code for India is +91";
        //matches the phone number with the space placed in-front of it
        Pattern pattern = Pattern.compile("(\\s)(\\d+)");
        Matcher m1 = pattern.matcher(text);
        while (m1.find()) {
            System.out.println("Match: " + m1.group());
        }
        String line = "This order was placed for QT3000! OK?";
        String pattern1 = "(.*)(\\d+)(.*)";
        Pattern r1 = Pattern.compile(pattern1);
        Matcher m2 = r1.matcher(line);
        if (m2.find()) {
            System.out.println("Found value: " + m2.group(0));    //group 0 is a special group, which always represents the entire
            //expression. This group is not included in the total reported by groupCount.
            System.out.println("Found value: '" + m2.group(1) + "'." + " Starts at: '" + m2.start() + "' & Ends at: '" + m2.end() + "'");
            System.out.println("Found value: '" + m2.group(2) + "'." + " Starts at: '" + m2.start() + "' & Ends at: '" + m2.end() + "'");
            System.out.println("Found value: '" + m2.group(3) + "'." + " Starts at: '" + m2.start() + "' & Ends at: '" + m2.end() + "'");
        } else {
            System.out.println("NO MATCH");
        }
        System.out.println("-----------------------------------------------------------------------------");
        String Str = "Welcome to Selenium Web Driver";
        if (Str.matches("(.*)Selenium(.*)") == true) {
            System.out.println("Hi");
            System.out.println(Str.matches("(.*)Selenium(.*)"));
        } else {
            System.out.println("Not found");
        }
    }

    @Test
    public void startEnd() {
        Pattern p = Pattern.compile("a(bb)");
        Matcher m = p.matcher("aabbabbabbaaa");
        while (m.find())
            System.out.println("Start :" + m.start() + ", End : " + m.end() + ", Group " + m.group());
    }

    @Test
    public void test03() {
        String str = "This2is2FristString";
        String pattern = "(\\d+)";
        System.out.println(Pattern
                .compile(pattern)
                .matcher(str)
                .results()
                .mapToInt(m -> Integer.parseInt(m.group()))
                .sum());
    }

    @Test
    public void test01() throws IOException {
        String oldFileName = "C:/Users/user/Desktop/a.txt";
        String tmpFileName = "C:/Users/user/Desktop/tmp_a.txt";
        String contents = new String(Files.readAllBytes(Paths.get(oldFileName)));
        System.out.println(contents);
        Pattern p1 = Pattern.compile("((arrFunc)(.|\\s\\S)*(\\);))", Pattern.DOTALL);
        Matcher m1 = p1.matcher(contents);
        while (m1.find()) {
            System.out.println("Match: " + m1.group());
            contents = contents.replace(m1.group(), "arrFunc.push(function(){\n\t\tAdded Replacement\n\t});");
        }
        System.out.println(contents);

        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(tmpFileName));
            bw.write(contents);
        } catch (Exception e) {
            return;
        } finally {

            try {
                if (bw != null)
                    bw.close();
            } catch (IOException e) {
            }
        }
        File oldFile = new File(oldFileName);
        oldFile.delete();
        File newFile = new File(tmpFileName);
        newFile.renameTo(oldFile);
    }

    @Test
    public void test02() {
        String onlineBillsay = "Bill successfully sent to Treasury. Token No generated is 386";
        String pattern = "(\\d+)";
        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);
        Pattern r1 = Pattern.compile(pattern, 0);
        // Now create matcher object.
        Matcher m = r.matcher(onlineBillsay);
        Matcher m1 = r1.matcher(onlineBillsay);
        if (m.find()) {
            String token_num = m.group(1);
            System.out.println("Token Number: " + token_num);
            System.out.println("Found value: " + m.group(1));
        } else {
            System.out.println("NO MATCH");
        }

        if (m1.find()) {
            String token_num = m1.group(1);
            System.out.println("Token Number: " + token_num);
            System.out.println("Found value: " + m1.group(1));
        } else {
            System.out.println("NO MATCH");
        }
    }

}
