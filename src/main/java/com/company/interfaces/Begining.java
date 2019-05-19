package com.company.interfaces;


import java.util.ArrayList;
import java.util.List;

interface BeginingInterface {
    int X = 10;

    public static void main(String[] args) {
        System.out.println("Hello, I am inside interface");
    }
}
public class Begining implements BeginingInterface{

    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.forEach(a-> System.out.println(a));
    }
}

abstract class MyAbsCls{
    public void m1() {
        System.out.println("Test");
    }

    public abstract void m2();


}