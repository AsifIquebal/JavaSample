package com.company.lambda.completableFuture;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class Demo1 {

    /*The getNow(null) returns the result if completed (which is obviously the case),otherwise returns null (the argument).
     *
     *
     * */
    @Test
    static void completedFutureExample() {
        CompletableFuture<String> cf = CompletableFuture.completedFuture("message");
        Assert.assertTrue(cf.isDone());
        Assert.assertEquals("message", cf.getNow(null));
    }

    @Test
    static void runAsyncExample() {
        CompletableFuture<Void> cf = CompletableFuture.runAsync(() -> {
            Assert.assertTrue(Thread.currentThread().isDaemon());
            randomSleep();
        });
        Assert.assertFalse(cf.isDone());
        sleepEnough();
        Assert.assertTrue(cf.isDone());
    }

    static Random random = new Random();

    private static void randomSleep() {
        try {
            Thread.sleep(random.nextInt(1000));
        } catch (InterruptedException e) {
            // ...
        }
    }

    private static void sleepEnough() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // ...
        }
    }

    @Test
    static void thenApplyExample() {
        CompletableFuture<String> cf = CompletableFuture.completedFuture("message").thenApply(s -> {
            Assert.assertFalse(Thread.currentThread().isDaemon());
            return s.toUpperCase();
        });
        Assert.assertEquals("MESSAGE", cf.getNow(null));
    }







}
