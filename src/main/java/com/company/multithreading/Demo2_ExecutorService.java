package com.company.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo2_ExecutorService {
    public static void main(String[] args) {
        // create the pool
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        // submit the task for execution
        for(int i=0; i<1; i++){
            executorService.execute(new Task());
        }
        System.out.println("Thread Name: " + Thread.currentThread().getName());
        executorService.shutdown();

        //
        int coreCount = Runtime.getRuntime().availableProcessors();
        System.out.println("Core Count: " + coreCount);
        ExecutorService executorService1 = Executors.newFixedThreadPool(coreCount);
        for(int i=0; i<100; i++){
            executorService1.execute(new Task());
        }
        System.out.println("Thread Name: " + Thread.currentThread().getName());
        executorService1.shutdown();
    }
}
