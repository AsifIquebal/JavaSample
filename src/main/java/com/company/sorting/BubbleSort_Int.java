package com.company.sorting;

public class BubbleSort_Int {
    public static void main(String args[]) {
        BubbleSort_Int ob = new BubbleSort_Int();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Element count: " + arr.length);
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }

    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}