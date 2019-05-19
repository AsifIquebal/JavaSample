package com.company.collection;

import java.util.*;

public class Convertion {

	public static void main(String[] args) {

		String [] names = {"1","2","3","2","3"};

		//Array to Set. SET doesn't allow duplicates.
		Set<String> myset = new HashSet<>(Arrays.asList(names));
		System.out.println("SET: " + myset);

		//Converting Set to Array
		String[] arrayString = myset.toArray(new String[myset.size()]);
		System.out.println("Array Length is: " + arrayString.length);
		for(String elem : arrayString)
		{
			System.out.println("Element: "+elem);
		}

		//Converting HashSet to List or ArrayList
		HashSet<String> hset = new HashSet<>(myset);
		List<String> list = new ArrayList<>(hset);
		System.out.println("ArrayList: " + list);

		//Converting ArrayList to Set or HashSet in Java
		HashSet<String> HashSet = new HashSet<>(list);
		System.out.println("HashSet: " + HashSet);

		//Converting Array to ArrayList:
		String[] ary = {"D","F","I","Y","V","D","W","B","A"}; 
		ArrayList<String> al = new ArrayList<>();
		Collections.addAll(al, ary);
		
		
		
		
	}
}