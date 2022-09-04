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
        System.out.println("There are: " + hashtable.size() + " element(s)");//There are: 6 element(s)
        System.out.println("The gang of Boys: " + hashtable.get(0));//The gang of Boys: PASAM
        System.out.println("P : " + hashtable.get(1));//P : Picasso
        System.out.println("A : " + hashtable.get(2));//A : Asif
        System.out.println("S : " + hashtable.get(3));//S : Sudip
        System.out.println("A : " + hashtable.get(4));//A : Amlan
        System.out.println("M : " + hashtable.get(5));//M : Manish

        System.out.println("Keys");
        Enumeration<Integer> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            System.out.println(keys.nextElement());
        }
        /*5
        4
        3
        2
        1
        0*/
        System.out.println("Elements:");
        Enumeration<String> enumeration = hashtable.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
        /*Manish
          Amlan
          Sudip
          Asif
          Picasso
         PASAM*/
        System.out.println("Entry Set: ");
        for (Map.Entry<Integer, String> m : hashtable.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }
        /*
        5 : Manish
        4 : Amlan
        3 : Sudip
        2 : Asif
        1 : Picasso
        0 : PASAM
        */

    }

}
