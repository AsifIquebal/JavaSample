package com.company.commonlyasked;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 2, 3, 4, 5, 5};
        //withSet(num);
        //Normal(num);
        String[] strings = {"Java", "Python", "Ruby", "Java", "C", "C++", "Perl", "C", "Go", "Java", "Go"};
        //findDuplicateInStringArray_UsingForLoop(strings);
        findDuplicateInStringArray_UsingSet(strings);
    }

    private static void findDuplicateInStringArray_UsingSet(String[] strings) {
        // this is O(n)
        Set<String> stringSet = new HashSet<>();
        for (String str : strings) {
            if (!stringSet.add(str)) {
                System.out.println("Found Duplicate: " + str);
            }
        }
    }


    public static void findDuplicateInStringArray_UsingForLoop(String[] strings) {
        int counter = 1;
        // this is O(n2)
        for (int i = 0; i < strings.length; i++) {

            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].equals(strings[j])) {
                    counter = counter + 1;
                    System.out.println("Found Duplicate: " + strings[i]);
                }
            }
            counter = 1;
        }
    }

    public static void withSet(int[] num) {
        Set<Integer> numberSet = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();
        for (int elem : num) {
            if (!numberSet.add(elem)) {
                System.out.println(elem);
            }

            // Also we can use use contains method
			/*if (!resultSet.contains(elem)) {
			    resultSet.add(elem);
				//System.out.println(elem);
			}
			else {
			    numberSet.add(elem);
            }*/
        }

        /*System.out.println(resultSet);
        System.out.println(numberSet);*/
    }

	/*public static void withHashMap(int[] num)
	{
		Map<Integer, Integer> elemAndCount = new HashMap<>();
		// build hash table with count
		for (int elem : num) 
		{
			Integer count = elemAndCount.get(num);
			if (count == null) {
				elemAndCount.put(num, 1);
			} else {
				elemAndCount.put(num, ++count);
			}
		}
		// Print duplicate elements from array in Java
		Set<Entry<String, Integer>> entrySet = elemAndCount.entrySet();
		for (Entry<String, Integer> entry : entrySet) 
		{
			if (entry.getValue() > 1) 
			{
				System.out.println("Duplicate element from array : "+ entry.getKey());
			}
		}
	}*/
}
