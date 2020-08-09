package com.company.inheritance;

class A1 {
    int i = 10;

    public void m() {
        System.out.println("in A");
    }

    A1() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Datamember:  " + i + ", getValue(): " + getValue();
    }

    public int getValue() {
        return i;
    }
}

class B1 extends A1 {
    int i = 20;

    B1() {
        System.out.println(this);
    }

    public void m() {
        System.out.println("in B");
    }

    public int getValue() {
        return i;
    }
}

public class MainClass {
    public static void main(String[] args) {
        A1 a = new B1();
        //System.out.println(a.i);
        //a.m();
    }
}

/*
    Method is overridden not the datamembers, so runtime polymorphism can’t be achieved by data members.
    Since you are accessing the datamember which is not overridden, hence it will access the datamember
    of Parent class always.
*/


