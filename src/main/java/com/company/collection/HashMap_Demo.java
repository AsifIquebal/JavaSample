package com.company.collection;

import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;

public class HashMap_Demo {

    public Map<Integer, String> getMap() {
        Map<Integer, String> hm = new HashMap<>();
        hm.put(1, "A");
        hm.put(2, "B");
        hm.put(3, "C");
        hm.put(4, "D");
        hm.put(5, "E");
        return hm;
    }

    @Test
    public void demo1() {
        Map<Integer, String> hm = getMap();
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        // using java 8
        hm.forEach((a, b) -> System.out.println(a + ":" + b));
    }

    @Test
    public void demo2() {
        Map<Integer, String> map = getMap();
        /* Display content using Iterator*/
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.print("key is: " + entry.getKey() + " & Value is: ");
            System.out.println(entry.getValue());
        }
        System.out.println("==============================");
        map.forEach((a, b) -> System.out.println(a + ":" + b));
    }

    @Test
    public void iterating_1() {
        Map<Integer, String> map = getMap();
        /*Iterator it = mp.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            it.remove(); // avoids a ConcurrentModificationException
        }*/
        Iterator iterator = map.entrySet().iterator();
        /* Display content using Iterator*/
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        /*Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.print("key is: "+ entry.getKey() + " & Value is: ");
            System.out.println(entry.getValue());
        }*/
        System.out.println("==============================");
        map.forEach((a, b) -> System.out.println(a + ":" + b));
    }

    @Test
    public void sortByKeys() {
        HashMap<Integer, String> hMapNumbers = new HashMap<>();
        hMapNumbers.put(4, "Four");
        hMapNumbers.put(10, "Ten");
        hMapNumbers.put(3, "Three");
        hMapNumbers.put(2, "Two");
        hMapNumbers.put(1, "One");
        System.out.println("HashMap contains...");

        for (Integer key : hMapNumbers.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hMapNumbers.get(key));
        }
        System.out.println("");
        /*To sort HashMap by keys, simply use TreeMap's constructor which accepts Map*/
        //convert HashMap to TreeMap
        TreeMap<Integer, String> treeMapNumbers = new TreeMap<>(hMapNumbers);
        //print TreeMap which is sorted by keys
        System.out.println("TreeMap contains...");
        for (Integer key : treeMapNumbers.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMapNumbers.get(key));
        }

        Map<Integer, String> sortedMap =
                hMapNumbers.entrySet().stream()
                        .sorted(Map.Entry.comparingByKey())
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(sortedMap);
    }

    @Test
    public void sortByValue() {
        HashMap<Integer, String> hMapNumbers = new HashMap<>();
        hMapNumbers.put(4, "Four");
        hMapNumbers.put(10, "Ten");
        hMapNumbers.put(3, "Three");
        hMapNumbers.put(2, "Two");
        hMapNumbers.put(1, "One");
        Map<Integer, String> sortedMap =
                hMapNumbers.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue())
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(sortedMap);
    }


}
