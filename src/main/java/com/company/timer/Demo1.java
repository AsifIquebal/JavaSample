package com.company.timer;

import org.testng.annotations.Test;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Demo1 {

    @Test
    public void givenUsingTimer_whenSchedulingTaskOnce_thenCorrect() throws InterruptedException {
        TimerTask task = new TimerTask() {
            public void run() {
                completeTask(1000);
                System.out.println("Task performed on: " + new Date()
                        + ", Thread's name: " + Thread.currentThread().getName());
            }
        };
        Timer timer = new Timer("Timer",true);
        long delay = 1000L;
        timer.scheduleAtFixedRate(task, delay, 1);
        Thread.sleep(delay * 4);
    }

    private void completeTask(long l) {
        try {
            System.out.println("complete task called...");
            Thread.sleep(l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenUsingExecutorService_whenSchedulingRepeatedTask_thenCorrect()
            throws InterruptedException {
        TimerTask repeatedTask = new TimerTask() {
            public void run() {
                System.out.println("Task performed on " + new Date());
            }
        };
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        long delay = 1000L;
        long period = 1000L;
        executor.scheduleAtFixedRate(repeatedTask, delay, period, TimeUnit.MILLISECONDS);
        //Thread.sleep(delay + period * 3);
        executor.shutdown();
    }

}
