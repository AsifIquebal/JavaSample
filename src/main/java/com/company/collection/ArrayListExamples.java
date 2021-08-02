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
    public void test_01() {
        List<String> list = new ArrayList<>();
        list.add("text1");
        list.add("text2");
        list.add(0, "1st element");
        list.add("1");
        list.add("1");
        System.out.println(list + " contains " + list.size() + " elements");
        System.out.println("Index of method [index of text2 element]: " + list.indexOf("text1"));
        int i = 0;
        while (i < list.size()) {
            System.out.println("Index: " + i + " Element: " + list.get(i));
            i++;
        }
        Iterator<String> list_iterator = list.iterator();
        while (list_iterator.hasNext()) {
            System.out.println(list_iterator.next());
        }
        Set<String> my_set = new HashSet<>(list);
        System.out.println("After converting to Set, the size is: " + my_set.size());
        System.out.println("Unique Values are as follows[order is not guaranteed in Set]: \n" + my_set);
    }

    @Test
    public void test_02() {
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
    public void trimToSizeDemo() throws NoSuchFieldException, IllegalAccessException {
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(10);list.add(20);list.add(30);
        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        System.out.println(field.getName());
        System.out.println("Length Before Trimming is: " + ((Object[]) field.get(list)).length);
        System.out.println(list);
        list.trimToSize();
        System.out.println(list);
        System.out.println("Length After Trimming is: " + ((Object[]) field.get(list)).length);
        //elementData.length;
    }

    @Test
    public void listToSet() {
        List<String> list = new ArrayList<>(Arrays.asList("One", "Two", "Two", "Three"));
        // using add method in for loop
        Set<String> stringSet1 = new HashSet<>();
        for (String x : list) {
            stringSet1.add(x);
        }
        System.out.println("Created HashSet is" + stringSet1);
        // using hashset constructor
        Set<String> stringSet2 = new HashSet<>(list);
        System.out.println("Created HashSet using constructor: " + stringSet2);
        //using addAll method
        Set<String> stringSet3 = new HashSet<>();
        stringSet3.addAll(list);
        System.out.println("Created HashSet using addAll(): " + stringSet3);
        //using stream
        Set<String> stringSet4 = list.stream().collect(Collectors.toSet());
        System.out.println("Created HashSet using stream(): ");
        stringSet4.forEach(System.out::println);
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
