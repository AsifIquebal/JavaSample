package com.company.multithreading;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ThreadPrevention {

    @Test
    public void givenStartedThread_whenJoinCalled_waitsTillCompletion() throws InterruptedException {
        Thread t2 = new SampleThread(1);
        t2.start();
        System.out.println("Invoking join");
        t2.join();
        System.out.println("Returned from join");
        Assert.assertFalse(t2.isAlive());
    }

    @Test
    public void givenStartedThread_whenTimedJoinCalled_waitsUntilTimedout() throws InterruptedException {
        Thread t3 = new SampleThread(10);
        t3.start();
        t3.join(1000);
        Assert.assertTrue(t3.isAlive());
    }



}

class SampleThread extends Thread {
    public int processingCount = 0;

    SampleThread(int processingCount) {
        this.processingCount = processingCount;
        System.out.println("Thread Created");
    }

    @Override
    public void run() {
        System.out.println("Thread " + this.getName() + " started");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (processingCount > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread " + this.getName() + " interrupted");
            }
            processingCount--;
        }
        System.out.println("Thread " + this.getName() + " exiting");
    }
}