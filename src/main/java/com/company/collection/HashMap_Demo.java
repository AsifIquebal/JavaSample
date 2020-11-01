package com.company.collection;

import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import org.testng.annotations.Test;

import java.net.Inet4Address;
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
    public void testPutIfAbsent(){
        Map<Integer, String> hm = getMap();
        // checking with existing keys
        System.out.println("Key already exists: " + hm.putIfAbsent(3, "Three"));
        // checking with non-existing keys
        System.out.println("Key is new: " + hm.putIfAbsent(6, "Six"));
        hm.forEach((k,v)-> System.out.println(k + " -> " + v));
    }

    @Test
    public void demo1() {
        Map<Integer, String> hm = getMap();
        for (Map.Entry<Integer, String> m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        // using java 8
        hm.forEach((a, b) -> System.out.println(a + ":" + b));
    }

    @Test
    public void demo2() {
        Map<Integer, String> map = getMap();
        /* Display content using Iterator*/
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("key is: " + entry.getKey() + " & Value is: " + entry.getValue());
        }
    }

    @Test
    public void iterating_1() {
        Map<Integer, String> map = getMap();
        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> pair = it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            it.remove(); // avoids a ConcurrentModificationException
        }
        System.out.println(map.size());
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

    public static <K,V>boolean containsNullKeysOrValues(Map<K,V> map){
        return containsNullKeys(map)|| containsNullValues(map);
    }
    public static <K, V> boolean containsNullKeys(Map<K, V> map) {
        return Iterables.tryFind(map.keySet(), Predicates.isNull()).isPresent();
    }
    public static <K, V> boolean containsNullValues(Map<K, V> map) {
        return Iterables.tryFind(map.values(), Predicates.isNull()).isPresent();
    }

}
