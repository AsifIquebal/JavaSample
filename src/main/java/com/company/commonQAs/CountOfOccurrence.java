package com.company.commonQAs;

import org.testng.annotations.Test;

import java.util.*;

/**
 * Created by user on 27-Apr-17.
 */
public class CountOfOccurrence {
    @Test
    public void countStringCharacters(){
        CountOfOccurrence countOfOccurrence = new CountOfOccurrence();
        countOfOccurrence.forString("ababdzzy");
    }

    @Test
    public void countIntegers(){
        CountOfOccurrence countOfOccurrence = new CountOfOccurrence();
        int[] num = {1,2,2,1,3};
        countOfOccurrence.forInts(num);
    }

    @Test
    public void count3(){
        List<String> list = new ArrayList<>(Arrays.asList("1","2","3","1","2","4","5"));
        Map<String, Integer> map = new HashMap<>();
        for (String elem : list){
            int count = Collections.frequency(list, elem);
            if ( !map.containsKey(elem) ){
                map.put(elem, count);
            }
        }
        System.out.println(map);
    }
    public void forString(String text) {
        String str = text;
        int count = 0;
        char ch;
        for(char c='a'; c<='z'; c++){
            for(int j=0; j<str.length(); j++){
                ch = str.charAt(j);
                if (ch==c){
                    count = count + 1;
                }
            }
            if(count != 0){
                System.out.println(c + ": " + count);
            }
            count = 0;
        }
    }
    public void forInts(int[] numbers) {
        int[] array = numbers;
        int count = 0;
        int num;
        for(int i=0; i<=9; i++){
            for(int j=0; j<array.length; j++){
                num = array[j];
                if (num==i){
                    count = count + 1;
                }
            }
            if(count != 0){
                System.out.println(i + ": " + count);
            }
            count = 0;
        }
    }


}
