package com.company.initializationBlocks;

public class WithOutMainMethod {
    static {
        NOMain:{
            System.out.println("Demo World");
        }
        System.out.println("Demo World");
        System.exit(0);
    }

}
