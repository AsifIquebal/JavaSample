package com.company.collection;

import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class SortMethod {

    @Test
    public void usingArraysSort() {
        String[] strNames = new String[]{"John", "Asif", "asif", "alex", "Chris", "williams", "Mark", "Bob"};
        Arrays.sort(strNames);
        System.out.println("String array sorted (case sensitive)");
        //print sorted elements
        for (int i = 0; i < strNames.length; i++) {
            System.out.println(strNames[i]);
        }
        /*
         * Please note that, by default Arrays.sort method sorts the Strings
         * in case sensitive manner.
         *
         * To sort an array of Strings irrespective of case, use
         * Arrays.sort(String[] strArray, String.CASE_INSENSITIVE_ORDER) method instead.
         */
        //case insensitive sort
        Arrays.sort(strNames, String.CASE_INSENSITIVE_ORDER);
        System.out.println("String array sorted (case insensitive)");
        //print sorted elements again
        for (int i = 0; i < strNames.length; i++) {
            System.out.println(strNames[i]);
        }

    }

    @Test
    public void usingCollectionSort(){
        String[] strNames = new String[]{"John", "Asif", "asif", "alex", "Chris", "williams", "Mark", "Bob"};

        Collections.sort(Arrays.asList(strNames), String.CASE_INSENSITIVE_ORDER);
        for(String x:strNames){
            System.out.println(x);
        }
        //System.out.println(strNames);
    }

    @Test
    public void dd() {
        String str = "Hi How are you today Boy Zebra?";
        List<String> list = new ArrayList<>(Arrays.asList(str.split(" ")));
        Collections.sort(list);
        System.out.println(list);
    }

    // sorting a list of date objects
    @Test
    public void sortDates() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        List<Date> dates = new ArrayList<>();
        dates.add(dateFormat.parse("2016-01-20"));
        dates.add(dateFormat.parse("1998-12-03"));
        dates.add(dateFormat.parse("2009-07-15"));
        dates.add(dateFormat.parse("2012-04-30"));
        System.out.println("Before sorting: ");
        for (Date date : dates) {
            System.out.println(dateFormat.format(date));
        }
        Collections.sort(dates);
        System.out.println("After sorting: ");
        for (Date date : dates) {
            System.out.println(dateFormat.format(date));
        }
    }


}




