package com.company.multithreading;

public class JoinDemo01 {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            try {
                Thread.sleep(4000);
                System.out.println("Currently running Thread id: " + Thread.currentThread().getId());
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        Thread thread = new Thread(runnable,"asif");
        thread.start();
        System.out.println(thread.getName());
        thread.join();
        System.out.println("Main finishes");


    }
}
