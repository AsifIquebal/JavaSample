package com.company.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionClassDemo {

    public static void main(String[] args) {
        //Converting array to ArrayList
        String[] ary = {"D","F","I","Y","V","D","W","B","A"};
        ArrayList<String> al = new ArrayList<>();
        Collections.addAll(al, ary);
        System.out.println("Before Sorting: "+al);
        //Ascending order Sorting
        Collections.sort(al);
        System.out.println("After Sorting: "+al);
        // Descending order Sorting
        ArrayList<String> al2 = new ArrayList<String>(Arrays.asList("Picasso", "Asif", "Sudip", "Amlan", "Manish"));
        System.out.println("Before Sorting: "+al2);
        Collections.sort(al2, Collections.reverseOrder());
        //Collections.reverse(al);
        System.out.println("After Reverse Sorting: "+al2);

        String max = Collections.max(al);
        System.out.println("Max of the list: " + max);

        Integer[] ary1 = {1,3,7,3,1,4,9};
        ArrayList<Integer> al1 = new ArrayList<>();
        Collections.addAll(al1, ary1);
        System.out.println("Max of Integer Array: "+ Collections.max(al1));
        System.out.println("Max of Integer Array: "+ Collections.min(al1));

        System.out.println("Max of Integer Array: "+ Collections.frequency(al1,1));

    }
}
