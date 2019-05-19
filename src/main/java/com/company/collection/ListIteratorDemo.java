package com.company.collection;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by user on 02-May-17.
 */
public class ListIteratorDemo {

    @Test
    public void testForListIterator(){
        List<String> list = new ArrayList<>(Arrays.asList("a","b","c","d"));
        ListIterator<String> listIterator = list.listIterator();
        System.out.println("Has Next");
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println("Has Previous");
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
