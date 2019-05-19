package com.company.initializationBlocks;

class M {
    static {
        System.out.println('A');
    }
    {
        System.out.println('B');
    }
    public M() {
        System.out.println('C');
    }
}

class N extends M {
    static {
        System.out.println('D');
    }
    {
        System.out.println('E');
    }
    public N() {
        System.out.println('F');
    }
}

public class SequenceOrder {
    public static void main(String[] args) {
        N n = new N();
    }
}

/*
* Static Block of Parent Class [A] > Static Block of Child Class [D] > Instance Block of Parent
* Class [B] > Constructor of Parent Class [C] > Instance Block of Child Class [E]
* > Constructor of Child Class
*
* */