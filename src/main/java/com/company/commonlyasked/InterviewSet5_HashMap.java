package com.company.commonlyasked;

import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;

public class InterviewSet5_HashMap {

    @Test
    public void swapKeyValue() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Key1",10);map.put("Key2",22);map.put("Key3",2);
        Map<Integer, String> swapped = map.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
        System.out.println(swapped);
    }

    @Test
    public void sortByValue() {
        Map<String, Integer> map = new HashMap<>();
        map.put("X", 26);
        map.put("Asif", 12);
        map.put("Meena", 10);
        map.put("Geeta", 22);
        map.put("Harry", 20);
        map.put("Lawrence", 6);
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        Map<String, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        System.out.println(result);
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> map.put(x.getKey(), x.getValue()));
    }

    @Test
    public void sortByKey() {
        Map<String, Integer> map = new HashMap<>();
        map.put("X", 26);
        map.put("Asif", 12);
        map.put("Meena", 10);
        map.put("Geeta", 22);
        map.put("Harry", 20);
        map.put("Lawrence", 6);
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByKey());
        Map<String, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        System.out.println(result);
    }
}
