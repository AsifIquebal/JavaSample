package com.company.multithreading;


class Thread1 extends Thread{

    private String caller;
    public Thread1(String caller) {
        this.caller = caller;
    }

    @Override
    public void run(){
        try {
            System.out.println(" Currently running Thread id: " + Thread.currentThread().getId());
            System.out.println("Caller : " +caller+", code on this Thread is executed by: " + Thread.currentThread().getName());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
class Thread2 extends Thread{
    @Override
    public void run(){

        try {
            System.out.println(" Currently running Thread id: " + Thread.currentThread().getId());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

public class Demo1 {
    public static void main(String[] args) {
        /*int n = 8;
        for(int i=0; i<n; i++){
            Thread1 thread1 = new Thread1();
            thread1.start();
        }*/

        //creating two threads for start and run method call
        Thread startThread = new Thread(new Thread1("start"));
        Thread runThread = new Thread(new Thread1("run"));

        startThread.start();
        runThread.run();

    }
}
