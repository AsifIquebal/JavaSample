package com.company.inheritance;

/**
 * Created by user on 06-Jul-17.
 */

class Base {

    Base() {
        System.out.println("A Class Constructor Called ");
    }

    Base(int a) {
        System.out.println("A Class Constructor Called ");
    }

}

class Derived extends Base {

    Derived() {
        System.out.println("Derived Class Constructor Called ");
    }

}

public class InheritanceConstructor_1 {
    public static void main(String[] args) {
        Derived d = new Derived();
    }
}


