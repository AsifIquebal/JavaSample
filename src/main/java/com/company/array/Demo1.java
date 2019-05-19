package com.company.array;

import org.testng.annotations.Test;

import java.util.HashSet;

public class Demo1 {
    @Test
    public void t1(){
        int i = 4;
        int ia[][][]=new int[i][i=3][i];
        System.out.println(ia.length);
        System.out.println(ia[0].length);
        System.out.println(ia[0][0].length);

    }

    @Test
    public void intersectionAndUnion(){
        int nums1[] = {1,2,3,4,5,6,7,8,9};
        int nums2[] = {12,11,10,7,8,6};
        HashSet<Integer> set1 = new HashSet<>();
        for(int i: nums1){
            set1.add(i);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for(int i: nums2){
            if(set1.contains(i)){
                set2.add(i);
            }
        }

        System.out.println("Intersection: " + set2);

        for(int i: nums2){
            set1.add(i);
        }
        System.out.println("Union: " +set1);

        System.out.println("-----------------");
        int[] result = new int[set2.size()];
        int i=0;
        for(int n: set2){
            result[i++] = n;
        }
        for(int x=0;x<result.length;x++){
            System.out.print(result[x]+" ");
        }
    }

}
