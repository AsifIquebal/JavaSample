package com.company.collection;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class Iterator_Demo {


    @Test
    public void test1(){
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(11,12,13,14,15));
        Iterator<Integer> integerIterator = list.iterator();
        while (integerIterator.hasNext()){
            if (integerIterator.next()%2 != 0){
                integerIterator.remove();
            }
        }
        System.out.println(list);
    }

    //Example of Fail-Safe Iterator which does not create separate copy
    @Test
    public void failSafe(){
        // import java.util.concurrent.ConcurrentHashMap;
        // Creating a ConcurrentHashMap
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
        map.put("ONE", 1);
        map.put("TWO", 2);
        map.put("THREE", 3);
        map.put("FOUR", 4);
        // Getting an Iterator from map
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            String key = (String)it.next();
            System.out.println(key + " : " + map.get(key));
            // This will reflect in iterator.
            // Hence, it has not created separate copy
            map.put("SEVEN", 7);
        }
    }

}
