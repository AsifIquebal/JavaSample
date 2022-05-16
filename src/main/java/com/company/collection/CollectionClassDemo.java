package com.company.collection;

import org.testng.annotations.Test;

import java.util.*;

public class CollectionClassDemo {

    @Test
    public void test01() {
        //Converting array to ArrayList
        String[] ary = {"D", "F", "I", "Y", "V", "D", "W", "B", "A"};
        List<String> al = new ArrayList<>();
        Collections.addAll(al, ary);
        System.out.println("Before Sorting: " + al);
        //Ascending order Sorting
        Collections.sort(al);
        System.out.println("After Sorting: " + al);
        // Descending order Sorting
        ArrayList<String> al2 = new ArrayList<String>(Arrays.asList("Picasso", "Asif", "Sudip", "Amlan", "Manish"));
        System.out.println("Before Sorting: " + al2);
        Collections.sort(al2, Collections.reverseOrder());
        //Collections.reverse(al);
        System.out.println("After Reverse Sorting: " + al2);

        String max = Collections.max(al);
        System.out.println("Max of the list: " + max);

        Integer[] ary1 = {1, 3, 7, 3, 1, 4, 9};
        ArrayList<Integer> al1 = new ArrayList<>();
        Collections.addAll(al1, ary1);
        System.out.println("Max of Integer Array: " + Collections.max(al1));
        System.out.println("Max of Integer Array: " + Collections.min(al1));
        System.out.println("Max of Integer Array: " + Collections.frequency(al1, 1));
    }

    @Test
    public void test02() {
        // Fields do not provide type safety
        List list1 = Collections.EMPTY_LIST;
        System.out.println("list1 size is: " + list1.size());
        Set set1 = Collections.EMPTY_SET;
        System.out.println("set1 size is: " + set1.size());
        Map map1 = Collections.EMPTY_MAP;
        System.out.println("map1 size is: " + map1.size());
        // Below Methods provide type safety
        List<String> list2 = Collections.emptyList();
        System.out.println("list2 size is: " + list2.size());
        Set<String> set2 = Collections.emptySet();
        System.out.println("set2 size is: " + set2.size());
        Map<String, Date> map2 = Collections.emptyMap();
        System.out.println("map2 size is: " + map2.size());
        // Creating empty collections using new keyword
        List<String> list3 = new ArrayList<>();
        System.out.println("list3 size is: " + list3.size());
        Set<String> set3 = new HashSet<>();
        System.out.println("set3 size is: " + set3.size());
        Map<String, Date> map3 = new HashMap<>();
        System.out.println("map3 size is: " + map3.size());
    }

    

}
