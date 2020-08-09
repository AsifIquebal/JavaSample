package com.company.inheritance;

class A2 {
    String s = "Class A";
}

class B2 extends A2 {
    String s = "Class B";
    {
        System.out.println(super.s);
    }
}

class C2 extends B2 {
    String s = "Class C";
    {
        System.out.println(super.s);
    }
}

public class MainClass1 {
    public static void main(String[] args) {
        C2 c = new C2();
        System.out.println(c.s);
    }
}

