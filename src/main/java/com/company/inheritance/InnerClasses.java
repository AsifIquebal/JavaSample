package com.company.inheritance;

class OuterClass {
    int x=5;
    void methodOfOuterClass() {
        System.out.println("From OuterClass");
    }
    class InnerClassOne {
        int x = 10;
        void methodOfInnerClassOne() {
            System.out.println("From InnerClassOne");
        }
    }
    class InnerClassTwo extends InnerClassOne {
        //One Inner Class can extend another inner class
    }
    static class StaticInnerClassOne {
        //Class as a static member
    }
}
//Extending Static inner class or static nested class
class AnotherClassOne extends OuterClass.StaticInnerClassOne {
    //static nested class can be referred by outer class name,
}
//Extending non-static inner class or member inner class
class AnotherClassTwo extends OuterClass.InnerClassTwo {
    public AnotherClassTwo() {
        new OuterClass().super();  //accessing super class constructor through OuterClass instance
    }
}
class AnotherClass extends OuterClass {
    //Only fields and methods are inherited.
    // To use inner class properties: it's inner class must extend inner class of it's super class
    class AnotherInnerClass extends InnerClassOne {
        //Inner Class of AnotherClass extends Inner Class of OuterClass
    }
}
public class InnerClasses {
    public static void main(String args[]) {
        OuterClass outer = new OuterClass();   //Instantiating OuterClass
        OuterClass.InnerClassTwo innerTwo = outer.new InnerClassTwo();  //Instantiating InnerClassTwo
        System.out.println(innerTwo.x);    //Accessing inherited field x from InnerClassOne
        innerTwo.methodOfInnerClassOne();  //calling inherited method from InnerClassOne
        AnotherClass anotherClass = new AnotherClass();  //creating AnotherClass Object
        System.out.println(anotherClass.x);    //accessing inherited field x from OuterClass
        anotherClass.methodOfOuterClass();    //calling inherited method from OuterClass
        //Using the properties of InnerClass
        AnotherClass.AnotherInnerClass anotherInnerClass = anotherClass.new AnotherInnerClass();
        //creating object to AnotherInnerClass
        System.out.println(anotherInnerClass.x);  //accessing inherited field x from InnerClass
    }
}