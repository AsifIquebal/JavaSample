package com.company.collection;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Demo 
{

    @Test
    public void demo1() {
        int count[] = {34, 22, 10, 60, 30, 22};
        Set<Integer> my_set = new HashSet<Integer>();
        try {
            for (int i = 0; i < 5; i++) {
                my_set.add(count[i]);
            }
            System.out.println(my_set);

            TreeSet<Integer> sortedSet = new TreeSet<>(my_set);
            System.out.println("The sorted list is:");
            System.out.println(sortedSet);

            System.out.println("The First element of the set is: " + (Integer) sortedSet.first());
            System.out.println("The last element of the set is: " + (Integer) sortedSet.last());
        } catch (Exception e) {
        }
    }

    @Test
    public void demo2(){
        Set<Integer> set = new HashSet<>();
        for(int i=1; i<=5; i++){
            set.add(i);
        }
        for (int j=3; j<=7; j++ ){
            System.out.println("inserting " + j + ", result: " + set.add(j));
        }
        System.out.println(set);
    }

    @Test
    public void test(){
        Set<Integer> set = new HashSet<>();
        int a = 10;
        int b = 20;
        set.add(a);
        set.add(b);
        b = 10;
        System.out.println(set);

        b = 10;
        set.add(b);
        System.out.println(set);

    }

    @Test
    public void nullInHashSet(){
        Set<Integer> set = new HashSet<>();
        int a = 10;
        set.add(a);
        set.add(null);
        set.add(null);
        for(Integer s:set){
            System.out.println(s);
        }
    }


    // TreeSet doesn't allow even a single null element. On doing so Null Pointer Exception on run time will be thrown
    @Test
    public void nullInTreeSet(){
        Set<Integer> set = new TreeSet<>();
        int a = 10;
        set.add(a);
        set.add(null);
        set.add(null);
        for(Integer s:set){
            System.out.println(s);
        }
    }

} 