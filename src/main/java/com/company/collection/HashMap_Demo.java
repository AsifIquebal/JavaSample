package com.company.collection;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_Demo {

    @Test
    public void demo1() {
        Map<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "A");
        hm.put(2, "B");
        hm.put(3, "C");
        hm.put(4, "D");
        hm.put(5, "E");

        hm.get(1);
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        // using java 8
        hm.forEach((a,b)-> System.out.println(a+":"+b));
    }

    @Test
    public void demo2(){
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.put(5, "E");
        /* Display content using Iterator*/
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.print("key is: "+ entry.getKey() + " & Value is: ");
            System.out.println(entry.getValue());
        }
        System.out.println("==============================");
        map.forEach((a,b)-> System.out.println(a+":"+b));
    }

    @Test
    public void iterating_1(){
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.put(5, "E");
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
        map.forEach((a,b)-> System.out.println(a+":"+b));
    }




}
