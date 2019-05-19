package com.company.inheritance;

class P1 {
    static {
        System.out.println("THIRD");
    }
}

class P2 extends P1 {
    static {
        System.out.println("SECOND");
    }
}

class P3 extends P2 {
    static {
        System.out.println("FIRST");
    }
}

public class StaticBlock {
    public static void main(String[] args) {
        P3 p3 = new P3();
    }
}