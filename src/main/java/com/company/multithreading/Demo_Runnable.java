package com.company.multithreading;


class RunnableThread1 implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("RunnableThread1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class RunnableThread2 implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("RunnableThread2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Demo_Runnable {
    public static void main(String[] args) {
        Runnable a = new RunnableThread1();
        Runnable b = new RunnableThread2();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();
    }
}


