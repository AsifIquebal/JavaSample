package com.company.commonlyasked;

import java.util.HashMap;
import java.util.Map;

public class CountRepeats {
    public static void main(String[] args) {
        int nums[] = {655, 578, 786};
        Map<Character, Integer> map = new HashMap<>();

        for (int i=0; i<nums.length; i++){
            char[] n = String.valueOf(nums[i]).toCharArray();

            for(int j=0; j <n.length; j++){
                if(map.containsKey(n[j])){
                    map.put(n[j],map.get(n[j])+1);
                }
                else {
                    map.put(n[j],1);
                }
            }
        }
        System.out.println(map);
    }

}
