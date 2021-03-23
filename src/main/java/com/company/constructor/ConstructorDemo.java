package com.company.constructor;

import java.io.IOException;

public class ConstructorDemo {
    public ConstructorDemo() {
        System.out.println("Inside no argument constructor");
    }

    public ConstructorDemo(String name) {
        System.out.println("Inside one argument constructor in Java with name: " + name);
    }

    public static void main(String args[]) throws IOException {
        ConstructorDemo d = new ConstructorDemo(); //calling no argument constructor in java
        ConstructorDemo e = new ConstructorDemo("Testing"); //calling one argument constructor in java

    }

}

