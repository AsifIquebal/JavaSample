package com.company.inheritance;

/**
 * Created by user on 06-Jul-17.
 */

class Base {
    int i = 0;

    Base() {
        System.out.println("Base Class Constructor Called ");
        value();
    }

    public void value() {
        System.out.println("Base Class value method");
        i = i + 10;
    }

    public int display() {
        return i;
    }

    Base(int a) {
        System.out.println("Base Class Constructor Called ");
    }

}

class Derived extends Base {

    Derived() {
        //super(1,2);
        System.out.println("Derived Class Constructor Called ");
        value();
    }

    public void value() {
        System.out.println("Child value method");
        i = i + 20;
    }

    public int display() {
        return i;
    }

}

public class InheritanceConstructor_1 {
    public static void main(String[] args) {
        Base b = new Derived();
        //Derived d = (Derived) new Base();

        System.out.println(b.display());
    }

}


