package com.company.inheritance;
class A{
    int x = 100;
    String name = "Parent";
    String parent = "tag";
    // overridden method
    public void m1(){
        System.out.println("Inside Parent Class");
        System.out.println("x = " + x + ", name = " + name);
    }

}
class B extends A {
    int x = 200;
    String name = "Child";

    @Override
    // always use the @Override annotation, so that if in future the method changes in parent class, the annotation will let us know about it.
    // overriding method
    public void m1(){
        System.out.println("Inside Child Class.");
        System.out.println("x = " + x + ", name = " + name);

    }
    public void m2(){
        //super.m1();
        System.out.println("Child. NOT Overridden.");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        A obj1 = new A();
        // will call the overridden method, i.e., method of the parent class
        obj1.m1();
        System.out.println("---------------------");
        A obj = new B();
        // will call the overriding method, i.e., the method of the child class which overrides the method of the parent class
        obj.m1();
        System.out.println("---------------------");
        //obj.m2(); Not Possible
        // so how to access it, the answer is Type Casting, Type Cast the object to child type
        B b = (B)obj;
        b.m2();
        //B obj2 = new B();
        System.out.println("---------------------");
        b.m1();
        System.out.println("---------------------");
        // simple use of super
        B b1 = new B();
        // this will call the overriding method
        b1.m1();
        System.out.println("---------------------");

    }
}




