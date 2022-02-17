package com.company.collection;

import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;


public class HashMapDemo {

    @Test
    public void identityHashMap() {
        Map<String, String> ihm = new IdentityHashMap<>();
        ihm.put("ihmkey", "ihmvalue");
        ihm.put(new String("ihmkey"), "ihmvalue1");
        // ihm.size() will print 2 since it, compares the objects by reference
        System.out.println("Size of IdentityHashMap: " + ihm.size());

        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("hmkey", "hmvalue");
        hashMap.put(new String("hmkey"), "hmvalue1");
        // hashMap.size() will print 1 since it compares the objects by equals() method
        System.out.println("Size of hashMap: " + hashMap.size());
        hashMap.get("hmkey");
    }


    @Test
    public void testPutIfAbsent() {
        Map<Integer, String> hm = getMap();
        // checking with existing keys
        System.out.println("Key already exists: " + hm.putIfAbsent(3, "Three"));
        // checking with non-existing keys
        System.out.println("Key is new: " + hm.putIfAbsent(6, "Six"));
        hm.forEach((k, v) -> System.out.println(k + " -> " + v));
    }

    @Test
    public void testGetOrDefault() {
        Map<Integer, String> hm = getMap();
        // checking with existing keys
        System.out.println("Key already exists: " + hm.getOrDefault(3, "Three"));
        // checking with non-existing keys
        System.out.println("Key is new: " + hm.getOrDefault(6, "Default Value"));
        hm.forEach((k, v) -> System.out.println(k + " -> " + v));
    }

    @Test
    public void demo1() {
        Map<Integer, String> hm = getMap();
        for (Map.Entry<Integer, String> m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
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
        /*To sort HashMap by keys, simply use TreeMap's constructor which accepts Map*/
        //convert HashMap to TreeMap
        TreeMap<Integer, String> treeMapNumbers = new TreeMap<>(hMapNumbers);
        //print TreeMap which is sorted by keys
        System.out.println("\nTreeMap contains...");
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

    public Map<Integer, String> getMap() {
        Map<Integer, String> hm = new HashMap<>();
        hm.put(1, "A");
        hm.put(2, "B");
        hm.put(3, "C");
        hm.put(4, "D");
        hm.put(5, "E");
        return hm;
    }

    //double brace initialization is considered as an antipattern
    @Test
    public void initializationAtOnce(){
        List<String> list = new ArrayList<>(){{
            add("A");add("B");
        }};
        System.out.println(list);

        Map<String, Integer> map = new HashMap<>(){{
            put("A",1);put("B",2);
        }};
        System.out.println(map);
    }

    @Test
    public void countDuplicatesInArrayList() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("AB", "AB", "BA", "C", "CD", "C"));
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String item : list) {
            if (!hashMap.containsKey(item)) {
                hashMap.put(item, 1);
            } else {
                hashMap.put(item, hashMap.get(item) + 1);
            }
        }
        System.out.println(hashMap);
    }

    @Test
    public void verifyPutMethod() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        System.out.println(hashMap.put("A", 123));
        System.out.println(hashMap.put("A", 321));

        System.out.println(hashMap);

        System.out.println(hashMap.get("A"));
        System.out.println(hashMap.get("B"));
    }

}
