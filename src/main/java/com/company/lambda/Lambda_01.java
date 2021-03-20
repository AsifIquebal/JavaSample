package com.company.lambda;

import org.testng.annotations.Test;

public class Lambda_01 {

    class IHaveTheMethodImplemented implements Hello {
        @Override
        public void method() {
            System.out.println("Hola, am the implemented method of Functional Interface...");
        }
    }
    class ArgumentedNow implements HelloWithParam {
        @Override
        public void method(int i) {
            System.out.println("Implemented method of Functional Interface, with parameter as: " + i);
        }
    }
    public void callMethod(Hello hello) {
        hello.method();
    }
    public void callMethod2(HelloWithParam helloWithParam, int i) {
        helloWithParam.method(i);
    }
    @Test
    public void withTheClassWhichImplementsTheMethodOfTheFunctionalInterface() {
        Lambda_01 lambda_01 = new Lambda_01();
        lambda_01.callMethod(new IHaveTheMethodImplemented());
        lambda_01.callMethod2(new ArgumentedNow(), 10);
    }

    // here it is with anonymous inner class
    @Test
    public void anonymousInnerClass() {
        Lambda_01 lambda_01 = new Lambda_01();
        lambda_01.callMethod(new Hello() {
            public void method() {
                System.out.println("Anonymous Inner Class");
            }
        });
        lambda_01.callMethod2(new HelloWithParam() {
            public void method(int i) {
                System.out.println("Anonymous Inner Class with argument: " + i);
            }
        }, 10);
        // other flavor

        Hello hello = new Hello() {
            public void method() {
                System.out.println("Demo Bob");
            }
        };
        hello.method();

    }

    // now change the anonymous inner class to lambda
    @Test
    public void withLambdaExpression() {
        Lambda_01 lambda_01 = new Lambda_01();
        lambda_01.callMethod(() -> System.out.println("with Lambda Expression..."));

        Hello h = () -> System.out.println("Hi Asif");
        h.method();
    }

    @Test
    public void lambda_02() {
        StringLengthLambda myLambDa = (str) -> str.length();
        System.out.println(myLambDa.getLength("Asif"));
        StringLengthLambda myLambDa1 = String::length;
        System.out.println(myLambDa1.getLength("Asif Iquebal Sarkar"));
        // if there is only one input argument you don't need to have the parenthesis
        StringLengthLambda m = s -> s.length();
        System.out.println(m.getLength("PASAM"));

    }

    @Test
    public void lambda_03() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printed inside of runnable");
            }
        });
        thread.run();

        Thread thread1 = new Thread(() -> System.out.println("Demo"));
        thread1.run();

    }

    @Test
    public void basic() {
        // Multiple parameters in lambda expression
        Addition ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(10, 20));

        // Multiple parameters with data type in lambda expression
        Addition ad2 = (int a, int b) -> (a + b);
        System.out.println(ad2.add(100, 200));

        Multiplication multiplication = (a, b) -> (a * b);
        System.out.println(multiplication.multiply(10, 20));

        Arithmatic arithmatic = (a, b) -> (a + b);
        System.out.println(arithmatic.math(1, 2));

        Arithmatic arithmatic1 = (a, b) -> (a - b);
        System.out.println(arithmatic1.math(10, 2));

        Arithmatic arithmatic2 = (a, b) -> (a % b);
        System.out.println(arithmatic2.math(10, 2));
    }
}

@FunctionalInterface
interface Hello {
    void method();
}
@FunctionalInterface
interface HelloWithParam {
    void method(int i);
}
@FunctionalInterface
interface StringLengthLambda {
    int getLength(String s);
}

@FunctionalInterface
interface Addition {
    int add(int a, int b);
}

@FunctionalInterface
interface Multiplication {
    int multiply(int a, int b);
}

@FunctionalInterface
interface Arithmatic {
    int math(int a, int b);
}

