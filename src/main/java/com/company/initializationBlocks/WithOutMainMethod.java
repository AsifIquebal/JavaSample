package com.company.initializationBlocks;

public class WithOutMainMethod {
    static {
        NOMain:{
            System.out.println("Hello World");
        }
        System.out.println("Hello World");
        System.exit(0);
    }

}
