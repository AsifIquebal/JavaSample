package com.company.commonlyasked;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class InterviewSet1 {

    //region Fibonacci numbers
    @Test
    public void printFibonacci() {
        int i = 8; // generating upto 8th character
        int num1 = 0, num2 = 1, nextNum;
        System.out.print(num1 + " " + num2);
        for (int x = 2; x < i; x++) {
            nextNum = num1 + num2;
            System.out.print(" " + nextNum);
            num1 = num2;
            num2 = nextNum;
        }
    }

    @Test
    public void fibonacciUsingDP() {
        int n = 8;
        int[] num = new int[8];
        num[0] = 0;
        num[1] = 1;
        for (int i = 2; i < n; i++) {
            num[i] = num[i - 1] + num[i - 2];
        }
        Arrays.stream(num).forEach(x -> System.out.print(x + " "));
    }

    //endregion

    @Test
    public void moveZerosToEnd() {
        int[] array = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int i = 0, j = 0;
        while (i < array.length) {
            if (array[i] != 0) {
                int temp = array[j];
                array[j++] = array[i];
                array[i] = temp;
            }
            i++;
        }
        System.out.println(Arrays.toString(array));
    }

    @Test
    public void findSummationPairs(){
        int[] nums = {3,5,7,10,12};
        int sum = 17;
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            int temp = sum - num;
            if(set.contains(temp)){
                System.out.println("Pair found for sum " + sum + "(" + temp + "," + num+")");
            }
            set.add(num);
        }
    }
}
