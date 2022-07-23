package com.company.multithreading;

public class GFG {

    public static void main(String[] args) {
        N = 10;
        GFG mt = new GFG();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                mt.printEvenNumber();
            }
        });
        Thread t2 = new Thread(mt::printOddNumber);
        t1.start();
        t2.start();
    }

    // Starting counter
    int counter = 1;
    static int N;

    public void printOddNumber() {
        synchronized (this) {
            // Print number till the N
            while (counter < N) {
                // If count is even then print
                while (counter % 2 == 0) {
                    // Exception handle
                    try {
                        wait();
                    } catch (
                            InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // Print the number
                System.out.print(counter + " ");
                // Increment counter
                counter++;
                // Notify to second thread
                notify();
            }
        }
    }

    public void printEvenNumber() {
        synchronized (this) {
            // Print number till the N
            while (counter < N) {
                // If count is odd then print
                while (counter % 2 == 1) {
                    // Exception handle
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print(counter + " ");
                // Increment counter
                counter++;
                // Notify to 2nd thread
                notify();
            }
        }
    }


}
