package com.company.lambda;

import org.testng.annotations.Test;

public class Lambda_02 {

    // here is a anonymous inner class
    @Test
    public void anonymousInnerClass(){

        Hello hello = new Hello(){
            public void method(){
                System.out.println("Hello Bob");
            }
        };
        hello.method();
    }

    // now change the anonymous inner class to lambda
    @Test
    public void lambda_01(){
        Hello h = ()-> System.out.println("Hi Asif");
        h.method();
    }

    @Test
    public void lambda_02(){
        StringLengthLambda myLambDa = (str)-> str.length();
        System.out.println(myLambDa.getLength("Asif"));
        StringLengthLambda myLambDa1 = String::length;
        System.out.println(myLambDa1.getLength("Asif Iquebal Sarkar"));
        // if there is only one input argument you don't need to have the parenthesis
        StringLengthLambda m = s->s.length();
        System.out.println(m.getLength("PASAM"));

    }

    @Test
    public void lambda_03(){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printed inside of runnable");
            }
        });
        thread.run();

        Thread thread1 = new Thread(()-> System.out.println("Hello"));
        thread1.run();

    }

    @Test
    public void basic(){
        // Multiple parameters in lambda expression
        Addition ad1 = (a,b)->(a+b);
        System.out.println(ad1.add(10,20));

        // Multiple parameters with data type in lambda expression
        Addition ad2 = (int a,int b)->(a+b);
        System.out.println(ad2.add(100,200));

        Multiplication multiplication = (a,b) -> (a*b);
        System.out.println(multiplication.multiply(10,20));

        Arithmatic arithmatic = (a,b) -> (a+b);
        System.out.println(arithmatic.math(1,2));

        Arithmatic arithmatic1 = (a,b) -> (a-b);
        System.out.println(arithmatic1.math(10,2));

        Arithmatic arithmatic2 = (a,b) -> (a%b);
        System.out.println(arithmatic2.math(10,2));
    }
}

@FunctionalInterface
interface Hello{
    void method();
    // we added the annotation @FunctionalInterface so that when anyone else
    // tries to add another method declaration it throws an error and
    // prevent the same
}

@FunctionalInterface
interface StringLengthLambda{
    int getLength(String s);
}

@FunctionalInterface
interface Addition{
    int add(int a, int b);
}

@FunctionalInterface
interface Multiplication{int multiply(int a, int b);}

@FunctionalInterface
interface Arithmatic{int math(int a, int b);}

