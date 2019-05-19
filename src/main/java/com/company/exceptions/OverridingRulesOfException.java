package com.company.exceptions;

public class OverridingRulesOfException extends Super{
    public static void main(String[] args) {
        Super s = new Sub();
        s.a();
    }
}
class Super {
    void a(){ System.out.println("parent class"); }
    void b() { System.out.println("parent class"); }

}

class Sub extends Super{
    // If super class method does not declare any exception,
    // then sub class overridden method cannot declare checked exception but it can declare unchecked exceptions.
    // Allowed
    void a() throws ArrayIndexOutOfBoundsException {
        System.out.println("child class");
    }
    // CE, Not Allowed
    /*void b() throws IOException {
        System.out.println("parent class");
    }*/
}

