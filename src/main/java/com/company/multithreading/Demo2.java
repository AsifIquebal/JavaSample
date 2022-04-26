package com.company.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo2 {
    public static void main(String[] args) {

        // submit the task for execution
        for(int i=0; i<10; i++){
            Thread thread = new Thread(new Task());
            thread.start();
        }
        System.out.println("Thread Name: " + Thread.currentThread().getName());
    }
}
class Task implements Runnable{
    public void run(){
        System.out.println("Thread Name: " + Thread.currentThread().getName());
    }
}
