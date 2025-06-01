package com.company.ds;

import org.testng.annotations.Test;

import java.util.Arrays;

public class SelectionSort {

    @Test
    public void selectionSortTest() {
        int[] a = {21,3,43,1,4};
        selectionSort(a);
    }

    public void selectionSort(int[] a){
        int minValue, minIndex, temp=0;
        for(int i=0; i<a.length; i++){
            minValue = a[i];
            minIndex = i;
            for(int j=i; j<a.length; j++){
                if(a[j] < minValue){
                    minValue = a[j];
                    minIndex = j;
                }
            }
            if(minValue<a[i]){
                temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
        }
        Arrays.stream(a).forEach(x -> System.out.print(x + " "));
    }

}