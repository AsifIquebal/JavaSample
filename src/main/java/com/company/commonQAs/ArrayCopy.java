package com.company.commonQAs;

import java.util.Arrays;

/**
 * Created by user on 20-Dec-16.
 */
public class ArrayCopy {
    public static void main(String[] args) {
        int[] scores = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(scores));
        System.arraycopy(scores,2,scores,3,2);
        System.out.println(Arrays.toString(scores));
        for(int i: scores){
            System.out.println(i);
        }
    }
}
