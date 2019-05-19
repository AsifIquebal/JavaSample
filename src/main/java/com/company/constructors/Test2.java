package com.company.constructors;

class Test1 {

    Test1() {
        this(10);
        System.out.println("Parent Default Constructor");
    }
    Test1(int i) {
        this("Asif");
        System.out.println("Parent Parametric Integer: " + i);
    }
    Test1(String a) {
        System.out.println("Parent Parametric String: " + a);
    }
}

class Test2 extends Test1 {
    Test2() {
        //super(); // calling the parent default/ no-argument constructor
        // but we actually don't need that;
        // In Java, constructor of base class with no argument gets automatically called in derived class constructor.
        //super("Asif");
        System.out.println("Child Default");
    }

    Test2(int i) {
        this();
        System.out.println("Child parametric: " + i);
    }

    Test2(String a) {
        this(1);
        System.out.println("Child parametric : " + a);
    }

    public static void main(String[] args) {
        /*System.out.println("-----------------------------------------------");
        Test2 t2 = new Test2();
        System.out.println("-----------------------------------------------");
        Test2 test2 = new Test2(786);
        System.out.println("-----------------------------------------------");
        Test2 test21 = new Test2("PASAM");
        System.out.println("-----------------------------------------------");*/

        // invoke all the constructors of parent class
        Test2 t2 = new Test2();



    }
}
