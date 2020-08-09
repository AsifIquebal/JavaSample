package com.company.variablesAndMethods;

public class StaticAndInstance {

    int i = 100;
    static int s = 200;

    void method1(){
        System.out.println("Instance variable value [i]: " + i);
        System.out.println("Class variable value [s]: " + s);
    }

    static void method2(){
        // Non Static field 'i' can not be referenced from a static context
        // System.out.println("Instance variable value [i]: " + i);
        System.out.println("Class variable value [s]: " + s);
    }


    public static void main(String[] args) {
        StaticAndInstance obj1 = new StaticAndInstance();
        StaticAndInstance obj2 = new StaticAndInstance();
        StaticAndInstance obj3 = new StaticAndInstance();

        System.out.println(obj1.i + " " + obj1.s);

        obj1.i++; StaticAndInstance.s++;
        System.out.println(obj1.i + " " + obj1.s);
        System.out.println(obj2.i + " " + obj2.s);
        System.out.println(obj3.i + " " + obj3.s);



    }
}
