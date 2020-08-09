package com.company.collection;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_Demo 
{
	public static void main(String[] args) 
	{
		String[] ary = {"D","F","Y","V","D","W","B"}; 
		// create a linked list
		LinkedList<String> ll = new LinkedList<String>();
		// add elements to the linked list
		Collections.addAll(ll, ary);
		ll.add("F");
		ll.addLast("Z");
		ll.addFirst("A");
		ll.add(1, "A2");
		ll.add(0, "A0");

		System.out.println("Original contents of ll[contains <"+ll.size()+"> elements]: "+ ll);
		// remove elements from the linked list
		ll.remove("F");
		ll.remove(2);
		System.out.println("Contents of ll after deletion: "+ ll);
		// remove first and last elements
		ll.removeFirst();
		ll.removeLast();
		System.out.println("ll after deleting first and last: "+ ll);
		// get and set a value
		Object val = ll.get(2);
		ll.set(2, (String) val + ", Changed");
		System.out.println("ll after change: " + ll);
	}

	@Test
	public void setAndAdd(){
        List<String> list = new LinkedList<>(Arrays.asList("A","B","C","D"));
        list.add(0,"AA");
        System.out.println(list);
        // Replaces the element at the specified position in this list with the specified element (optional operation)
        list.set(0,"X");
        System.out.println(list);
    }

	@Test
	public void linkedListDemo1(){
		List l = new LinkedList();
		l.add("asif");
		l.add(32);
		l.add(null);
		l.add("asif");
		System.out.println(l);
		//
		Object x = l.set(0,"software");
		System.out.println(x);
		System.out.println(l);
		l.add(0,"venky");
		System.out.println(l);
		l.remove(l.size()-1);
		System.out.println(l);
		l.add(0,"ccc");
		System.out.println(l);

        System.out.println("Index based retrieval: "+ l.get(1));
	}


}