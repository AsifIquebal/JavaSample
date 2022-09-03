package com.company.commonlyasked.strings;

import org.testng.annotations.Test;

import java.util.Arrays;

public class StringFunctions {

    @Test
    public void numberOfDigits() {
        String str = "Java9Programming1011";
        int count = 0;
        int asciiValue = 0;
        for (int i = 0; i < str.length(); i++) {
            asciiValue = (int) str.charAt(i);
            if (asciiValue >= 48 && asciiValue <= 57) {
                count++;
            }
        }
        System.out.println("Number of digits: " + count);
        int count1 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count1++;
            }
        }
        System.out.println("Number of digits: " + count1);
    }

    @Test
    public void test01_findLengthWithoutUsingLengthFunction() {
        String helloWorld = "This is hello world";
        System.out.println("length of helloWorld string :" + getLengthOfString(helloWorld));
        System.out.println(getLengthOfString("abcd"));
    }

    @Test
    public void intToString() {
        int i = 200;
        String s = String.valueOf(i);
        System.out.println(i + 100);//300 because + is binary plus operator
        System.out.println(s + 100);//200100 because + is string concatenation operator
    }

    public static int getLengthOfString(String str) {
        int i = 0;
        try {
            for (i = 0; ; i++) {
                str.charAt(i);
            }
        } catch (Exception e) {
        }
        return i;
    }

    @Test
    public void compareTo01() {
        String str1 = "I";
        String str2 = "Java";
        System.out.println(str1.compareTo(str2));
        //System.out.println(str1 + "" + str2);
        //System.out.println(str2.concat(str1));
        //System.out.println(str1.concat(str2));
    }

    @Test
    public void internMethod() {
        String str1 = new String("JAVA");
        String str2 = new String("JAVA");
        System.out.println(str1 == str2);// false
        String str3 = "JAVA";
        String str4 = "JAVA";
        System.out.println(str3 == str4);//true
        str3 = str3.intern();
        str4 = str4.intern();
        System.out.println(str3 == str4);//true
    }

    @Test
    public void stringIsImmutable() {
        String str = "studytonight";
        str.concat(".com");
        str = str.toUpperCase();
        str = str.replace("tonight", "today");
        System.out.println(str);
    }

    @Test
    public void sample() {
        String a = "Asif";
        System.out.println("a.length(): " + a.length());
        System.out.println("a.isEmpty()" + a.isEmpty());
        System.out.println("a.concat(\" Sarkar\"): " + a.concat(" Sarkar"));
        System.out.println("" + a.replace("i", "I"));
        System.out.println("" + a.substring(2));
        String[] strings = a.split("");
        for (String x : strings)
            System.out.println(x);
        System.out.println(strings.length);
        System.out.println("Tester".substring(0, 4));
    }

    @Test
    public void substring01(){
        String s = "Harbison";
        System.out.println(s +"[# of chars " + s.length() + "]: " + s.substring(3));
        // below is empty string not null
        System.out.println("hello: " + s.substring(8).length());//hello: 0
        //java.lang.StringIndexOutOfBoundsException: String index out of range: -1
        System.out.println("hello: " + s.substring(9));
    }

    @Test
    public void repeatCharsIndex() {
        /*String word = "RASPBERRY";
        char letter = 'R';
        int start = word.indexOf(letter);

        while(start != -1) {
            System.out.println("Found R in: " + start);
            start = word.indexOf(letter, ++start);
        }*/
        String str = "Asif";
        System.out.println(str.indexOf('g'));
    }

    @Test
    public void concat() {
        String a = "Apple";
        String b = "Mango";
        int x = 10;
        int y = 20;
        System.out.println(a + b);
        System.out.println(x + y);
        System.out.println(a + b + x + y);
        System.out.println("" + x + y);
    }

    @Test
    public void stringLengthWithoutLength_01() {
        String a = "Asif";
        System.out.println(a.length());
        char[] chars = a.toCharArray();
        System.out.println(chars.length);
        int c = 0;
        for (char ca : chars) {
            c += 1;
        }
        System.out.println(c);
    }

    @Test
    public void stringLengthWithoutLength_02() {
        String a = "Asif";
        int count = 0;
        for (int i = 0; ; i++) {
            try {
                a.charAt(i);
                i++;
            } catch (StringIndexOutOfBoundsException e) {
                String[] split = e.getMessage().split(":");
                System.out.println("Exception gives me length: " + split[1]);
                System.out.println("Length is: " + i);
                break;
            }
        }
    }

    @Test
    public void stringJoin() {
        String combined = String.join(" and ", "LinkedIn", "Microsoft");
        System.out.println("string joined by and : " + combined);

        // joining elements from a list of String
        String joined = String.join("|", Arrays.asList("Java", "Android", "Oracle"));
        System.out.println("String joined by pipe from list : " + joined);

        // joining String elements of an array
        String[] biggies = {"Apple", "Google", "Amazon"};
        String fromArray = String.join(",", biggies);
        System.out.println("String joined by comma from array: " + fromArray);
    }


    @Test(description = "This explains why Strings are Immutable and StringBuffer is Mutable")
    public void concatVsAppend() {
        String s = new String("Demo");
        s.concat(" World");
        System.out.println(s);

        StringBuffer sb = new StringBuffer("Demo");
        sb.append(" World");
        System.out.println(sb);
    }

    @Test
    public void equalsOfStringAndStringBuffer() {
        String a = new String("Demo");
        String b = new String("Demo");
        System.out.println(a == b);
        System.out.println(a.equals(b));// true, String class overrides equals method of object and checks for content comparison

        StringBuffer sb1 = new StringBuffer("Demo");
        StringBuffer sb2 = new StringBuffer("Demo");
        System.out.println(sb1 == sb2);//false
        System.out.println(sb1.equals(sb2));//false
        // false, SB doesn't override equals of Object.
        // So equals of objects gets called, which is just for reference equality check
    }

    @Test
    public void useOfNew() {
        String s1 = "Java";
        String s2 = "Java";
        System.out.println(s1 == s2);// true; both refers to SCP
        String s3 = new String("Java");
        System.out.println(s1 == s3);//false; as new is used s3 is on heap
        String s4 = new String("Java");
        System.out.println(s1 == s4);// false; new always creates new objects on heap
        System.out.println(s3 == s4);// false; new always creates new objects on heap
    }

    @Test
    public void checkRotationOfString() {
        /*If "JavaJ2eeStrutsHibernate" is a string then below are some rotated versions of this string.
        "StrutsHibernateJavaJ2ee", "J2eeStrutsHibernateJava", "HibernateJavaJ2eeStruts".*/
        // make circle..join end with start
        String s1 = "JavaJ2eeStrutsHibernate";
        String s2 = "StrutsHibernateJavaJ2ee";
        //Step 1
        if (s1.length() != s2.length()) {
            System.out.println("s2 is not rotated version of s1");
        } else {
            //Step 2, s1 both times, this is the catch
            String s3 = s1 + s1;
            //Step 3
            if (s3.contains(s2)) {
                System.out.println("s2 is a rotated version of s1");
            } else {
                System.out.println("s2 is not rotated version of s1");
            }
        }
    }

}
