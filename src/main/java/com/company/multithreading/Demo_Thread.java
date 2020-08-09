package com.company.multithreading;

import java.time.Duration;
import java.time.Instant;

class A extends Thread{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("A");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("B");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Demo_Thread {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        B b = new B();
        Instant start = Instant.now();

        a.start();
        b.start();
        a.join();
        b.join();
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Time taken: "+ timeElapsed.toMillis() +" milliseconds");
    }
}
