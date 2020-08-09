package com.company.multithreading;

import org.testng.annotations.Test;

public class Demo_Runnable_8 {

    public static void main(String[] args) {

        Runnable a = ()->{
                for(int i=0;i<5;i++){
                    System.out.println("RunnableThread1");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };

        Runnable b = ()->{
            for(int i=0;i<5;i++){
                System.out.println("RunnableThread2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();
    }

    @Test
    public void RunDemo2(){

        Thread t1 = new Thread(()->{
            for(int i=0;i<5;i++){
                System.out.println("RunnableThread1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"Asus Thread1");
        Thread t2 = new Thread(()->{
            for(int i=0;i<5;i++){
                System.out.println("RunnableThread2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Asus Thread 2");

        t1.start();
        t2.start();
        System.out.println(t1.getName()+ ", " + t2.getName());
    }
}
