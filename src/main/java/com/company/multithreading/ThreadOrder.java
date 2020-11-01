package com.company.multithreading;

import org.testng.annotations.Test;

public class ThreadOrder {
    public static char ch = 65;

    private static void createAndStartThreads(int count) {
        Object lock = new Object();
        for (int i = 0; i < count; i++) {
            new Thread(new ParallelTask((char) (65 + i), lock)).start();
        }

    }

    @Test
    public void keepingOrderByJoin() {
        /*ParallelTask task1 = new ParallelTask(1);
        ParallelTask task2 = new ParallelTask(2);
        ParallelTask task3 = new ParallelTask(0);

        Thread t1 = new Thread(task1, "Thread-1");
        Thread t2 = new Thread(task2, "Thread-2");
        Thread t3 = new Thread(task3, "Thread-3");

        t1.start();
        t2.start();
        t3.start();*/

        createAndStartThreads(4);

    }

    private static class ParallelTask implements Runnable {

        Thread t;

        /*ParallelTask(Thread t){
            this.t = t;
        }*/

        /*@Override
        public void run() {
            System.out.println("Started: " + Thread.currentThread().getName());
            if (t != null) {
                try {
                    t.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Finished: " + Thread.currentThread().getName());
        }*/

        public int PRINT_NUMBERS_UPTO = 10;
        static int number = 1;
        int remainder;

        //static Object lock=new Object();
        public ParallelTask(int remainder) {
            this.remainder = remainder;
        }

        /*@Override
        public void run() {
            while (number < PRINT_NUMBERS_UPTO-1) {
                synchronized (lock) {
                    while (number % 3 != remainder) { // wait for numbers other than remainder
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + " " + number);
                    number++;
                    lock.notifyAll();
                }
            }
        }*/
        private char ch;
        private Object lock;
        private static int runnerCount;

        public ParallelTask(char ch, Object lock) {
            this.ch = ch;
            this.lock = lock;
            runnerCount++;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    while (ch != ThreadOrder.ch) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(ThreadOrder.ch++);
                    if (ThreadOrder.ch == (65 + runnerCount)) {
                        ThreadOrder.ch = 65;
                    }
                    lock.notifyAll();
                }
            }
        }

    }

}