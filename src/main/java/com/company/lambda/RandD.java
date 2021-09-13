package com.company.lambda;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class RandD {

    @Test
    public void test1(){
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1,"ABC");map1.put(2,"DEF");map1.put(3,"GHI");
        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1,"ABC");map2.put(2,"XYZ");map2.put(3,"GHI");

        System.out.println(map1.equals(map2));

        map1.forEach((k,v)->{
            //System.out.println("Item : " + k + " Count : " + v);
            System.out.println("key " + k + ": "
                    + map1.get(k).equals(map2.get(k)));
            /*if("E".equals(k)){
                System.out.println("Demo E");
            }*/
        });
    }




}
