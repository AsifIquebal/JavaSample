package com.company.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;

public class ParallelStreamDemo {

    public static void main(String[] args) {

        long t1, t2;
        List<Employee> eList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            eList.add(new Employee("A", 20));
            eList.add(new Employee("B", 30));
            eList.add(new Employee("C", 15));
            eList.add(new Employee("D", 78));
            eList.add(new Employee("E", 12));
            eList.add(new Employee("F", 50));
        }

        t1 = System.currentTimeMillis();
        System.out.println("Stream Count: " + eList.stream().filter(e -> e.getSalary() > 15).count());

        t2 = System.currentTimeMillis();
        System.out.println("Sequential Stream Time: " + (t2 - t1) + "\n");

        t1 = System.currentTimeMillis();
        System.out.println("Stream Count: " + eList.parallelStream().filter(e -> e.getSalary() > 15).count());

        t2 = System.currentTimeMillis();
        System.out.println("Parallel Stream Time: " + (t2 - t1));



        t1 = System.currentTimeMillis();

        ForkJoinPool forkJoinPool = new ForkJoinPool(4);
        Thread thread1 = new Thread(() -> forkJoinPool.submit(
                () -> {
                    eList.parallelStream().filter(e -> e.getSalary() > 15).count();
                }).invoke());
        thread1.start();

        t2 = System.currentTimeMillis();
        System.out.println("ForkJoinPool Stream Time: " + (t2 - t1));




    }
}
