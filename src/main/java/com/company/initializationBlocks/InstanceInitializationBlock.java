package com.company.initializationBlocks;

public class InstanceInitializationBlock {

    int a = 10;
    final int b;

    {
        b = 100;
        System.out.println("Inside IIB 1");
    }

    public static void main(String[] args) throws InterruptedException {

        InstanceInitializationBlock obj = new InstanceInitializationBlock();
        System.out.println(obj.a);
        System.out.println(obj.b);

    }

    {
        System.out.println("Inside IIB 2");
    }

    // Instance Initialization Blocks or IIB are used to initialize instance variables
    // Initializer block contains the code that is always executed whenever an instance is created. It is used to
    // declare/initialize the common part of various constructors of a class.
    // We can also have multiple IIBs in a single class. If compiler finds multiple IIBs, then they all are executed from
    // top to bottom i.e. the IIB which is written at top will be executed first.
    //
}
