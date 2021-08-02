package com.company.collection;

import org.testng.annotations.Test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class IteratorDemo {

    @Test
    public void test1() {
        List<Integer> list = new ArrayList<>(Arrays.asList(11, 12, 13, 14, 15));
        Iterator<Integer> integerIterator = list.iterator();
        while (integerIterator.hasNext()) {
            if (integerIterator.next() % 2 != 0) {
                integerIterator.remove();
            }
        }
        System.out.println(list);
    }

    //Example of Fail-Safe Iterator which does not create separate copy
    @Test
    public void failSafe() {
        // import java.util.concurrent.ConcurrentHashMap;
        // Creating a ConcurrentHashMap
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
        map.put("ONE", 1);
        map.put("TWO", 2);
        map.put("THREE", 3);
        map.put("FOUR", 4);
        // Getting an Iterator from map
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            System.out.println(key + " : " + map.get(key));
            // This will reflect in iterator.
            // Hence, it has not created separate copy
            map.put("SEVEN", 7);
        }
    }

    @Test
    public void listIteratorExample() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("ABC", "DEF", "GHI", "JKL"));
        ListIterator<String> listIterator1 = list.listIterator();
        // Traversing elements
        System.out.println("Forward Direction Iteration:");
        while (listIterator1.hasNext()) {
            System.out.println(listIterator1.nextIndex() + ": " + listIterator1.next());
        }

        // Traversing elements, the iterator is at the end
        // at this point
        System.out.println("Backward Direction Iteration:");
        while (listIterator1.hasPrevious()) {
            System.out.println(listIterator1.previousIndex()+ ": " + listIterator1.previous());
        }
        // getting iterated value starting from index 2
        // using listIterator() method
        ListIterator<String> listIterator2 = list.listIterator(2);
        // Printing the iterated value
        System.out.println("\nUsing ListIterator from Index 2:\n");
        while (listIterator2.hasNext()) {
            System.out.println("Value is : " + listIterator2.next());
        }
        // for-each loop creates Internal Iterator here.
        for (String s : list) {
            System.out.println(s);
        }
    }

}
