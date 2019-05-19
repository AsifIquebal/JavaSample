package com.company.inheritance;
class A3{
    int x = 100;
    String name = "Parent";
    String parent = "tag";
    // overridden method
    public static void m1(){
        System.out.println("Inside Parent Class");
        //System.out.println("x = " + x + ", name = " + name);
    }
}

class B3 extends A3{
    int x = 200;
    String name = "Child";
    //@Override
    // always use the @Override annotation, so that if in future the method changes in parent class, the annotation will let us know about it.
    // overriding method
    public static void m1(){
        System.out.println("Inside Child Class. Method Overridden.");
        //System.out.println("x = " + x + ", name = " + name);
    }
    public void m2(){
        System.out.println("Child. NOT Overridden.");
    }
}

public class MethodHiding {
    public static void main(String[] args) {
        A3 obj1 = new A3();
        // will call the overridden method, i.e., method of the parent class
        obj1.m1();
        System.out.println("---------------------");
        A3 obj = new B3();
        // method of parent class, as the reference type is of parent
        obj.m1();
        System.out.println("---------------------");
        B3 objOfB = new B3();
        objOfB.m1();
        System.out.println("---------------------");
        //obj.m2(); // Not Possible
        // so how to access it, the answer is Type Casting, Type Cast the object to child type
        B3 b = (B3)obj;
        b.m2();
        //B obj2 = new B();
        System.out.println("---------------------");
        b.m1();

    }
}
