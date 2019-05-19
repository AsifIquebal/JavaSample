package com.company.collection;
import org.testng.annotations.Test;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class HashTable_Demo
{
	@Test
    public void demo1(){
		//Created hashtable class object to use Its different properties.
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(0, "PASAM");
		ht.put(1, "Picasso");
		ht.put(2, "Asif");
		ht.put(3, "Sudip");
		ht.put(4, "Amlan");
		ht.put(5, "Manish");
		//Accessing hash table values using keys.
		System.out.println("There are: " + ht.size() + " element(s)");
		System.out.println("The gang of Boys: " + ht.get(0));
		System.out.println("P : " + ht.get(1));
		System.out.println("A : " + ht.get(2));
		System.out.println("S : " + ht.get(3));
		System.out.println("A : " + ht.get(4));
		System.out.println("M : " + ht.get(5));
		System.out.println("-----------------------------------------");
		// Show all using a loop in hash table.
        ht.keys();// gives Enumeration of Keys
        ht.elements();// gives Enumeration of Values
		Enumeration<Integer> my_keys = ht.keys();
		int i;
		while(my_keys.hasMoreElements()) 
		{
			i = (int) my_keys.nextElement();
			System.out.println(i + " : " +ht.get(i));
		}
		//
		System.out.println("-----------------------------------------");
		for(Map.Entry<Integer, String> m:ht.entrySet())
		{  
			System.out.println(m.getKey()+" : "+m.getValue());  
		} 
	}

	@Test
    public void valuesOfHashTable(){
	    // creating the hashtable
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        ht.put(0, "PASAM");
        ht.put(1, "Picasso");
        ht.put(2, "Asif");
        ht.put(3, "Sudip");
        ht.put(4, "Amlan");
        ht.put(5, "Manish");

        Enumeration<String> enumeration = ht.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }

    @Test
    public void keysOfHashTable(){
        // creating the hashtable
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        ht.put(0, "PASAM");
        ht.put(1, "Picasso");
        ht.put(2, "Asif");
        ht.put(3, "Sudip");
        ht.put(4, "Amlan");
        ht.put(5, "Manish");

        Enumeration<Integer> enumeration = ht.keys();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }

}