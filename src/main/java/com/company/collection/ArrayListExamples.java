package com.company.collection;

import org.testng.annotations.Test;

import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;

public class ArrayListExamples {

    @Test
    public void addMethod() {
        List<String> list = new ArrayList<>();
        System.out.println(list.add("a")); //true
        //System.out.println(list.add(1,"B"));// CE as it returns void
    }

    @Test
    public void test1() {
        List<String> my_list = new ArrayList<String>();
        my_list.add("text1");
        my_list.add("text2");
        my_list.add(0, "1st element");
        my_list.add("1");
        my_list.add("2");
        my_list.add("3");
        my_list.add("1");
        my_list.add("2");
        my_list.add("3");
        System.out.println("\n==> Foreach Example...");
        for (Object element : my_list) {
            System.out.println(element);
        }
        System.out.println("List size is: " + my_list.size());
        System.out.println(my_list.indexOf("text2"));
        System.out.println("\n==> While Example...");
        int i = 0;
        while (i < my_list.size()) {
            System.out.println("Index: " + i + " Element: " + my_list.get(i));
            i++;
        }
        System.out.println("\n==> All at once without loop Example...");
        System.out.println("ArrayList Elements: " + my_list);
        // iterate via "iterator loop"
        System.out.println("\n==> Iterator Example...");
        Iterator<String> my_list_iterator = my_list.iterator();
        while (my_list_iterator.hasNext()) {
            System.out.println(my_list_iterator.next());
        }

        Set<String> my_set = new HashSet<String>(my_list);
        System.out.println("After converting to Set, the size is: " + my_set.size());
        System.out.println("Unique Values are as follows: \n" + my_set);
    }

    @Test
    public void demo1() {
        //Converting array to ArrayList
        String[] ary = {"D", "F", "I", "Y", "V", "D", "W", "B", "A"};
        ArrayList<String> al = new ArrayList<>();
        Collections.addAll(al, ary);
        System.out.println("Before Sorting: " + al);
        //Ascending order Sorting
        Collections.sort(al);
        System.out.println("After Sorting: " + al);
        // Descending order Sorting
        ArrayList<String> al2 = new ArrayList<>(Arrays.asList("Picasso", "Asif", "Sudip", "Amlan", "Manish"));
        System.out.println("Before Sorting: " + al2);
        Collections.sort(al2, Collections.reverseOrder());
        //Collections.reverse(al);
        System.out.println("After Reverse Sorting: " + al2);

    }

    @Test
    public void iterateList() {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Picasso", "Asif", "Sudip", "Amlan", "Manish"));
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void iterateList2() {
        String[] strings = {"Picasso", "Asif", "Sudip", "Amlan", "Manish"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(strings));
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void trimToSizeDemo() throws NoSuchFieldException, IllegalAccessException {
        List<Integer> list = new ArrayList<>(5);
        list.add(10);
        list.add(20);
        list.add(30);
        Field field = ArrayList.class.getDeclaredField("elementData");
        System.out.println(field.getName());
        System.out.println(((Object[]) field.get(list)).length);
        for (Integer value : list) {
            System.out.println(value);
        }

    }

    @Test
    public void listToSet() {
        List<String> list = new ArrayList<>(Arrays.asList("One", "Two", "Two", "Three"));
        // using for loop
        Set<String> stringSet1 = new HashSet<>();
        for (String x : list) {
            stringSet1.add(x);
        }
        System.out.println("Created HashSet is");
        for (String x : stringSet1) {
            System.out.println(x);
        }
        // using hashset constructor
        Set<String> stringSet2 = new HashSet<>(list);
        System.out.println("Created HashSet using constructor: ");
        for (String x : stringSet2) {
            System.out.println(x);
        }

        //using addAll method
        Set<String> stringSet3 = new HashSet<>();
        stringSet3.addAll(list);
        System.out.println("Created HashSet using addAll(): ");
        for (String x : stringSet3) {
            System.out.println(x);
        }

        //using stream
        Set<String> stringSet4 = list.stream().collect(Collectors.toSet());
        System.out.println("Created HashSet using stream(): ");
        stringSet4.forEach((a) -> System.out.println(a));
    }

    @Test
    public void trimDemo() {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        System.out.println("Size: " + list.size());
        // Trims the capacity of this ArrayList instance to be the list's current size.
        System.out.println(list.get(8));
        ((ArrayList<String>) list).trimToSize();

    }

    @Test
    public void compareTwoArrayList() {
        List<String> list1 = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g"));
        List<String> list2 = new ArrayList<>(Arrays.asList("a", "b", "d", "e", "f", "gg", "h"));

        List<String> sourceList = new ArrayList<>(list1);
        List<String> destinationList = new ArrayList<>(list2);

        sourceList.removeAll(list2);
        destinationList.removeAll(list1);

        System.out.println(sourceList);
        System.out.println(destinationList);
    }

    @Test
    public void indexOfDemo() {
        ArrayList<String> al = new ArrayList<>(Arrays.asList("P", "A", "S", "A", "M"));
        System.out.println(al.indexOf("D"));
        System.out.println(al.add("E"));

    }

}