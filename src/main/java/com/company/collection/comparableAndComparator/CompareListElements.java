package com.company.collection.comparableAndComparator;

import java.util.*;

public class CompareListElements {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "A", "B", "C", "C", "C", "D", "D"));
        System.out.println("\nExample 1 - Count 'a' with frequency");
        System.out.println("a : " + Collections.frequency(list, "a"));

        System.out.println("\nExample 2 - Count all with frequency");
        Set<String> uniqueSet = new HashSet<String>(list);
        for (String temp : uniqueSet) {
            System.out.println(temp + ": " + Collections.frequency(list, temp));
        }

        System.out.println("\nExample 3 - Count all with Map");
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String temp : list) {
            Integer count = map.get(temp);
            map.put(temp, (count == null) ? 1 : count + 1);
        }
        printMap(map);

        System.out.println("\nSorted Map");
        Map<String, Integer> treeMap = new TreeMap<String, Integer>(map);
        printMap(treeMap);

    }

    public static void printMap(Map<String, Integer> map) {

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " Value : "
                    + entry.getValue());
        }
    }
}
