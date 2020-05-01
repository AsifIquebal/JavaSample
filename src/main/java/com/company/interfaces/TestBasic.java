package com.company.interfaces;

interface I1 {
    static void main(String[] args) {
        System.out.println("Test");
    }

    String m1(String string);

}
class X implements I1{
    @Override
    public String m1(String string) {
        return string.toUpperCase();
    }
}

class Y implements I1{
    @Override
    public String m1(String string) {
        return string.toLowerCase();
    }
}

public class TestBasic{
    public static void main(String[] args) {
        I1 x = new X();
        System.out.println(x.m1("hello"));
        I1 y = new Y();
        System.out.println(y.m1("HELLO"));
    }


}
