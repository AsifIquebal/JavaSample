package com.company.multithreading;

class MyThread extends Thread {
    private String caller;
    public MyThread(String caller) {
        this.caller = caller;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(4000);
            System.out.println("Currently running Thread id: " + Thread.currentThread().getId());
            System.out.println("Caller : " + caller + ", code on this Thread is executed by: " + Thread.currentThread().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("GetName: " + Thread.currentThread().getName());



        MyThread myThread = new MyThread("thread1");
        myThread.start();
        myThread.join();
        System.out.println("Main method done");
        Thread t1 = new Thread(new MyThread("start"));
        Thread t2 = new Thread("hello");
        t2.start();
        System.out.println("GetName: " + t1.getName());
        Thread.currentThread().setName("changed name");
        System.out.println("GetName: " + t1.getName());
        Thread runThread = new Thread(new MyThread("run"));
        t1.start();
        //runThread.run();
    }
}
