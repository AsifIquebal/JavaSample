package com.company.collection;

import org.testng.annotations.Test;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

    @Test
    public void demo1() {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(0, "PASAM");
        hashtable.put(1, "Picasso");
        hashtable.put(2, "Asif");
        hashtable.put(3, "Sudip");
        hashtable.put(4, "Amlan");
        hashtable.put(5, "Manish");
        System.out.println("There are: " + hashtable.size() + " element(s)");
        System.out.println("The gang of Boys: " + hashtable.get(0));
        System.out.println("P : " + hashtable.get(1));
        System.out.println("A : " + hashtable.get(2));
        System.out.println("S : " + hashtable.get(3));
        System.out.println("A : " + hashtable.get(4));
        System.out.println("M : " + hashtable.get(5));

        Enumeration<Integer> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            System.out.println(keys.nextElement());
        }
        Enumeration<String> enumeration = hashtable.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
        for (Map.Entry<Integer, String> m : hashtable.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }

    }

}
