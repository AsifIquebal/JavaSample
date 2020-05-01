package com.company.inheritance;

class M {
}

class N extends M {
}

class O {
    A fun() {
        System.out.println("Base fun()");
        return new A();
    }
}

class P extends O {
    B fun() {
        System.out.println("Derived fun()");
        return new B();
    }
}

public class Covariant {
    public static void main(String args[]) {
        O base = new O();
        base.fun();
        P derived = new P();
        derived.fun();
        O obj = new P();
        obj.fun();
    }
}