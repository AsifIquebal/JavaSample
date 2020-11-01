package com.company.multithreading;

class Thread1 extends Thread {

    private String caller;

    public Thread1(String caller) {
        this.caller = caller;
    }

    @Override
    public void run() {
        try {
            System.out.println("Currently running Thread id: " + Thread.currentThread().getId());
            System.out.println("Caller : " + caller + ", code on this Thread is executed by: " + Thread.currentThread().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*@Override
    public void run(){
        System.out.println("Argumented run() method...");
    }*/
}

class Thread2 extends Thread {
    @Override
    public void run() {

        try {
            System.out.println(" Currently running Thread id: " + Thread.currentThread().getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("GetName: " + Thread.currentThread().getName());

        Thread startThread = new Thread(new Thread1("start"));
        System.out.println("GetName: " + startThread.getName());

        Thread.currentThread().setName("changed name");
        System.out.println("GetName: " + startThread.getName());
        Thread runThread = new Thread(new Thread1("run"));
        startThread.start();
        //runThread.run();

    }
}
