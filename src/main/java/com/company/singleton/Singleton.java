package com.company.singleton;

public class Singleton {

    private static Singleton soleInstance = new Singleton();

    private Singleton(){
        System.out.println("Creating...");
    }

    public static Singleton getInstance(){
        return soleInstance;
    }
}

class TestClass{
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        print("s1", s1);
        print("s2", s2);
    }

    private static void print(String name, Singleton object) {
        System.out.println(String.format("Object: %s, HashCode: %d", name, object.hashCode()));
    }
}
