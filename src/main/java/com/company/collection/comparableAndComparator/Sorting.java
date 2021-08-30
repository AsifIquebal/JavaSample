package com.company.collection.comparableAndComparator;

import org.testng.annotations.Test;

import java.util.*;

public class Sorting {

    @Test
    public void demo1(){
        Set<Integer> random = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            random.add((int) (Math.random() * 100));
        }
        System.out.println("Initial Set: " + random);
        Set<Integer> sorted = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        sorted.addAll(random);
        System.out.println("Sorted Set: " + sorted);
    }

    @Test
    public void demo2_usingAnonymousClass(){
        List<String> list = new ArrayList<>(Arrays.asList("Sarkar","Asif","asif","sarkar"));
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        System.out.println(list);
    }

    @Test
    public void demo2_usingLambda(){
        List<String> list = new ArrayList<>(Arrays.asList("Sarkar","Asif","asif","sarkar"));
        Collections.sort(list, (String str1, String str2)->str1.compareToIgnoreCase(str2));
        System.out.println(list);
    }

    @Test
    public void demo3_usingMethodReference(){
        List<String> list = new ArrayList<>(Arrays.asList("Sarkar","Asif","asif","sarkar"));
        list.sort(String::compareToIgnoreCase);
        System.out.println(list);

        List<Integer> l1 = new ArrayList<>(Arrays.asList(20,0,15,5,10,25,30));
        l1.sort(Integer::compare);
        System.out.println("Ascending/Natural Order:  " + l1);
    }

    @Test
    public void others(){
        List<Integer> l1 = new ArrayList<>(Arrays.asList(20,0,15,5,10,25,30));
        Comparator<Integer> C = (i1,i2) -> (i1<i2)?1:(i1==i2)?0:-1;
        Collections.sort(l1,C);
        System.out.println("Descending Order: " + l1);

        List<Integer> l2 = new ArrayList<>(Arrays.asList(20,0,15,5,10,25,30));
        Comparator<Integer> C1 = (i1,i2) -> i2.compareTo(i1);
        Collections.sort(l2,C1);
        System.out.println("Descending Order: " + l2);

        List<Integer> l3 = new ArrayList<>(Arrays.asList(20,0,15,5,10,25,30));
        Comparator<Integer> C3 = Comparator.reverseOrder();
        l3.sort(C3);
        System.out.println("Descending Order: " + l3);
    }



}
